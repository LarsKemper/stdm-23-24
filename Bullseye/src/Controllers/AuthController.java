package Controllers;

import Entities.Archer;
import Services.DAL;
import Utils.Gender;
import Utils.MemberStatus;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

public class AuthController {
    private final Connection connection;

    public AuthController(DAL dal) {
        this.connection = dal.getConnection();
    }

    public Archer register(Archer newMember) throws SQLException {
        String sql = "INSERT INTO member (firstname, lastname, birthday, gender, address, license, is_active, has_insurance) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, newMember.getFirstname());
        statement.setString(2, newMember.getLastname());
        statement.setDate(3, new Date(newMember.getBirthday().getTime()));
        statement.setString(4, newMember.getGender().name());
        statement.setString(5, newMember.getAddress());
        statement.setBoolean(6, false);
        statement.setBoolean(7, false);
        statement.setBoolean(8, newMember.getHasInsurance());

        int rowsInserted = statement.executeUpdate();

        if (rowsInserted <= 0) {
            throw new SQLException("Member not inserted");
        }

        newMember.setId(statement.getGeneratedKeys().getInt(1));
        statement.close();

        return newMember;
    }

    public void accept(int memberId) throws SQLException {
        String sql = "SELECT * FROM member WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, memberId);

        ResultSet result = statement.executeQuery();

        if (!result.next()) {
            throw new SQLException("Member not found");
        }

        sql = "UPDATE member SET is_active = true WHERE id = ?";
        statement = connection.prepareStatement(sql);

        statement.setInt(1, memberId);

        int rowsUpdated = statement.executeUpdate();

        if (rowsUpdated <= 0) {
            throw new SQLException("Member not updated");
        }

        statement.close();
    }

    public Archer login(int memberId) throws SQLException {
        String sql = "SELECT * FROM member WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, memberId);

        ResultSet result = statement.executeQuery();

        if (!result.next()) {
            throw new SQLException("Member not found");
        }

        if (!result.getBoolean("is_active")) {
            throw new SQLException("Member is not active");
        }

        String firstname = result.getString("firstname");
        String lastname = result.getString("lastname");
        Date birthday = result.getDate("birthday");
        Gender gender = Gender.valueOf(result.getString("gender"));
        String address = result.getString("address");
        MemberStatus status = MemberStatus.valueOf(result.getString("status"));
        boolean isActive = result.getBoolean("is_active");
        boolean hasInsurance = result.getBoolean("has_insurance");

        Archer archer = new Archer(firstname, lastname, birthday, gender, address, status, isActive, hasInsurance);
        archer.setId(memberId);
        statement.close();

        return archer;
    }
}
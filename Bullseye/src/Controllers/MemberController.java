package Controllers;

import Services.MemberService;
import Services.DAL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberController {
    private final MemberService memberService;
    private final Connection connection;

    public MemberController(DAL dal) {
        this.memberService = new MemberService(dal);
        this.connection = dal.getConnection();
    }

    public void changeActive(int memberId, boolean isActive) throws SQLException {
        this.memberService.getMember(memberId);

        String sql = "UPDATE member SET is_active = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setBoolean(1, isActive);
        statement.setInt(2, memberId);

        int rowsUpdated = statement.executeUpdate();

        if (rowsUpdated <= 0) {
            throw new SQLException("Member not updated");
        }

        statement.close();
    }

    public void changeLicense(int memberId, boolean hasLicense) throws SQLException {
        this.memberService.getMember(memberId);

        String sql = "UPDATE member SET license = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setBoolean(1, hasLicense);
        statement.setInt(2, memberId);

        int rowsUpdated = statement.executeUpdate();

        if (rowsUpdated <= 0) {
            throw new SQLException("Member not updated");
        }

        statement.close();
    }
}
package Services;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;


public class MemberService {
    private final Connection connection;

    public MemberService(DAL dal) {
        this.connection = dal.getConnection();
    }

    public ResultSet getMember(int memberId) throws SQLException {
        String sql = "SELECT * FROM member WHERE id = ?";
        PreparedStatement statement = this.connection.prepareStatement(sql);

        statement.setInt(1, memberId);

        ResultSet result = statement.executeQuery();

        if (!result.next()) {
            throw new SQLException("Member not found");
        }

        return result;
    }
}
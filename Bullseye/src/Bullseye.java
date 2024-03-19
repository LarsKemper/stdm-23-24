import Services.DAL;
import Controllers.AuthController;
import Entities.Archer;
import Utils.Gender;
import Utils.MemberStatus;
import java.util.Date;
import java.sql.SQLException;


public class Bullseye {
    public static void main(String[] args) {
        DAL dal = new DAL();
        dal.connect();
        
        AuthController authController = new AuthController(dal);

        Archer test = new Archer("test", "test", new Date(), Gender.MALE, "test adresss", MemberStatus.ACTIVE, false, false);

        try {
            authController.register(test);
            System.out.println(test.getId());

            authController.login(test.getId());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        dal.disconnect();
    }
}

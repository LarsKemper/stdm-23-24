import Services.DAL;
import Controllers.AuthController;
import Controllers.MemberController;
import Controllers.TournamentController;
import Views.StartUpView;

public class Bullseye {
    public static void main(String[] args) {
        DAL dal = new DAL();
        dal.connect();
        
        //AuthController authController = new AuthController(dal);
        //MemberController memberController = new MemberController(dal);
        //TournamentController tournamentController = new TournamentController(dal);

        new StartUpView(dal).setVisible(true);
    }
}

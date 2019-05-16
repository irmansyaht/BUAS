import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleScreenHandler implements ActionListener {

    public void actionPerformed(ActionEvent event){
        String yourChoice = event.getActionCommand();
        if(yourChoice.equals("mulai")) {
            BUAS.newGameScreen("mulai");
        }
        else if(yourChoice.equals("lanjutkan")) {
            BUAS.createGameScreen("lanjutkan");
        }
    }
}
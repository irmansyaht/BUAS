import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Kelas Handler untuk Title Screen Dalam Game BUAS
 * @author Irmansyah Turhamun, Dhio Makarim Utomo, Rizky Nurfaizi, M Haqy Aunoora
 *
 * @version 1.0 (Stable for Demo)
 * */
public class TitleScreenHandler implements ActionListener {

    /**
     * Method untuk memilih apakah memulai game baru atau melanjutkan hasil progress
     * @param event pilihan untuk memulai atau melanjutkan permainan
     */
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
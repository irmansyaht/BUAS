import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Kelas Handle untuk BGM Dalam Game BUAS
 * @author Irmansyah Turhamun, Dhio Makarim Utomo, Rizky Nurfaizi, M Haqy Aunoora
 *
 * @version 1.0 (Stable for Demo)
 * */
public class SoundHandler implements ActionListener {
    /**
     * Method untuk mengaktifkan atau menonaktifkan BGM
     * @param event perintah untuk mengaktifkan atau menonaktifkan BGM
     */
    public void actionPerformed(ActionEvent event) {

        String clickedButton = event.getActionCommand();
        switch (clickedButton) {
            case "musicB":
                if (Sound.musicOnOff.equals("off")) {
                    Sound.mu.setFile(Sound.bgMusic);
                    Sound.mu.play();
                    Sound.mu.loop();
                    Sound.musicOnOff = "on";
                    BUAS.musicButton.setText("Mute BGM");
                } else if (Sound.musicOnOff.equals("on")) {
                    Sound.mu.stop();
                    Sound.musicOnOff = "off";
                    BUAS.musicButton.setText("Play BGM");
                }
                break;
        }

    }
}
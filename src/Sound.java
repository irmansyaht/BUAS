import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * Kelas untuk membuat Efek Suara di dalam Game BUAS
 * @author Irmansyah Turhamun, Dhio Makarim Utomo, Rizky Nurfaizi, M Haqy Aunoora
 *
 * @version 1.0 (Stable for Demo)
 * */
public class Sound {

    static String attackSound, monsterSound, goSound, talkSound, eatSound, obtainSound, winSound, loseSound, bgMusic, musicOnOff;
    static AttackSound as = new AttackSound();
    static MonsterSound ms = new MonsterSound();
    static GoSound gs = new GoSound();
    static TalkSound ts = new TalkSound();
    static EatSound es = new EatSound();
    static ObtainSound os = new ObtainSound();
    static WinSound ws = new WinSound();
    static LoseSound ls = new LoseSound();
    static Music mu = new Music();

    public Sound(){

    }

    /**
     * Kelas untuk membuat effek suara serangan
     */
    public static class AttackSound{
        Clip clip;

        /**
         * Method untuk mencari file efek suara
         * @param soundFileName  merupakan lokasi efek suara diletakan
         */
        public void setFile(String soundFileName){
            try{
                File file = new File(soundFileName);
                AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(sound);
            }
            catch (Exception e){

            }
        }

        /**
         * Method untuk menjalankan efek suara di dalam game
         */
        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }
    }

    /**
     * Merupakan kelas untuk membuat efek suara pada monster
     */
    public static class MonsterSound{
        Clip clip;
        /**
         * Method untuk menccari file efek suara
         * @param soundFileName  merupakan lokasi efek suara diletakan
         */
        public void setFile(String soundFileName){
            try{
                File file = new File(soundFileName);
                AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(sound);
            }
            catch (Exception e){

            }
        }

        /**
         * Method untuk menjalankan efek suara di dalam game
         */
        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }
    }

    /**
     * Kelas untuk membuat efek suara jalan
     */
    public static class GoSound{
        Clip clip;
        /**
         * Method untuk mencari file efek suara
         * @param soundFileName  merupakan lokasi efek suara diletakan
         */

        public void setFile(String soundFileName){
            try{
                File file = new File(soundFileName);
                AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(sound);
            }
            catch (Exception e){

            }
        }
        /**
         * Method untuk menjalankan efek suara di dalam game
         */
        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }
    }

    /**
     * Kelas untuk efek suara berbicara
     */
    public static class TalkSound{
        Clip clip;
        /**
         * Method untuk mencari file efek suara
         * @param soundFileName  merupakan lokasi efek suara diletakan
         */
        public void setFile(String soundFileName){
            try{
                File file = new File(soundFileName);
                AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(sound);
            }
            catch (Exception e){

            }
        }

        /**
         * Method untuk memainkan efek suara
         */
        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }

        /**
         * Method untuk mengakhiri efek suara
         */
        public void stop(){
            clip.stop();
            clip.close();
        }
    }

    /**
     * Kelas untuk efek suara Makan di dalam Game
     */
    public static class EatSound{
        Clip clip;
        /**
         * Method untuk mencari file efek suara
         * @param soundFileName  merupakan lokasi efek suara diletakan
         */
        public void setFile(String soundFileName){
            try{
                File file = new File(soundFileName);
                AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(sound);
            }
            catch (Exception e){

            }
        }

        /**
         * Method untuk menjalankan efek suara
         */
        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }
    }

    /**
     * Kelas untuk efek suara mendapatkan barang
     */
    public static class ObtainSound{
        Clip clip;
        /**
         * Method untuk mencari file efek suara
         * @param soundFileName  merupakan lokasi efek suara diletakan
         */
        public void setFile(String soundFileName){
            try{
                File file = new File(soundFileName);
                AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(sound);
            }
            catch (Exception e){

            }
        }

        /**
         * Method untuk menjalankan efek suara
         */
        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }
    }

    /**
     * Kelas untuk efek suara setelah mengalahkan monster
     */
    public static class WinSound{
        Clip clip;
        /**
         * Method untuk mencari file efek suara
         * @param soundFileName  merupakan lokasi efek suara diletakan
         */
        public void setFile(String soundFileName){
            try{
                File file = new File(soundFileName);
                AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(sound);
            }
            catch (Exception e){

            }
        }

        /**
         * Method untuk memainkan efek suara
         */
        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }
    }

    /**
     * Kelas untuk efek suara ketika kalah dari monster
     */
    public static class LoseSound{
        Clip clip;
        /**
         * Method untuk mencari file efek suara
         * @param soundFileName  merupakan lokasi efek suara diletakan
         */
        public void setFile(String soundFileName){
            try{
                File file = new File(soundFileName);
                AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(sound);
            }
            catch (Exception e){

            }
        }

        /**
         * Method untuk memainkan efek suara
         */
        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }
    }

    /**
     * Kelas untuk mengeset BGM di dalam Game
     */
    public static class Music{
        Clip clip;
        /**
         * Method untuk mencari file efek suara
         * @param soundFileName  merupakan lokasi efek suara diletakan
         */
        public void setFile(String soundFileName){
            try{
                File file = new File(soundFileName);
                AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(sound);
            }
            catch (Exception e){

            }
        }

        /**
         * Method untuk memainkan efek suara
         */
        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }

        /**
         * Method untuk melakukan loop sehingga BGM tidak terhenti selama game
         */
        public void loop(){
            clip.loop(clip.LOOP_CONTINUOUSLY);
        }

        /**
         * Method untuk menghentikan BGM
         */
        public void stop(){
            clip.stop();
            clip.close();
        }
    }
}

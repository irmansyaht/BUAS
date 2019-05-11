import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Sound {

    static String attackSound, monsterSound, goSound, talkSound, obtainSound, winSound, loseSound, bgMusic, musicOnOff;
    static AttackSound as = new AttackSound();
    static MonsterSound ms = new MonsterSound();
    static GoSound gs = new GoSound();
    static TalkSound ts = new TalkSound();
    static ObtainSound os = new ObtainSound();
    static WinSound ws = new WinSound();
    static LoseSound ls = new LoseSound();
    static Music mu = new Music();

    public Sound(){

    }

    public static class AttackSound{
        Clip clip;

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

        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }
    }

    public static class MonsterSound{
        Clip clip;

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

        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }
    }

    public static class GoSound{
        Clip clip;

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

        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }
    }

    public static class TalkSound{
        Clip clip;

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

        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }

        public void stop(){
            clip.stop();
            clip.close();
        }
    }

    public static class ObtainSound{
        Clip clip;

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

        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }
    }

    public static class WinSound{
        Clip clip;

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

        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }
    }

    public static class LoseSound{
        Clip clip;

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

        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }
    }

    public static class Music{
        Clip clip;

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

        public void play(){
            clip.setFramePosition(0);
            clip.start();
        }

        public void loop(){
            clip.loop(clip.LOOP_CONTINUOUSLY);
        }

        public void stop(){
            clip.stop();
            clip.close();
        }
    }
}

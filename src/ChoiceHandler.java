import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceHandler implements ActionListener {

    public void actionPerformed(ActionEvent event){

        String yourChoice = event.getActionCommand();

        switch(BUAS.position){
            case "pintuGerbang":
                switch(yourChoice){
                    case "c1":
                        Sound.talkSound = ".//res//sfx//243379_johnsonbrandediting_charlie-brown-teacher-wa-wa-effect (online-audio-converter.com).wav";
                        Sound.ts.setFile(Sound.talkSound);
                        Sound.ts.play();
                        if(BUAS.silverRing==1){
                            BUAS.ending();
                        }
                        else{
                            BUAS.bicara();
                        }
                        break;
                    case "c2":
                        Sound.attackSound = ".//res//sfx//27858__erdie__sword04.wav";
                        Sound.as.setFile(Sound.attackSound);
                        Sound.as.play();
                        BUAS.pukulPenjaga();
                        break;
                    case "c3":
                        Sound.talkSound = ".//res//sfx//243379_johnsonbrandediting_charlie-brown-teacher-wa-wa-effect (online-audio-converter.com).wav";
                        Sound.ts.setFile(Sound.talkSound);
                        Sound.ts.play();
                        BUAS.bicaraPerempuan();
                        break;
                    case "c4":
                        Sound.goSound = ".//res//sfx//267492__snudiorecords__footstep.wav";
                        Sound.gs.setFile(Sound.goSound);
                        Sound.gs.play();
                        BUAS.persimpangan();
                        break;
                }
                break;
            case "bicara":
                Sound.ts.stop();
                switch(yourChoice){
                    case "c1":
                        BUAS.pintuGerbang();
                        break;
                }
                break;
            case "pukul penjaga":
                switch(yourChoice){
                    case "c1":
                        BUAS.pintuGerbang();
                        break;
                }
                break;
            case "bicara perempuan":
                switch(yourChoice){
                    case "c1": BUAS.pintuGerbang(); break;
                }
                break;
            case "persimpangan":
                switch(yourChoice){
                    case "c1":
                        Sound.goSound = ".//res//sfx//267492__snudiorecords__footstep.wav";
                        Sound.gs.setFile(Sound.goSound);
                        Sound.gs.play();
                        BUAS.utara();
                        Sound.eatSound = ".//res//sfx//157049__slave2thelight__zombieb.wav";
                        Sound.es.setFile(Sound.eatSound);
                        Sound.es.play();
                        break;
                    case "c2":
                        Sound.goSound = ".//res//sfx//267492__snudiorecords__footstep.wav";
                        Sound.gs.setFile(Sound.goSound);
                        Sound.gs.play();
                        BUAS.timur();
                        Sound.obtainSound = ".//res//sfx//345297__scrampunk__itemize.wav";
                        Sound.os.setFile(Sound.obtainSound);
                        Sound.os.play();
                        break;
                    case "c3":
                        Sound.goSound = ".//res//sfx//267492__snudiorecords__footstep.wav";
                        Sound.gs.setFile(Sound.goSound);
                        Sound.gs.play();
                        BUAS.pintuGerbang();
                        break;
                    case "c4":
                        Sound.goSound = ".//res//sfx//267492__snudiorecords__footstep.wav";
                        Sound.gs.setFile(Sound.goSound);
                        Sound.gs.play();
                        BUAS.barat();
                        break;
                }
                break;
            case "utara":
                switch(yourChoice){
                    case "c1":
                        Sound.goSound = ".//res//sfx//267492__snudiorecords__footstep.wav";
                        Sound.gs.setFile(Sound.goSound);
                        Sound.gs.play();
                        BUAS.persimpangan();
                        break;
                }
                break;
            case "timur":
                switch(yourChoice){
                    case "c1":
                        Sound.goSound = ".//res//sfx//267492__snudiorecords__footstep.wav";
                        Sound.gs.setFile(Sound.goSound);
                        Sound.gs.play();
                        BUAS.persimpangan();
                        break;
                }
                break;
            case "barat":
                switch(yourChoice){
                    case "c1":
                        Sound.attackSound = ".//res//sfx//27858__erdie__sword04.wav";
                        Sound.as.setFile(Sound.attackSound);
                        Sound.as.play();
                        BUAS.bertarung();
                        break;
                    case "c2":
                        Sound.goSound = ".//res//sfx//267492__snudiorecords__footstep.wav";
                        Sound.gs.setFile(Sound.goSound);
                        Sound.gs.play();
                        BUAS.persimpangan();
                        break;
                }
                break;
            case "bertarung":
                switch(yourChoice){
                    case "c1":
                        Sound.attackSound = ".//res//sfx//27858__erdie__sword04.wav";
                        Sound.as.setFile(Sound.attackSound);
                        Sound.as.play();
                        BUAS.playerAttack();
                        break;
                    case "c2":
                        Sound.goSound = ".//res//sfx//267492__snudiorecords__footstep.wav";
                        Sound.gs.setFile(Sound.goSound);
                        Sound.gs.play();
                        BUAS.persimpangan();
                        break;
                }
                break;
            case "playerAttack":
                switch(yourChoice){
                    case "c1":
                        if(BUAS.monster.hp<1){
                            Sound.winSound = ".//res//sfx//277441__xtrgamr__tones-of-victory.wav";
                            Sound.ws.setFile(Sound.winSound);
                            Sound.ws.play();
                            BUAS.win();
                        }
                        else{
                            Sound.monsterSound = ".//res//sfx//340162_flechabr_short-monster-roar (online-audio-converter.com).wav";
                            Sound.ms.setFile(Sound.monsterSound);
                            Sound.ms.play();
                            BUAS.monsterAttack();
                        }
                        break;
                }
                break;
            case "monsterAttack":
                switch(yourChoice){
                    case "c1":
                        if(BUAS.playerHP<1){
                            Sound.loseSound = ".//res//sfx//157218_adamweeden_video-game-die-or-lose-life (online-audio-converter.com).wav";
                            Sound.ls.setFile(Sound.loseSound);
                            Sound.ls.play();
                            BUAS.lose();
                        }
                        else{
                            BUAS.bertarung();
                        }
                        break;
                }
                break;
            case "win":
                switch(yourChoice){
                    case "c1":
                        Sound.goSound = ".//res//sfx//267492__snudiorecords__footstep.wav";
                        Sound.gs.setFile(Sound.goSound);
                        Sound.gs.play();
                        BUAS.persimpangan();
                }
                break;

        }


    }
}




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceHandler implements ActionListener {

    public void actionPerformed(ActionEvent event){

        String yourChoice = event.getActionCommand();

        switch(BUAS.position){
            case "pintuGerbang":
                switch(yourChoice){
                    case "c1":
                        if(BUAS.silverRing==1){
                            BUAS.ending();
                        }
                        else{
                            BUAS.bicara();
                        }
                        break;
                    case "c2": BUAS.pukulPenjaga();break;
                    case "c3": BUAS.persimpangan();break;
                }
                break;
            case "bicara":
                switch(yourChoice){
                    case "c1": BUAS.pintuGerbang(); break;
                }
                break;
            case "pukul penjaga":
                switch(yourChoice){
                    case "c1": BUAS.pintuGerbang(); break;
                }
                break;
            case "persimpangan":
                switch(yourChoice){
                    case "c1": BUAS.utara(); break;
                    case "c2": BUAS.timur();break;
                    case "c3": BUAS.pintuGerbang(); break;
                    case "c4": BUAS.barat();break;
                }
                break;
            case "utara":
                switch(yourChoice){
                    case "c1": BUAS.persimpangan(); break;
                }
                break;
            case "timur":
                switch(yourChoice){
                    case "c1": BUAS.persimpangan(); break;
                }
                break;
            case "barat":
                switch(yourChoice){
                    case "c1": BUAS.bertarung(); break;
                    case "c2": BUAS.persimpangan(); break;
                }
                break;
            case "bertarung":
                switch(yourChoice){
                    case "c1": BUAS.playerAttack();break;
                    case "c2": BUAS.persimpangan(); break;
                }
                break;
            case "playerAttack":
                switch(yourChoice){
                    case "c1":
                        if(BUAS.monster.hp<1){
                            BUAS.win();
                        }
                        else{
                            BUAS.monsterAttack();
                        }
                        break;
                }
                break;
            case "monsterAttack":
                switch(yourChoice){
                    case "c1":
                        if(BUAS.playerHP<1){
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
                    case "c1": BUAS.persimpangan();
                }
                break;

        }


    }
}




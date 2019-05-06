import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceHandler implements ActionListener {

    public void actionPerformed(ActionEvent event){

        String yourChoice = event.getActionCommand();

        switch(BUAS.position){
            case "townGate":
                switch(yourChoice){
                    case "c1":
                        if(BUAS.silverRing==1){
                            BUAS.ending();
                        }
                        else{
                            BUAS.talkGuard();
                        }
                        break;
                    case "c2": BUAS.attackGuard();break;
                    case "c3": BUAS.crossRoad();break;
                }
                break;
            case "talkGuard":
                switch(yourChoice){
                    case "c1": BUAS.townGate(); break;
                }
                break;
            case "attackGuard":
                switch(yourChoice){
                    case "c1": BUAS.townGate(); break;
                }
                break;
            case "crossRoad":
                switch(yourChoice){
                    case "c1": BUAS.north(); break;
                    case "c2": BUAS.east();break;
                    case "c3": BUAS.townGate(); break;
                    case "c4": BUAS.west();break;
                }
                break;
            case "north":
                switch(yourChoice){
                    case "c1": BUAS.crossRoad(); break;
                }
                break;
            case "east":
                switch(yourChoice){
                    case "c1": BUAS.crossRoad(); break;
                }
                break;
            case "west":
                switch(yourChoice){
                    case "c1": BUAS.fight(); break;
                    case "c2": BUAS.crossRoad(); break;
                }
                break;
            case "fight":
                switch(yourChoice){
                    case "c1": BUAS.playerAttack();break;
                    case "c2": BUAS.crossRoad(); break;
                }
                break;
            case "playerAttack":
                switch(yourChoice){
                    case "c1":
                        if(BUAS.monsterHP<1){
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
                            BUAS.fight();
                        }
                        break;
                }
                break;
            case "win":
                switch(yourChoice){
                    case "c1": BUAS.crossRoad();
                }
                break;

        }


    }
}




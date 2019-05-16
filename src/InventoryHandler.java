import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Kelas Handler untuk Inventory Dalam Game BUAS
 * @author Irmansyah Turhamun, Dhio Makarim Utomo, Rizky Nurfaizi, M Haqy Aunoora
 *
 * @version 1.0 (Stable for Demo)
 * */
public class InventoryHandler implements ActionListener {
    /**
     * Method Handler untuk menggunakan barang di dalam inventory game
     * @param event
     */
    public void actionPerformed(ActionEvent event){
        String yourChoice = event.getActionCommand();
        switch (yourChoice){
            case "inventoryButton":
                if(BUAS.inventoryStatus.equals("close")){
                    BUAS.choice1.setVisible(false);
                    BUAS.choice2.setVisible(false);
                    BUAS.choice3.setVisible(false);
                    BUAS.choice4.setVisible(false);
                    BUAS.inventoryPanel.setVisible(true);
                    BUAS.itemButton1.setText(BUAS.playerItem[0]);
                    BUAS.itemButton2.setText(BUAS.playerItem[1]);
                    BUAS.itemButton3.setText(BUAS.playerItem[2]);
                    BUAS.itemButton4.setText(BUAS.playerItem[3]);
                    BUAS.itemButton5.setText(BUAS.playerItem[4]);
                    BUAS.inventoryStatus = "open";
                }
                else if(BUAS.inventoryStatus.equals("open")){
                    BUAS.choice1.setVisible(true);
                    BUAS.choice2.setVisible(true);
                    BUAS.choice3.setVisible(true);
                    BUAS.choice4.setVisible(true);
                    BUAS.inventoryPanel.setVisible(false);
                    BUAS.inventoryStatus = "close";
                }
                break;
            case "item1":
                BUAS.itemButton1.setText("");
                BUAS.itemUsed(0);
                break;
            case "item2":
                BUAS.itemButton2.setText("");
                BUAS.itemUsed(1);
                break;
            case "item3":
                BUAS.itemButton3.setText("");
                BUAS.itemUsed(2);
                break;
            case "item4":
                BUAS.itemButton4.setText("");
                BUAS.itemUsed(3);
                break;
            case "item5":
                BUAS.itemButton5.setText("");
                BUAS.itemUsed(4);
                break;
        }
    }
}

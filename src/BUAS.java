import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BUAS {

    JFrame window;
    static Container con;
    static JPanel titleNamePanel;
    static JPanel startButtonPanel;
    static JPanel mainTextPanel;
    static JPanel choiceButtonPanel;
    static JPanel playerPanel;
    static JPanel titleNamePanel1;
    static JPanel imagePanel;
    JLabel titleNameLabel;
    static JLabel hpLabel;
    static JLabel hpLabelNumber;
    static JLabel weaponLabel;
    static JLabel weaponLabelName;
    static JLabel imageLabel;
    JLabel titleNameLabel1;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    static Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
    JButton startButton;
    static JButton choice1;
    static JButton choice2;
    static JButton choice3;
    static JButton choice4;
    static JTextArea mainTextArea;
    static int playerHP;
    static int monsterHP;
    static int silverRing;
    static String weapon;
    static String position;
    static Monster monster;
    static ImageIcon image;

    TitleScreenHandler tsHandler = new TitleScreenHandler();
    static ChoiceHandler choiceHandler = new ChoiceHandler();


    public static void main(String[] args) {

        new BUAS();
    }

    public BUAS() {

        //TAMBAH CLASS
        //- Monster
        //- Character
        //- Items
        //- BGM/SFX
        //- Merchant
        //- Combat

        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("BUAS");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        titleNamePanel1 = new JPanel();
        titleNamePanel1.setBounds(100, 250, 600, 50);
        titleNamePanel1.setBackground(Color.black);
        titleNameLabel1 = new JLabel("Battle of UAS");
        titleNameLabel1.setForeground(Color.white);
        titleNameLabel1.setFont(normalFont);


        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("MULAI");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);
        startButton.setFocusPainted(false);

        titleNamePanel.add(titleNameLabel);
        titleNamePanel1.add(titleNameLabel1);
        startButtonPanel.add(startButton);

        con.add(titleNamePanel);
        con.add(titleNamePanel1);
        con.add(startButtonPanel);
    }

    public static void createGameScreen() {

        titleNamePanel.setVisible(false);
        titleNamePanel1.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(50, 350, 430, 250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("");
        mainTextArea.setBounds(50, 350, 430, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(500, 350, 250, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Pilihan 1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);
        choice2 = new JButton("Pilihan 2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);
        choice3 = new JButton("Pilihan 3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);
        choice4 = new JButton("Pilihan 4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        playerPanel = new JPanel();
        playerPanel.setBounds(500, 100, 270, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(2, 2));
        con.add(playerPanel);
        hpLabel = new JLabel("HP:");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(normalFont);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);
        weaponLabel = new JLabel("Senjata:");
        weaponLabel.setFont(normalFont);
        weaponLabel.setForeground(Color.white);
        playerPanel.add(weaponLabel);
        weaponLabelName = new JLabel();
        weaponLabelName.setFont(normalFont);
        weaponLabelName.setForeground(Color.white);
        playerPanel.add(weaponLabelName);

        imagePanel = new JPanel();
        imagePanel.setBounds(50, 50, 400, 260);
        imagePanel.setBackground(Color.black);

        imageLabel = new JLabel();

        image = new ImageIcon(".//res//gate.jpg");

        imageLabel.setIcon(image);
        imagePanel.add(imageLabel);


        con.add(imagePanel);

        playerSetup();

    }

    public static void playerSetup() {
        playerHP = 15;
        monsterHP = 20;
        weapon = "Pisau";
        weaponLabelName.setText(weapon);
        hpLabelNumber.setText("" + playerHP);

        pintuGerbang();
    }

    public static void pintuGerbang() {
        image = new ImageIcon(".//res//gate.jpg");
        imageLabel.setIcon(image);

        position = "pintuGerbang";
        mainTextArea.setText("Kamu berada di sebuah Pintu Gerbang . \nSeorang Pria tua menjaga pintu itu \n\nApa yang akan kamu lakukan?");
        choice1.setText("Bicara pada Penjaga");
        choice2.setText("Pukul Penjaga");
        choice3.setText("Pergi");
        choice4.setText("");
    }

    public static void bicara() {
        position = "bicara";
        mainTextArea.setText("Penjaga:\nCincin Perak kerajaan Dicuri oleh Seorang Monster BUAS. Cepat ambil kembali Cincin Perak kami dari Monster BUAS itu.");
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public static void pukulPenjaga() {
        position = "pukul penjaga";
        mainTextArea.setText("Penjaga:\n Dasar orang aneh masih berani kamu ngelawan orang tua\nPenjaga tersebut kemudian menjewer kuping anda.\n(Kamu menerima 3 kerusakan)");
        playerHP = playerHP - 3;
        hpLabelNumber.setText("" + playerHP);
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public static void persimpangan() {
        image = new ImageIcon(".//res//crossroads.jpg");
        imageLabel.setIcon(image);

        position = "persimpangan";
        mainTextArea.setText("Kamu berada di persimpangan jalan.\n Kemanakah kamu akan pergi?.");
        choice1.setText("Pergi ke Utara");
        choice2.setText("Pergi ke Timur");
        choice3.setText("Pergi ke Selatan");
        choice4.setText("Pergi ke Barat");
    }

    public static void utara() {
        image = new ImageIcon(".//res//river.jpg");
        imageLabel.setIcon(image);

        position = "utara";
        mainTextArea.setText("Kamu berada di Sungai. \nKamu menangkap ikan yang berenang di sungai\n Karena terlihat lezat kamu memakannya.\n(HP kamu bertambah 2 setelah memakan ikan)");
        playerHP = playerHP + 2;
        hpLabelNumber.setText("" + playerHP);
        choice1.setText("Pergi ke Selatan");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public static void timur() {
        image = new ImageIcon(".//res//sword.png");
        imageLabel.setIcon(image);

        position = "timur";
        mainTextArea.setText("Kamu berjalan di suatu tempat yang mengerikan.\n Kamu menemukan prajurit yang sudah tidak bernyawa\nKamu melihat pedang dan mengambilnya.\n(Kamu mendapatkan Pedang)");
        weapon = "Pedang";
        weaponLabelName.setText(weapon);
        choice1.setText("Pergi ke Barat");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }

    public static void barat() {

        int i = new java.util.Random().nextInt(100)+1;

        if (i < 31){
            monster = new Monster_Goblin();
            image = new ImageIcon(".//res//goblin.png");
            imageLabel.setIcon(image);
        }
        else if (i < 61){
            monster = new Monster_Slime();
            image = new ImageIcon(".//res//slime.png");
            imageLabel.setIcon(image);
        }
        else if (i < 91){
            monster = new Monster_Demon();
            image = new ImageIcon(".//res//demon.jpg");
            imageLabel.setIcon(image);
        }
        else {
            monster = new Monster_Gandalf();
            image = new ImageIcon(".//res//gandalf.jpg");
            imageLabel.setIcon(image);
        }

        position = "barat";
        mainTextArea.setText("Saat kamu berjalan ke hutan Kamu bertemu dengan Monster BUAS " + monster.name + "!\n Apa yang akan kamu lakukan?");
        choice1.setText("Bertarung");
        choice2.setText("Pergi ke Timur");
        choice3.setText("");
        choice4.setText("");
    }

    public static void bertarung() {
        position = "bertarung";
        mainTextArea.setText("HP " + monster.name + ": " + monster.hp + "\n\nApa yang kamu lakukan?");
        choice1.setText("Serang");
        choice2.setText("Kabur");
        choice3.setText("");
        choice4.setText("");
    }

    public static void playerAttack() {
        position = "playerAttack";

        int playerDamage = 0;

        if (weapon.equals("Pisau")) {
            playerDamage = new java.util.Random().nextInt(3);
        } else if (weapon.equals("Pedang")) {
            playerDamage = new java.util.Random().nextInt(12);
        }
       mainTextArea.setText("Kamu menyerang Monster BUAS " + monster.name +
               " dan memberi " + playerDamage + " kerusakan pada Monster!");

        monster.hp = monster.hp - playerDamage;

        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public static void monsterAttack() {
        position = "monsterAttack";

        int monsterDamage = new java.util.Random().nextInt(monster.attack);

        mainTextArea.setText(monster.attackMessage + "\nMonster BUAS " + monster.name +
                " menyerang dan memberi kamu " + monsterDamage + " kerusakan!");


        playerHP = playerHP - monsterDamage;
        hpLabelNumber.setText("" + playerHP);

        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public static void win() {
        position = "win";

        mainTextArea.setText("Kamu berhasil mengalahkan monster BUAS " + monster.name +
                "\nMonster tersebut menjatuhkan Cincin Perak\n(Kamu mendapatkan Cincin Perak)");

        silverRing = 1;

        choice1.setText("Pergi ke Timur");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }

    public static void lose() {
        position = "lose";

        mainTextArea.setText("Kamu terluka cukup parah dan meninggal terbunuh Monster\n\n");

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }

    public static void ending() {
        position = "ending";

        mainTextArea.setText("Penjaga: Oh bagus nak kamu menemukan cincin kerajaan.\nTerima kasih sekarang kami mengakuimu.\n");

        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice1.setVisible(false);
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }

}
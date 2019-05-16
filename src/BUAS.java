import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BUAS {

    JFrame window;
    static Container con;
    static JPanel titleNamePanel, startButtonPanel,imagePanel, mainTextPanel, choiceButtonPanel, playerPanel, titleNamePanel1, musicPanel, inventoryPanel;
    JLabel titleNameLabel;
    JLabel titleNameLabel1;
    static JLabel imageLabel;
    static JLabel hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    static Font normalFont = new Font("Times New Roman", Font.PLAIN, 24);
    JButton startButton, continueButton;
    static JButton musicButton;
    static JButton choice1, choice2, choice3, choice4, inventoryButton,
                    itemButton1, itemButton2, itemButton3, itemButton4, itemButton5;
    static JTextArea mainTextArea;
    static int playerHP, monsterHP, silverRing;
    static String weapon, position, inventoryStatus, clickedButton;
    static Monster monster;
    static ImageIcon image;


    TitleScreenHandler tsHandler = new TitleScreenHandler();
    static ChoiceHandler choiceHandler = new ChoiceHandler();
    static SoundHandler soundHandler = new SoundHandler();
    static InventoryHandler iHandler = new InventoryHandler();

    static String[] playerItem = new String[5];


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
        window.setSize(1000, 650);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(200, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("BUAS");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        titleNamePanel1 = new JPanel();
        titleNamePanel1.setBounds(200, 250, 600, 50);
        titleNamePanel1.setBackground(Color.black);
        titleNameLabel1 = new JLabel("Battle of UAS");
        titleNameLabel1.setForeground(Color.white);
        titleNameLabel1.setFont(normalFont);


        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(400, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("MULAI");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);
        startButton.setFocusPainted(false);
        startButton.setActionCommand("mulai");

        continueButton = new JButton("LANJUTKAN");
        continueButton.setBackground(Color.black);
        continueButton.setForeground(Color.white);
        continueButton.setFont(normalFont);
        continueButton.addActionListener(tsHandler);
        continueButton.setFocusPainted(false);
        continueButton.setActionCommand("lanjutkan");

        musicPanel = new JPanel();
        musicPanel.setBounds(400, 500, 200, 50);
        musicPanel.setBackground(Color.black);
        musicButton = new JButton("Play BGM");
        musicButton.setBackground(Color.black);
        musicButton.setForeground(Color.white);
        musicButton.addActionListener(soundHandler);
        musicButton.setActionCommand("musicB");
        musicButton.setFocusPainted(false);
        Sound.bgMusic = ".//res//sfx//Adventures - A Himitsu (No Copyright Music) (online-audio-converter.com).wav";
        Sound.musicOnOff = "off";

        titleNamePanel.add(titleNameLabel);
        titleNamePanel1.add(titleNameLabel1);
        startButtonPanel.add(startButton);
        startButtonPanel.add(continueButton);
        musicPanel.add(musicButton);

        con.add(titleNamePanel);
        con.add(titleNamePanel1);
        con.add(startButtonPanel);
        con.add(musicPanel);

        window.setVisible(true);
    }

    public static void createGameScreen(String choice) {

        titleNamePanel.setVisible(false);
        titleNamePanel1.setVisible(false);
        startButtonPanel.setVisible(false);
        musicPanel.setVisible(false);
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
        choiceButtonPanel.setBounds(500, 350, 270, 180);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(5, 1));
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

        inventoryButton = new JButton("[ Inventory ]");
        inventoryButton.setBackground(Color.white);
        inventoryButton.setForeground(Color.black);
        inventoryButton.setFont(normalFont);
        inventoryButton.setFocusPainted(false);
        inventoryButton.addActionListener(iHandler);
        inventoryButton.setActionCommand("inventoryButton");
        choiceButtonPanel.add(inventoryButton);

        inventoryPanel = new JPanel();
        inventoryPanel.setBounds(770, 350, 180, 180);
        inventoryPanel.setBackground(Color.black);
        inventoryPanel.setLayout(new GridLayout(5, 1));
        con.add(inventoryPanel);

        itemButton1 = new JButton();
        itemButton1.setBackground(Color.black);
        itemButton1.setForeground(Color.white);
        itemButton1.setFont(normalFont);
        itemButton1.setFocusPainted(false);
        itemButton1.addActionListener(iHandler);
        itemButton1.setActionCommand("item1");
        itemButton2 = new JButton();
        itemButton2.setBackground(Color.black);
        itemButton2.setForeground(Color.white);
        itemButton2.setFont(normalFont);
        itemButton2.setFocusPainted(false);
        itemButton2.addActionListener(iHandler);
        itemButton2.setActionCommand("item2");
        itemButton3 = new JButton();
        itemButton3.setBackground(Color.black);
        itemButton3.setForeground(Color.white);
        itemButton3.setFont(normalFont);
        itemButton3.setFocusPainted(false);
        itemButton3.addActionListener(iHandler);
        itemButton3.setActionCommand("item3");
        itemButton4 = new JButton();
        itemButton4.setBackground(Color.black);
        itemButton4.setForeground(Color.white);
        itemButton4.setFont(normalFont);
        itemButton4.setFocusPainted(false);
        itemButton4.addActionListener(iHandler);
        itemButton4.setActionCommand("item4");
        itemButton5 = new JButton();
        itemButton5.setBackground(Color.black);
        itemButton5.setForeground(Color.white);
        itemButton5.setFont(normalFont);
        itemButton5.setFocusPainted(false);
        itemButton5.addActionListener(iHandler);
        itemButton5.setActionCommand("item5");
        inventoryPanel.add(itemButton1);
        inventoryPanel.add(itemButton2);
        inventoryPanel.add(itemButton3);
        inventoryPanel.add(itemButton4);
        inventoryPanel.add(itemButton5);

        inventoryPanel.setVisible(false);

        playerPanel = new JPanel();
        playerPanel.setBounds(600, 100, 270, 50);
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
        imagePanel.setBounds(100, 50, 400, 260);
        imagePanel.setBackground(Color.black);

        imageLabel = new JLabel();

        image = new ImageIcon(".//res//img//gate.jpg");

        imageLabel.setIcon(image);
        imagePanel.add(imageLabel);
        con.add(imagePanel);

        if(choice.equals("mulai")) {
            playerSetup();
        }
        else if(choice.equals("lanjutkan")) {
            loadData();
        }
    }

    public static void playerSetup() {
        playerHP = 15;
        monsterHP = 20;
        weapon = "Pisau";
        weaponLabelName.setText(weapon);
        hpLabelNumber.setText("" + playerHP);
        inventoryStatus = "close";

        playerItem[0] = "Jamu";
        playerItem[1] = "Jeruk";
        playerItem[2] = "";
        playerItem[3] = "";
        playerItem[4] = "";

        pintuGerbang();
    }

    public static void loadData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("savefile.txt"));

            playerHP = Integer.parseInt(br.readLine());
            monsterHP = Integer.parseInt(br.readLine());
            weapon = br.readLine();

            br.close();
        }
        catch(Exception e) {

        }

        weaponLabelName.setText(weapon);
        hpLabelNumber.setText("" + playerHP);

        pintuGerbang();
    }

    public static void pintuGerbang() {
        image = new ImageIcon(".//res//img//gate.jpg");
        imageLabel.setIcon(image);

        position = "pintuGerbang";
        mainTextArea.setText("Kamu berada di sebuah Pintu Gerbang . \nSeorang Pria tua menjaga pintu itu \n\nApa yang akan kamu lakukan?");
        choice1.setText("Bicara pada Penjaga");
        choice2.setText("Pukul Penjaga");
        choice3.setText("Bicara pada Perempuan");
        choice4.setText("Pergi");

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

    public static void bicaraPerempuan() {
        position = "bicara perempuan";
        mainTextArea.setText("Perempuan:\nHalo, dengan berbicara dengan saya kamu dapat menyimpan progress game.");
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("savefile.txt"));
            bw.write(""+playerHP);
            bw.newLine();
            bw.write(""+monsterHP);
            bw.newLine();
            bw.write(weapon);
            bw.close();
        }
        catch(Exception e) {

        }

        hpLabelNumber.setText(""+playerHP);
        weaponLabelName.setText(weapon);
    }

    public static void persimpangan() {
        image = new ImageIcon(".//res//img//crossroads.jpg");
        imageLabel.setIcon(image);
        position = "persimpangan";
        mainTextArea.setText("Kamu berada di persimpangan jalan.\nKemanakah kamu akan pergi?");
        choice1.setText("Pergi ke Utara");
        choice2.setText("Pergi ke Timur");
        choice3.setText("Pergi ke Selatan");
        choice4.setText("Pergi ke Barat");

    }

    public static void utara() {
        image = new ImageIcon(".//res//img//river.jpg");
        imageLabel.setIcon(image);

        position = "utara";

        int slotNumber = 0;
        while(playerItem[slotNumber] != "" && slotNumber <4){
            slotNumber++;
        }
        if(playerItem[slotNumber] == ""){
            mainTextArea.setText("Kamu berada di Sungai. \nKamu menangkap ikan yang berenang di sungai\nKamu masukkan ikan ke dalam inventory.");
            playerItem[slotNumber] = "Ikan";
        }
        else if(playerItem[slotNumber] != ""){
            mainTextArea.setText("Kamu berada di Sungai. \nKamu menangkap ikan yang berenang di sungai\nInventorymu tidak cukup untuk menampung barang lagi.");
        }

        choice1.setText("Pergi ke Selatan");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }

    public static void timur() {
        image = new ImageIcon(".//res//img//cave.jpg");
        imageLabel.setIcon(image);
        position = "timur";


        mainTextArea.setText("Kamu tiba di suatu tempat yang mengerikan.\nKamu menemukan prajurit yang sudah tidak bernyawa\nKamu melihat sebuah pedang.");
        choice1.setText("Pergi ke Barat");
        choice2.setText("Ambil Pedang");
        choice3.setText("");
        choice4.setText("");
    }

    public static void ambilPedang(){
        image = new ImageIcon(".//res//img//sword.png");
        imageLabel.setIcon(image);
        position = "ambil pedang";

        int slotNumber = 0;
        while(playerItem[slotNumber] != "" && slotNumber <4){
            slotNumber++;
        }
        if(playerItem[slotNumber] == "Pedang" || weapon == "Pedang"){
            mainTextArea.setText("Kamu sudah punya Pedang.");
        }
        else if(playerItem[slotNumber] == ""){
            mainTextArea.setText("Kamu mengambil Pedang.");
            playerItem[slotNumber] = "Pedang";
        }
        else if(playerItem[slotNumber] != ""){
            mainTextArea.setText("Kamu tidak bisa mengambil Pedang.\nInventory penuh");
        }

        choice1.setText("Pergi ke Barat");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public static void barat() {

        int i = new java.util.Random().nextInt(100)+1;

        if (i < 31){
            monster = new Monster_Goblin();
            image = new ImageIcon(".//res//img//goblin.png");
            imageLabel.setIcon(image);
        }
        else if (i < 61){
            monster = new Monster_Slime();
            image = new ImageIcon(".//res//img//slime.png");
            imageLabel.setIcon(image);
        }
        else if (i < 91){
            monster = new Monster_Demon();
            image = new ImageIcon(".//res//img//demon.jpg");
            imageLabel.setIcon(image);
        }
        else {
            monster = new Monster_Gandalf();
            image = new ImageIcon(".//res//img//gandalf.jpg");
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

        mainTextArea.setText("Kamu berhasil mengalahkan monster BUAS\nMonster tersebut menjatuhkan Cincin Perak\n(Kamu mendapatkan Cincin Perak)");

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

    public static void itemUsed(int slotNumber){
        switch (playerItem[slotNumber]){
            case "Jamu":
                playerHP = playerHP + 10;
                hpLabelNumber.setText("" + playerHP);
                playerItem[slotNumber] = "";
                break;
            case "Jeruk":
                playerHP = playerHP + 3;
                hpLabelNumber.setText("" + playerHP);
                playerItem[slotNumber] = "";
                break;
            case "Ikan":
                playerHP = playerHP + 7;
                hpLabelNumber.setText("" + playerHP);
                playerItem[slotNumber] = "";
                break;
            case "Pedang":
                weapon = "Pedang";
                weaponLabelName.setText(weapon);
                playerItem[slotNumber] = "Pisau";
                break;
            case "Pisau":
                weapon = "Pisau";
                weaponLabelName.setText(weapon);
                playerItem[slotNumber] = "Pedang";
                break;
            case "":
                break;
        }
    }

}
package de._Coho04_.GameRandomizer;

import com.github.theholywaffle.teamspeak3.api.wrapper.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gui {

    public static List<String> Games = new ArrayList<>();
    public static JFrame jf;
    public static JFrame WindowTwo;
    public static JButton JB;
    public static JButton bOK;
    public static JButton BannButton;
    public static JTextField Name;
    public static JCheckBox DarkMode;
    public static JLabel Montag;
    public static JLabel Dienstag;
    public static JLabel Mittwoch;
    public static JLabel Donnerstag;
    public static JLabel Freitag;
    public static JLabel Samstag;
    public static JLabel Sonntag;
    public static JLabel DarkM;

    public static void Gui() {
        GamesInput();
        jf = new JFrame();
        ImageIcon img = new ImageIcon("src/main/resources/logo.png");
        jf.setIconImage(img.getImage());
        jf.setSize(280, 350);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(true);
        jf.setLocationRelativeTo(null);
        jf.setTitle("Game-Randomizer");

        //zweites fenster
        WindowTwo = new JFrame();
        WindowTwo.setIconImage(img.getImage());
        WindowTwo.setSize(280, 350);
        WindowTwo.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        WindowTwo.setResizable(true);
        WindowTwo.setLocationRelativeTo(null);
        WindowTwo.setTitle("Kick?");
        WindowTwo.setVisible(false);

        JB = new JButton("Spin");
        JB.addActionListener(Gui::actionPerformed);
        JB.setBounds(0, 220, 100, 50);
        jf.add(JB);

        //Bann Hammer
        BannButton = new JButton("Kick?");
        BannButton.addActionListener(Gui::actionPerformed);
        BannButton.setBounds(100, 220, 100, 50);
        jf.add(BannButton);

        //DakMode
        JLabel DM = new JLabel("DarkMode? ");
        jf.add(DM);
        DM.setVisible(true);
        DM.setBounds(1, 1, 70, 20);

        DarkM = DM;

        DarkMode = new JCheckBox();
        DarkMode.addActionListener(Gui::actionPerformed);
        DarkMode.setBounds(65, 0, 70, 20);
        DarkMode.setVisible(true);
        jf.add(DarkMode);

        LabelCreate();

        JLabel newlabel = new JLabel("Visible");
        jf.add(newlabel);
        newlabel.setVisible(false);
        newlabel.setBounds(0, 140, 200, 100);

        jf.setVisible(true);
    }


    public static void GamesInput() {
        Games.add("GTA V");
        Games.add("Subnautica");
        Games.add("Sea of Thives");
        Games.add("Supraland");
        Games.add("Rocket League");
        Games.add("Coden");
        Games.add("Kingdom new Lands");
        Games.add("Among Us");
        Games.add("ShellShock Live");
        Games.add("Rogue Company");
        Games.add("Age of Empire 2");
        Games.add("Remnant from the Ashes");
        Games.add("Counter Strike");
        Games.add("StarCraft 2");
        Games.add("Minecraft");
        Games.add("FarCry 5");
    }

    public static void LabelCreate() {
        JLabel Mo = new JLabel("Montag: ");
        JLabel Di = new JLabel("Dienstag: ");
        JLabel Mi = new JLabel("Mittwoch: ");
        JLabel Do = new JLabel("Donnerstag: ");
        JLabel Fr = new JLabel("Freitag: ");
        JLabel Sa = new JLabel("Samstag: ");
        JLabel So = new JLabel("Sonntag: ");

        Montag = Mo;
        Dienstag = Di;
        Mittwoch = Mi;
        Donnerstag = Do;
        Freitag = Fr;
        Samstag = Sa;
        Sonntag = So;

        jf.add(Montag);
        jf.add(Dienstag);
        jf.add(Mittwoch);
        jf.add(Donnerstag);
        jf.add(Freitag);
        jf.add(Samstag);
        jf.add(Sonntag);

        Montag.setVisible(true);
        Dienstag.setVisible(true);
        Mittwoch.setVisible(true);
        Donnerstag.setVisible(true);
        Freitag.setVisible(true);
        Samstag.setVisible(true);
        Sonntag.setVisible(true);

        Montag.setBounds(0, 0, 200, 100);
        Dienstag.setBounds(0, 20, 200, 100);
        Mittwoch.setBounds(0, 40, 200, 100);
        Donnerstag.setBounds(0, 60, 200, 100);
        Freitag.setBounds(0, 80, 200, 100);
        Samstag.setBounds(0, 100, 200, 100);
        Sonntag.setBounds(0, 120, 200, 100);
    }

    public static void actionPerformed(ActionEvent e)  {
        if (e.getSource() == JB) {
            Montag.setText("Montag: " + setGame());
            Dienstag.setText("Dienstag: " + setGame());
            Mittwoch.setText("Mittwoch: " + setGame());
            Donnerstag.setText("Donnerstag: " + setGame());
            Freitag.setText("Freitag: " + setGame());
            Samstag.setText("Samstag: " + setGame());
            Sonntag.setText("Sonntag: " + setGame());
        } else if (e.getSource() == DarkMode) {
            if (DarkMode.isSelected()) {
                jf.getContentPane().setBackground(new Color(40, 44, 48));
                DarkM.setForeground(Color.WHITE);
                Montag.setForeground(Color.WHITE);
                Dienstag.setForeground(Color.WHITE);
                Mittwoch.setForeground(Color.WHITE);
                Donnerstag.setForeground(Color.WHITE);
                Freitag.setForeground(Color.WHITE);
                Samstag.setForeground(Color.WHITE);
                Sonntag.setForeground(Color.WHITE);
                DarkMode.setBackground(new Color(40, 44, 48));
            } else {
                jf.getContentPane().setBackground(Color.white);
                DarkM.setForeground(Color.BLACK);
                Montag.setForeground(Color.BLACK);
                Dienstag.setForeground(Color.BLACK);
                Mittwoch.setForeground(Color.BLACK);
                Donnerstag.setForeground(Color.BLACK);
                Freitag.setForeground(Color.BLACK);
                Samstag.setForeground(Color.BLACK);
                Sonntag.setForeground(Color.BLACK);
                DarkMode.setBackground(Color.WHITE);
            }
        } else if (e.getSource() == BannButton) {
            nextWindow();
        } else if (e.getSource() == bOK) {
            String Person = Name.getText();
            Client c = Main.api.getClientByNameExact(Person, true);
            if (c != null) {
                WindowTwo.setVisible(false);
                Main.api.kickClientFromServer(c);
            } else {
                try {
                    offline(Person);
                } catch (AWTException awtException) {
                    awtException.printStackTrace();
                }
            }
        }
    }

    public static void offline(String Person) throws AWTException {
        SystemTray tray = SystemTray.getSystemTray();
        ImageIcon img = new ImageIcon("src/main/resources/logo.png");
        TrayIcon trayIcon = new TrayIcon(img.getImage());
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip("Offline");
        tray.add(trayIcon);
        trayIcon.displayMessage("Offline", "Die Person " + Person + " ist Offline!", TrayIcon.MessageType.INFO);
    }

    public static String setGame() {
        Random d = new Random();
        int f = d.nextInt(Games.size());
        String Game = Games.get(f);
        return Game;
    }

    public static void nextWindow() {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("User: ");
        panel.add(label);
        JTextField tfName = new JTextField("beispiel: zRazzer", 15);
        Name = tfName;
        tfName.setForeground(Color.BLUE);
        tfName.setBackground(Color.YELLOW);
        panel.add(tfName);

        JButton buttonOK = new JButton("OK");
        buttonOK.addActionListener(Gui::actionPerformed);
        panel.add(buttonOK);

        bOK = buttonOK;

        WindowTwo.add(panel);
        WindowTwo.setVisible(true);

    }
}

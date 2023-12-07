package de.goldendeveloper.GameRandomizer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gui {

    public static List<String> games = new ArrayList<>();
    public static JFrame jFrame;
    public static JButton spinButton;
    public static JCheckBox darkModeCheckbox;
    public static JLabel monday;
    public static JLabel tuesday;
    public static JLabel wednesday;
    public static JLabel thursday;
    public static JLabel friday;
    public static JLabel saturday;
    public static JLabel sunday;
    public static JLabel darkModeLabel;

    public Gui() {
        gamesInput();
        jFrame = new JFrame("Game-Randomizer");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(280, 350);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());
        darkModeLabel = new JLabel("Dark Mode?");
        darkModeCheckbox = new JCheckBox();
        darkModeCheckbox.addActionListener(this::actionPerformed);
        topPanel.add(darkModeLabel);
        topPanel.add(darkModeCheckbox);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        monday = addLabelToPanel(centerPanel, "Montag");
        tuesday = addLabelToPanel(centerPanel, "Dienstag");
        wednesday = addLabelToPanel(centerPanel, "Mittwoch");
        thursday = addLabelToPanel(centerPanel, "Donnerstag");
        friday = addLabelToPanel(centerPanel, "Freitag");
        saturday = addLabelToPanel(centerPanel, "Samstag");
        sunday = addLabelToPanel(centerPanel, "Sonntag");

        spinButton = new JButton("Spin");
        spinButton.addActionListener(this::actionPerformed);

        jFrame.add(topPanel, BorderLayout.NORTH);
        jFrame.add(centerPanel, BorderLayout.CENTER);
        jFrame.add(spinButton, BorderLayout.SOUTH);

        jFrame.setVisible(true);
    }

    private void gamesInput() {
        games.add("GTA V");
        games.add("Subnautica");
        games.add("Sea of Thives");
        games.add("Supraland");
        games.add("Rocket League");
        games.add("Coden");
        games.add("Kingdom new Lands");
        games.add("Among Us");
        games.add("ShellShock Live");
        games.add("Rogue Company");
        games.add("Age of Empire 2");
        games.add("Remnant from the Ashes");
        games.add("Counter Strike");
        games.add("StarCraft 2");
        games.add("Minecraft");
        games.add("FarCry 5");
    }

    private void actionPerformed(ActionEvent e) {
        if (e.getSource() == spinButton) {
            monday.setText("Montag: " + getRandomGame());
            tuesday.setText("Dienstag: " + getRandomGame());
            wednesday.setText("Mittwoch: " + getRandomGame());
            thursday.setText("Donnerstag: " + getRandomGame());
            friday.setText("Freitag: " + getRandomGame());
            saturday.setText("Samstag: " + getRandomGame());
            sunday.setText("Sonntag: " + getRandomGame());
        } else if (e.getSource() == darkModeCheckbox) {
            enableDarkMode(darkModeCheckbox.isSelected());
        }
    }

    private String getRandomGame() {
        return games.get(new Random().nextInt(games.size()));
    }

    public void enableDarkMode(boolean enabled) {
        Color bgColor = enabled ? new Color(40, 44, 48) : Color.WHITE;
        Color textColor = enabled ? Color.WHITE : Color.BLACK;
        Color buttonTextColor = enabled ? Color.BLACK : Color.WHITE; // Farbe des Button-Textes

        jFrame.getContentPane().setBackground(bgColor);
        updateComponentColors(jFrame.getComponents(), bgColor, textColor, buttonTextColor);
    }


    private void updateComponentColors(Component[] components, Color bgColor, Color textColor, Color buttonTextColor) {
        for (Component c : components) {
            if (c instanceof Container) {
                updateComponentColors(((Container) c).getComponents(), bgColor, textColor, buttonTextColor);
            }
            c.setBackground(bgColor);
            if (c instanceof JLabel) {
                c.setForeground(textColor);
            } else if (c instanceof JButton) {
                c.setForeground(buttonTextColor);
                c.setBackground(bgColor);
            }
        }
    }

    private JLabel addLabelToPanel(JPanel panel, String content) {
        JLabel label = new JLabel(content);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(label);
        return label;
    }
}

package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu {
    private JFrame frame;

    public MainMenu () {
        showMainMenu();
    }

    public void showMainMenu () {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;

        int start_x = screenWidth / 2 - (FRAME_WIDTH / 2);
        int start_y = screenHeight / 2 - (FRAME_HEIGHT / 2);
        
        frame = new JFrame("Main Menu");
        frame.setBounds(start_x, start_y, FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

        JLabel title = new JLabel("Login");
        title.setBounds(30, 10, 300, 50);
        title.setFont(new Font("SansSerif", Font.BOLD, 24));
        panel.add(title);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(10, 130, 260, 50);
        panel.add(loginBtn);

        loginBtn.addActionListener(e -> {
            frame.dispose();
            new Login();
        });

        JButton pencarianBtn = new JButton("ArtWork");
        pencarianBtn.setBounds(10, 200, 260, 50);
        panel.add(pencarianBtn);

        pencarianBtn.addActionListener(e -> {
            frame.dispose();
            new ArtWork();
        });

        JButton exitBtn = new JButton("EXIT");
        exitBtn.setBounds(10, 270, 260, 50);
        panel.add(exitBtn);

        exitBtn.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(panel);
        frame.setVisible(true);

    }
}

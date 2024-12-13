package view;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.ShowArtwork;
import model.classess.Artworks;
import model.classess.Users;

public class ArtWork {
    public ArtWork () {
        showAllArtWorks ();
    }

    public void showAllArtWorks () {
        ShowArtwork aw = new ShowArtwork();

        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 500, 700);

        JButton TransactionBtn = new JButton("Transaction");
        TransactionBtn.setBounds(70, 40, 120, 30);
        frame.add(TransactionBtn);
        new ShowArtwork();

        Artworks aw2 = ShowArtwork.getArtWorks();
        Users user = new Users();
        JLabel titleLabel = new JLabel(" Title : " + aw2.getTitle());
        titleLabel.setBounds(30, 70, 120, 30);
        frame.add(titleLabel);

        JLabel artistNameLabel = new JLabel(" Artist Name : " + user.getId_Users());
        artistNameLabel.setBounds(30, 120, 120, 30);
        frame.add(artistNameLabel);

        JLabel imageLabel = new JLabel(" Description : " + aw2.getDescription());
        imageLabel.setBounds(30, 170, 120, 30);
        frame.add(imageLabel);

        ImageIcon photoIcon = new ImageIcon(aw2.getImages().getAbsolutePath());
        JLabel photoLabel = new JLabel(photoIcon);
        photoLabel.setBounds(690, 80, 240, 300);
        frame.add(photoLabel);

        JButton buyBookBtn = new JButton("Add Artwork");
        buyBookBtn.setBounds(70, 270, 120, 30);
        frame.add(buyBookBtn);

        buyBookBtn.addActionListener(e -> {
            String title = aw2.getTitle();
            String description = aw2.getDescription();
            File img = aw2.getImages();
            int id_User = user.getId_Users();
            frame.dispose();
        });
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.classess.Artworks;;

public class ShowArtwork {
    static DatabaseHandler conn = new DatabaseHandler();

    public ShowArtwork() {
        getArtWorks();
    }

    public static Artworks getArtWorks() {
        Artworks aw = new Artworks();
        try {
            conn.connect();
            String query = "SELECT * FROM artworks";
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        return aw;
    }
}
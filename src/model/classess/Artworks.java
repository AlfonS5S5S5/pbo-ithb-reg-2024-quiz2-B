package model.classess;
import java.io.File;

public class Artworks {
    private int id_artworks;
    private String title;
    private String description;
    private File images;
    
    public Artworks(int id_artworks, String title, String description, File images) {
        this.id_artworks = id_artworks;
        this.title = title;
        this.description = description;
        this.images = images;
    }

    public Artworks() {

    }

    public int getId_artworks() {
        return id_artworks;
    }
    public void setId_artworks(int id_artworks) {
        this.id_artworks = id_artworks;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public File getImages() {
        return images;
    }
    public void setImages(File images) {
        this.images = images;
    }
}

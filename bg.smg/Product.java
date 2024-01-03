
import javax.swing.*;


public class Product {
    private String title;
    private String seller;
    private ImageIcon coverImage;

    public Product(String title, String author, ImageIcon coverImage) {
        this.title = title;
        this.seller = seller;
        this.coverImage = coverImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public ImageIcon getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(ImageIcon coverImage) {
        this.coverImage = coverImage;
    }
}
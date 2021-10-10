package Domain;

public class Categories {
     String title;
    String picture;

    public Categories(String title, String picture) {
        this.title = title;
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public String getPicture() {
        return picture;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}

package Domain;

public class Categories {
    int id;
    String title;
    String picture;


    public Categories(int id, String title, String picture) {
        this.id = id;
        this.title = title;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPicture() {
        return picture;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}

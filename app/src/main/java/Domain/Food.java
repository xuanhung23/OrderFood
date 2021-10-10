package Domain;

public class Food {
    private String name;
    private double fee;
    private String picture;
    private String description;
    private int numberInCart;

    public Food(String name, double fee, String picture, String description, int numberInCart) {
        this.name = name;
        this.fee = fee;
        this.picture = picture;
        this.description = description;
        this.numberInCart = numberInCart;
    }

    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    public String getPicture() {
        return picture;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberInCart() {
        return numberInCart;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }
}

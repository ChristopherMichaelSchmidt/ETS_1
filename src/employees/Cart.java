package employees;

import java.util.Objects;

public class Cart implements Comparable<Cart>{
    private int totalItems;
    private String userNAme;
    private int numArticles;
    private double totalAmount;

    public Cart(int totalItems, String userNAme, int numArticles, double totalAmount) {
        this.totalItems = totalItems;
        this.userNAme = userNAme;
        this.numArticles = numArticles;
        this.totalAmount = totalAmount;
    }


    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public String getUserNAme() {
        return userNAme;
    }

    public void setUserNAme(String userNAme) {
        this.userNAme = userNAme;
    }

    public int getNumArticles() {
        return numArticles;
    }

    public void setNumArticles(int numArticles) {
        this.numArticles = numArticles;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return totalItems == cart.totalItems && numArticles == cart.numArticles && Double.compare(cart.totalAmount, totalAmount) == 0 && Objects.equals(userNAme, cart.userNAme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalItems, userNAme, numArticles, totalAmount);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "totalItems=" + totalItems +
                ", userNAme='" + userNAme + '\'' +
                ", numArticles=" + numArticles +
                ", totalAmount=" + totalAmount +
                '}';
    }


    @Override
    public int compareTo(Cart o) {
        if(totalAmount<o.totalAmount){
            return 1;
        }
        if(totalAmount>o.totalAmount){
            return -1;
        }
        return 0;
    }
}

/**
 * Created by Arthur on 27/02/2016.
 */
package Model;

public class Offer implements Purchasable {
    private double price;
    private int quantityAvailable;
    private Seller seller;

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public Product getProduct() {
        return null;
    }
}

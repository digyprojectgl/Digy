package Model;

import java.util.Date;

/**
 * Created by Arthur on 27/02/2016.
 */


public class QuoteRequest {
    private Date date;
    private int quantity;
    private String comment;
    private Customer requester;
    private Product requestedProduct;

    public QuoteAnswer answerQuote(Seller seller, double price, String comment) {
        return null;
    }
}

package Model;

import java.util.Collection;

/**
 * Created by Arthur on 27/02/2016.
 */

public class Seller extends User {
    private String profile;
    private String SIRET;
    private String webAdress;

    @Override
    public Comment postComment(User from, String message) {
        return null;
    }

    @Override
    public void deleteComment(Comment comment) {

    }

    @Override
    public Notification notify(String content) {
        return null;
    }

    public Product createProduct(String label, ProductCategory category) {
        return null;
    }

    public Collection<QuoteRequest> getPendingQuoteRequest() {
        return null;
    }
}

package Product;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String productName;
    private int priceProduct;
    private int quanity;

    public Product(String productName, int priceProduct, int newQuanity){
        this.productName = productName;
        this.priceProduct = priceProduct;
        this.quanity = newQuanity;
    }


    public String getProductName() {
        return productName;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public int getQuanityProduct() {
        return quanity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }
}

import Product.Product;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Product>products;


    public InventoryManager(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(String productName){
        for(int i = 0; i < products.size(); i++){
            Product product = products.get(i);
            if(product.getProductName().equals(productName)){
                products.remove(i);
                System.out.println("Товар " + productName + " был успешно удален!");
                return;
            }
        }
        System.err.println("Товар " + productName + " не найден!");
    }
    public void updateProductQuanity(String productName, int newQuanity){
        for(Product product: products){
            if(product.getProductName().equals(productName)){
                product.setQuanity(newQuanity);
                System.out.println("Товар " + productName + " был успешно обновлен!");
                return;
            }
        }
        System.err.println("Товар " + productName + " был не найден!");
    }

    public void checkProductAvailability(String productName){
        for(Product product: products){
            if(product.getProductName().equals(productName)) {
                System.out.println("Товар " + product.getProductName() + " информация о нем:");
                System.out.println("Цена: " + product.getPriceProduct());
                System.out.println("Количество: " + product.getQuanityProduct());
            }
        }
    }

    public Product createProduct(String productName, int priceProduct, int quanity){
        Product product = new Product(productName, priceProduct, quanity);
        products.add(product);
        return product;
    }

    public void listAllProducts(){
        if(products.isEmpty() ){
            System.out.println("Инвентарь пуст!");
        }
        else {
            System.out.println("Список товаров в инвентаре: ");
            for(Product product: products){
                    System.out.println("Товар " + product.getProductName() + " информация о нем:");
                    System.out.println("Цена: " + product.getPriceProduct());
                    System.out.println("Количество: " + product.getQuanityProduct());
                    System.out.println("----------------------------------------------");
            }
        }
    }


}

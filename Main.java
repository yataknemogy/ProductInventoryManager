import Product.Product;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("-------------------------------------------------");
            System.out.println("Выберите действие и введите в поле ввода цифру:");
            System.out.println("1. Добавить товар в инвентарь");
            System.out.println("2. Удалить товар из инвентаря по его названию");
            System.out.println("3. Обновить количество товара по его названию");
            System.out.println("4. Проверить наличие товара по его названию");
            System.out.println("5. Вывести список всех товаров в инвентаре");
            System.out.println("6. Exit");
            int chooseInput = scanner.nextInt();
            scanner.nextLine();
            switch (chooseInput){
                case 1:
                    System.out.println("Введите наименование товара: ");
                    String productName = scanner.nextLine();
                    System.out.println("Введите цену: ");
                    int priceProduct = scanner.nextInt();
                    System.out.println("Количество товара в инвентаре: ");
                    int quanityProduct = scanner.nextInt();
                    inventoryManager.addProduct(new Product(productName, priceProduct, quanityProduct));
                    System.out.println("Вы успешно добавили " + productName + " в инвентарь!");
                    break;
                case 2:
                    System.out.println("Введите наименование товара: ");
                    String productNameRemove = scanner.nextLine();
                    inventoryManager.removeProduct(productNameRemove);
                    break;
                case 3:
                    System.out.println("Введите наименование товара: ");
                    String nameProductUpdate = scanner.nextLine();
                    System.out.println("Введите количество товара: ");
                    int quainityProductCheck = scanner.nextInt();
                    inventoryManager.updateProductQuanity(nameProductUpdate, quainityProductCheck);
                    break;
                case 4:
                    System.out.println("Введите наименование товара: ");
                    String nameProductCheck = scanner.nextLine();
                    inventoryManager.checkProductAvailability(nameProductCheck);
                    System.out.println("Товар " + nameProductCheck + " в наличии!");
                    break;
                case 5:
                    inventoryManager.listAllProducts();
                    break;
                case 6:
                    System.out.println("Successful!");
                    return;
                default:
                    System.err.println("Неверный выбор, попробуйте еще раз!");
            }
        }
    }
}


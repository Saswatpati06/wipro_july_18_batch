package Collections;
import java.util.*;
public class ProductComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        int priceCompare = Double.compare(p1.price, p2.price);
        if (priceCompare != 0) {
            return priceCompare; 
        } else {
            return p1.name.compareTo(p2.name); 
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(201, "Laptop",   75000.0));
        products.add(new Product(202, "Keyboard", 1500.0));
        products.add(new Product(203, "Mouse",    1500.0));
        products.add(new Product(204, "Monitor",  8500.0));
        products.add(new Product(205, "Printer",  8500.0));

        Collections.sort(products, new ProductComparator());

        System.out.println("Products sorted by price, then name:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

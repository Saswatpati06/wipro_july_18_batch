package Collections;

//Product class with price and name fields
class Product {
 int id;
 String name;
 double price;

 public Product(int id, String name, double price) {
     this.id = id;
     this.name = name;
     this.price = price;
 }

 public String toString() {
     return id + "_" + name + "_" + price;
 }
}

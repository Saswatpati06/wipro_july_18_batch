package Billing;

public class Main {
    public static void main(String[] args) {
        Bill electric = new ElectricityBill(300); 
        Bill water = new WaterBill(1000);      
        electric.generateBill();
        water.generateBill();
    }
}

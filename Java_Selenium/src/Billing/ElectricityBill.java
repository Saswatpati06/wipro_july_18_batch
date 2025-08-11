package Billing;

public class ElectricityBill extends Bill {
    private int units;
    private double rate = 7.5;

    public ElectricityBill(int units) {
        this.units = units;
    }
    public void generateBill() {
        double amount = units * rate;
        System.out.println("Electricity Bill: ₹" + amount);
    }
}

package Billing;

public class WaterBill extends Bill {
    private int liters;
    private double rate = 0.10;

    public WaterBill(int liters) {
        this.liters = liters;
    }

    public void generateBill() {
        double amount = liters * rate;
        System.out.println("Water Bill: ₹" + amount);
    }
}

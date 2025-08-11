package Java_labs_31_07;

class PrimeSumThread extends Thread {
    private int start, end, sum = 0;
    public PrimeSumThread(int start, int end) {
        this.start = start; this.end = end;
    }
    public void run() {
        for (int i = start; i <= end; i++)
            if (isPrime(i)) sum += i;
    }
    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    public int getSum() { return sum; }
}
public class PrimeSumMultiThread {
    public static void main(String[] args) throws InterruptedException {
        PrimeSumThread t1 = new PrimeSumThread(1, 50);
        PrimeSumThread t2 = new PrimeSumThread(51, 100);
        t1.start(); t2.start();
        t1.join(); t2.join();
        int total = t1.getSum() + t2.getSum();
        System.out.println("Total sum of primes: " + total);
    }
}

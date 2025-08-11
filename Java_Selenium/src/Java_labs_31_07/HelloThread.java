package Java_labs_31_07;

class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        HelloThread t = new HelloThread();
        t.start();
    }
}




package Java_labs_25_1_07;

public class Temperature{
	private double celcius;
	

public double getCelcius() {
	return celcius;
}
public double toFarenhit() {
	return (celcius*9/5)*32;
}

public double kelvin() {
	return celcius+273;
}
public void setCelsius(double celsius) {
    if (celsius >= -273) { 
        this.celcius = celsius;
    } else {
        System.out.println("Invalid");
        this.celcius = -273; 
    }
}
    public void Display() {
    	System.out.println("Celsius:" + celcius);
        System.out.println("Fahrenheit:" + toFarenhit());
        System.out.println("Kelvin:" + kelvin() );
    	
    	
    }
    	public static void main(String[] args) {
    		 Temperature t1 = new Temperature();
    	        t1.setCelsius(25);     
    	        t1.Display();

    	        Temperature t2 = new Temperature();
    	        t2.setCelsius(-300); 
    	        t2.Display();
    	}

    }


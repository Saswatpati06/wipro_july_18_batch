package Day2407;
import labsessions.Day2407.*;

class xyz extends Customers {
	public static void AccessingPublicData(){
//		Company.displayCompanyData();
	}
	public static void AccessingProtectedData() {
		Customers.displayCustomerData();  // accessable
	}
	public static void AccessingDefaultData() {
//		Games.displayGameData();    // not accessable
	}
}

public class AccessingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company.displayCompanyData();  //accessing public class methods
		
//		Customers.displayCustomerData(); //accessing protected class methods
		
//		Games.displayGameData();  	//accessing default class methods
	}

}

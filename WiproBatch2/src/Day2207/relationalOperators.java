package Day2207;

public class relationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=5;
		String res="";
		if(a>b) {
			res="greater than";
		} else if(a==b) {
			res="equal";
		} else if(a<b) {
			res="less than";
		}
		int c=5, d=6;
		if(c>=d) {
			res="greater than or equal to";
		} 
		if(c<=d) {
			res="less than or equal to";
		}
		if(c!=d) {
			res="not equal to";
		}
		System.out.println(res);
		if(true || false) {
			System.out.println("OR condition");
		}
		if(true && true) {
			System.out.println("AND condition");
		}
		if(!false) {
			System.out.println("Not condition");
		}
		int t1=8, t2=10;
		t1+=5;
		t2-=2;
		System.out.println(t1>t2?t1:t2); // max
	}

}

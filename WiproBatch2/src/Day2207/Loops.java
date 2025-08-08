package Day2207;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5, i=10, sum=0;
		while(n>0) {
			sum+=n;
			n--;
		}
		System.out.println(sum);
		do {
			System.out.print(i+" ");
			i--;
		} while(i>=1);
		System.out.println();
		n=5;
		for(int idx=1;idx<=10;idx++) {
			System.out.println(n+" x "+idx+" = "+n*idx);
		}
	}

}

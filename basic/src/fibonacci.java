import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int f1 = 0;
		int f2 = 1;
		int t;
		
		for(int i= 0; i<n-1; i++) {
			t = f1 + f2;
			f1 = f2;
			f2 = t;
		}
		System.out.println(f2);
	}

}

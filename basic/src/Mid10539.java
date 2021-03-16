import java.util.Scanner;

public class Mid10539 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int run = 0;
		for (int i=0; i<N; i++) {
			int t= sc.nextInt();
			int e = (i+1)*t -run;
			System.out.println(e + " ");
			run +=0;
		}
			
	}

}

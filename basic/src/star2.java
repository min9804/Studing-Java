import java.util.Scanner;
public class star2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		while (N > 0) {
			for (int i=0; i<N; i++)
				System.out.print("*");
			System.out.println();
			N--;
		}
	}

}
 
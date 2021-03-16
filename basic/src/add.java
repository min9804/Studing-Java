import java.util.Scanner;

public class add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int N = sc.nextInt();
				sc.close();
				
				int ss = 0;
				for (int i=1; i<=N; i++)
					ss = ss + i;
				System.out.println(ss);
	}
}

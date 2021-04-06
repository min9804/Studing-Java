import java.util.Scanner;

public class Mid1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int t1 = N/10 + N%10;
		int t = (N%10)*10 + t1%10;
		int cnt = 1;
		
		while (t != N) {
			System.out.println(t);
			t1 = t/10 + t%10;
			t = (t%10)*10 + t1%10;
			cnt = cnt + 1;
		}
		System.out.println(cnt);
	}
}

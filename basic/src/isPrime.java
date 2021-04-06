import java.util.Scanner;
public class isPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(), cnt = 0;
		for (int t=0; t<T; t++) {
			boolean isPrime = true;
			int n = sc.nextInt();
			if (n==1) continue;
			for (int i=2; i*i <= n; i++) {
				if (n%i ==0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}

}

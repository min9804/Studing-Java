import java.util.Scanner;
public class Mid10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int mi = 1000000, mx = -1000000;
		for (int i=0; i<N; i++) {
			int t = sc.nextInt();
			if (t>mx) mx = t;
			if (t<mi) mi = t;
		}
		sc.close();
		System.out.println(mi+" "+ mx);
	}

}

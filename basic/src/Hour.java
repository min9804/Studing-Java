import java.util.Scanner;

public class Hour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		sc.close();
		
		int hm = hour*60+min;
		int h, m;
		hm = hm - 45;
		if (hm < 0)
			hm = hm + 1440;
		h = hm / 60;
		m = hm % 60;
		System.out.println(h + " " + m);
	}

}

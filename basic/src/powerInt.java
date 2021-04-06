import java.util.Scanner;
public class powerInt {
	static int power(int x, int y) {
		int ss = 1;
		for (int i = 0; i<y; i++)
		{
			ss = ss*x;
		}
		return ss;
	}
	
	public static void main(String[] args) {
		System.out.println(power(2,3));
		int B =2, n = 5, ss=0;
		for (int i = 0; i<=n; i++) {
			ss = ss + power(B,i);
		}
		System.out.println(ss);
	}
}

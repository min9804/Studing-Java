public class powerDouble {
	static double power(double x, int y) {
		double ss =1;
		for (int i=0; i<y; i++) {
			ss = ss*x;
		}
		return ss;
	}
	
	public static void main(String[] args) {
		System.out.println(power(2,3));
		int n =5;
		double B=2.1, ss = 0;
		for (int i =0; i<=n; i++)
		{
			ss = ss+power(B,i);
		}
		System.out.println(ss);
	}

}
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt(), k = fs.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
			}
			boolean exists = false;
			for (int x : a) {
				if (x == k) {
					exists = true;
				}
			}
			System.out.println((exists ? "YES" : "NO"));
		}
		fs.close();
	}
}

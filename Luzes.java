import java.util.*;
public class Luzes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			try {
			int n = in.nextInt();
			if (n == 0) {
				break;
			}
			int m = in.nextInt();
				
				int a[] = new int[n];
				
				for (int i = 0; i < a.length; i++) {
					a[i] = 0;
				}
				
				for(int i = 0;i < m;i++) {
					int k = in.nextInt();
					for (int j = 0; j < a.length; j++) {
						if((j + 1) % k == 0) {
							a[j] = a[j] == 0 ? 1 : 0;
						}
					}
				}
				String r="";
				for (int i = 0; i < a.length; i++) {
					r += ((a[i] == 1 ? 'L' : 'D'));
				}
				System.out.println();
				
			} catch (Exception e) {
				break;
			}
		}
	}
}

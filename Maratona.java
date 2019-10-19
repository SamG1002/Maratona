import java.util.*;
public class Maratona {
	static boolean compara(int[] a,int[] b)
	{
		if(a[0] < b[0])
			return true;
		if(a[0] > b[0])
			return false;
		
		if(a[1] < b[1])
			return true;
		if(a[1] > b[1])
			return false;
		
		return true;
	}
	public static void main(String[] args) {
		while (true) {			
			try {
				Scanner in = new Scanner(System.in);
				int n = in.nextInt();
				if(n == 0) break;
				int a[][] = new int[n][2];
				for (int i = 0; i < n; i++) {
					a[i][1] = i+1;
				}
				for (int i = 0; i < n; i++) {
					int q = in.nextInt();
					for (int j = 0; j < 10; j++) {
						int h,m,s;
						String t = in.next();
						String aux[] = t.split(":");
						h = (Integer.parseInt(aux[0]) * 60) * 60;
						
						m =  Integer.parseInt(aux[1]) * 60;
						s =  Integer.parseInt(aux[2]);
						
						if(j % 2 == 0) {
							a[q-1][0] += h + m + s;
						}
						else {
							a[q-1][0] += h + m + s;
						}
					}
				}
				
				for (int i = 0; i < a.length; i++) {
					for (int j = i+1; j < a.length; j++) {
						if(!compara(a[i],a[j])) {
							int[] aux = a[i];
							a[i] = a[j];
							a[j] = aux;
						}
					}
				}
				
				for (int i = 0; i < a.length; i++) {
					System.out.println(a[i][1]);
				}
			} catch (Exception e) {
				break;
			}
		}		
		
	}
}

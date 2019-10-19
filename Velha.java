import java.util.*;
public class Velha {
	static char verifica(int[][]a)
	{
		if(a[0][0] == a[0][1] && a[0][2] == a[0][1] && a[0][1] != 0) {
			return a[0][0] == 1 ? 'X' : 'O';
		}
		if(a[1][0] == a[1][1] && a[1][2] == a[1][1] && a[1][1] != 0) {
			return a[1][0] == 1 ? 'X' : 'O';
		}
		if(a[2][0] == a[2][1] && a[2][2] == a[2][1] && a[2][1] != 0) {
			return a[2][0] == 1 ? 'X' : 'O';
		}
		
		if(a[0][0] == a[1][0] && a[2][0] == a[1][0] && a[1][0] != 0) {
			return a[0][0] == 1 ? 'X' : 'O';
		}
		if(a[0][1] == a[1][1] && a[2][1] == a[1][1] && a[1][1] != 0) {
			return a[0][1] == 1 ? 'X' : 'O';
		}
		if(a[0][2] == a[1][2] && a[2][2] == a[1][2] && a[1][2] != 0) {
			return a[0][2] == 1 ? 'X' : 'O';
		}
		
		if(a[0][0] == a[1][1] && a[0][0] == a[2][2] && a[2][2] != 0) {
			return a[0][0] == 1 ? 'X' : 'O';
		}		
		if(a[0][2] == a[1][1] && a[1][1] == a[2][0] && a[2][0] != 0) {
			return a[0][2] == 1 ? 'X' : 'O';
		}
		
		return '0';

	}
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		
		while (true) {
			try {
				int a[][] = new int[3][3];				
				
				for (int i = 0; i < a.length; i++) {					
					for (int j=0; j < a.length; j++) {
						a[i][j] = in.nextInt();					
					}				
				}
				
				
				char r = verifica(a);
				
				if(r == 'X' || r == 'O'){
					System.out.println(r);
				}
				else {
					System.out.println("Empate");
				}
				
			} catch (Exception e) {
				break;
			}
			
					
					
			
		}
		
	}
}
 
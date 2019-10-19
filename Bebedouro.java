import java.util.*;
public class Bebedouro {
	public static void main(String[] args) {
		
		while(true) {
			try {
				Scanner in = new Scanner(System.in);
				int n1,n2,n3,menor;
				n1 = in.nextInt();
				if(n1 == 0) break;
				n2 = in.nextInt();
				if(n2 == 0) break;
				n3 = in.nextInt();
				if(n3 == 0) break;
				
				int r = n2 * 2 + n3 * 4;
				menor = r;
				r = n1 * 2 + n3 * 2;
				if (r < menor) menor = r;						
				r = n1 * 4 + n2 * 2;
				if (r < menor) menor = r;
				String res = Integer.toString(menor); 
				
				System.out.println(res);
			} catch (Exception e) {
				break;
			}			
			
			
			
		}
	}
}

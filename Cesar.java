import java.util.*;
public class Cesar {
	public static void main(String[]args) {
		Scanner in =new Scanner (System.in);
		String tex;
		while(true) {
			tex = in.next();
			if(tex.equals("0")) {
				break;
			}
			String r="";
			for(int i = 0;i < tex.length();i++) {
				if(tex.charAt(i) < 'D') {
					if(tex.charAt(i) == 'A') {
						r += "X";
					}
					if(tex.charAt(i) == 'B') {
						r += "Y";
					}
					if(tex.charAt(i) == 'C') {
						r += "Z";
					}
				}
				else {
					r += (char)(tex.charAt(i) - 3);
				}
			}
			
			System.out.println(r);
		}		
	}

}

package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
public class Karakterer {

	public static void main(String[] args) {
		
		int x = 10;
		
		for (int i =1; i <= x; i++) {
			
			int poengsum = parseInt(showInputDialog("Din poengsum : "));
		
			if ((poengsum<=100) && (poengsum>=0)) {
				karakter (poengsum);
			} else {
				showMessageDialog (null, "Ugyldig poengsum");
				i--;
			}
		}		
	}
	
	
	private static void karakter(int x) {
		if ((x>=90) && (x<=100)) {
			showMessageDialog (null, "Din karakter er A");
		
		} else if ((x<=89) && (x>=80)) {
			showMessageDialog (null, "Din karakter er B");
		
		} else if ((x<=79) && (x>=60)) {
			showMessageDialog (null, "Din karakter er C");
			
		} else if ((x<=59) && (x>=50)) {
			showMessageDialog (null, "Din karakter er D");
			
		} else if ((x<=49) && (x>=40)) {
			showMessageDialog (null, "Din karakter er E");
		
		}else if ((x<=39) && (x>=0)) {
			showMessageDialog (null, "Din karakter er F");
		
		}
	}
	
	
		
}

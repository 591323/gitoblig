package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
public class Fakultet {

	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("Skriv et heltall du vil ha fakultetet av :"));
		
		int x = 1;
		
		while (n>0 ) {
			
			x *=n;
			
			n--;
				
			}
			showMessageDialog (null, x);
			
		}
		

	}



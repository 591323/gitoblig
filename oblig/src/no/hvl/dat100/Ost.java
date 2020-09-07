package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class Ost {

	public static void main(String[] args) {
		
		double intekt = Double.parseDouble(showInputDialog("Din inntekt : "));

        double trinn1 = 180800;
        double trinn2 = 254500;
        double trinn3 = 639750;
        double trinn4 = 999950;


        double pros1 = 0.019;
        double pros2 = 0.042;
        double pros3 = 0.132;
        double pros4 = 0.162;

        double max12 = (trinn2 - trinn1) * pros1;
        double max23 = (trinn3 - trinn2) * pros2;
        double max34 = (trinn4 - trinn3) * pros3;

        double peng1 = (intekt - trinn1) * pros1;
        double peng2 = (intekt - trinn2) * pros2;
        double peng3 = (intekt - trinn3) * pros3;
        double peng4 = (intekt - trinn4) * pros4;

        double betale1 = (peng2 + max12);
        double betale2 = (peng3 + max12 + max23);
        double betale3 = (peng4 + max12 + max23 + max34);

        if (intekt <= trinn1) {
            showMessageDialog (null, "Du betaler 0kr i trinnskatt");

        } else if (intekt <= trinn2) {
            showMessageDialog (null, "Du betaler " + peng1 + "kr i trinnskatt");

        } else if (intekt <= trinn3) {
            showMessageDialog (null, "Du betaler " + betale1 + "kr i trinnskatt");

        } else if (intekt <= trinn4) {
            showMessageDialog (null, "Du betaler " + betale2 + "kr i trinnskatt");

        } else {
            showMessageDialog (null, "Du betaler " + betale3 + "kr i trinnskatt");

        }
		
		
		
		

	}

}

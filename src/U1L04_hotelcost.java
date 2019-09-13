import javax.swing.JOptionPane;

public class U1L04_hotelcost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nights;
		do {
		String input1 = JOptionPane.showInputDialog(null, "How many nights do you want to stay ");
		nights = Integer.parseInt(input1);
		//System.out.print(nights);
		
	} while (nights < 0);
	
		int hiltonGV = 200;
		int sherton = 150;
		int gardenInn = 500;
		
		int costHGV = hiltonGV * nights;
		int costS = sherton * nights;
		int costGI = gardenInn * nights;
		System.out.println(costHGV + " "+ costS + " " + costGI);
		String CHGV = " ";
		while (costHGV > 0) {
		CHGV = CHGV + "* ";
		costHGV-= 50;
		}
		String CS = " ";
		while (costS > 0) {
		CS = CS + "* ";
		costS-= 50;
		}
		String CGI = " ";
		while (costGI > 0) {
		CGI = CGI + "* ";
		costGI-= 50;
		}
		JOptionPane.showMessageDialog(null,"Hilton Gargen Inn" + CHGV + " Sherton" + CS + "Garden" + CGI);
	}
}

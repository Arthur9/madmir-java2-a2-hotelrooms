import javax.swing.JOptionPane;


public class HotelBilling {

	final static double  SALES_TAX = 0.13f;
	
	public static void main(String[] args) {
		/*
		 * In the main method, declare and initialize variables
		 * for room price, number of rooms booked, and coupon rate.
		 * 
		 * Then call each case of the overloaded method 
		 * calculateBill() to demonstrate the use of overloaded 
		 * methods
		 */
		
		/*Declare value for objects*/
		
		double roomRate = 95.00;
		double coupon = 0.10;
		double totalBill;
		int numRooms= Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rooms:"));
		
		totalBill = computeBill(roomRate);		
		JOptionPane.showMessageDialog(null,  "Your Total per room is $" + totalBill);
		
		
		totalBill = computeBill(roomRate, numRooms);
		JOptionPane.showMessageDialog(null, "Your total with tax for " + numRooms + " rooms is $" + totalBill);
		
		
		totalBill = computeBill(roomRate, numRooms, coupon);
		JOptionPane.showMessageDialog(null, "Your Total with tax for " + numRooms + " rooms(s) is $" + totalBill + ".\nThis Includes a discount of " + coupon * 100 + "%\n\nThanks for Checking us Out!" );
		
			
	}
	/* This is my piece of data for one piece of data
	 * the room rate*/
	
	public static double computeBill(double rate){
		double tax = rate * SALES_TAX;
		double finalRate = rate + tax;
		finalRate = twoDecimalRounding(finalRate);
		return finalRate;
	}
	/*This is my piece of data for two pieces of data
	 * the room rate and the quantity booked */
	
	public static double computeBill(double rate, int roomQuantity){
		double tax = rate * SALES_TAX;
		double finalRate = rate + tax;
		finalRate = finalRate * roomQuantity;
		finalRate = twoDecimalRounding(finalRate);
		return finalRate;
	}
	/* This is a piece of data for three pieces of data*/
	
	public static double  computeBill (double rate, int roomQuantity, double coupon){
		double tax = rate * SALES_TAX;
		double finalRate = rate + tax;
		finalRate = finalRate * roomQuantity * (1 -coupon);
		finalRate = twoDecimalRounding(finalRate);
		return finalRate;
	}
	/* This Method receives a double and returns the same double rounded to two decimal points*/
	
	public static double twoDecimalRounding(double decimal){
		decimal = decimal*100;
		decimal = decimal + 0.5;
		decimal = (int) decimal;
		decimal = decimal/100;
		return decimal;
	}

	/*  
	 * Here you will create four new methods:
	 * -- Three cases of the overloaded method calculateBill()
	 * -- A method called twoDecimalRounding() which will
	 * 		be called by each case of the calculateBill() method.
	 */
}

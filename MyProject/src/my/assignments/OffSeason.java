package my.assignments;

public class OffSeason extends OnSeason{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double price = 1000.00;

	        // Creating objects for OnSeason and OffSeason
	        OnSeason onSeason = new OnSeason();
	        OffSeason offSeason = new OffSeason();

	        // Calculating the onseason and offseason discounts
	        double onSeasonDiscount = onSeason.discount(price);
	        double offSeasonDiscount = offSeason.discount(price);

	        // Print
	        System.out.println("Original Price: " + price +" Rs");
	        System.out.println("OnSeason Discount: " + onSeasonDiscount+" Rs");
	        System.out.println("Price After OnSeason Discount: " + (price - onSeasonDiscount)+" Rs");
	        System.out.println("OffSeason Discount: " + offSeasonDiscount +" Rs");
	        System.out.println("Price After OffSeason Discount: " + (price - offSeasonDiscount)+" Rs");
	    
	}
	 public double discount(double price) {
	        return price * 0.15; // 15% 
	    }
}

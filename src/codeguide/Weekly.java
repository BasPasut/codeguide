package codeguide;

//Exercise for KISS principle.
public class Weekly {
	public static void main(String[] args) {
		System.out.println(weekComplex(5));
		
	}

	public static String weekComplex(int dayweek) {
		if (dayweek == 1) {
			return "Monday";
		} 
		else if (dayweek == 2) {
			return "Tuesday";
		} 
		else if (dayweek == 3) {
			return "Wednesday";
		} 
		else if (dayweek == 4) {
			return "Thursday";
		} 
		else if (dayweek == 5) {
			return "Friday";
		} 
		else if (dayweek == 6) {
			return "Saturday";
		} 
		else if (dayweek == 7){
			return "Sunday";
		}
		else{
			throw new Error("Day in the week have to be between 1-7. Please try again.");
		}
		
		//TODO write the method that have the result same as weekComplex method, but try to use simpler and shorter way to done it.
		public static String weekSimple(int dayweek){
			return null;
		}
	}
}

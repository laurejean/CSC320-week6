
import java.util.Scanner;

public class Automobile {
	
	public static void main(String[] args) {
		
		String autoMake = "";
		String autoModel = "";
		String autoColor = "";
		int autoYear = 0;
		
		RemoveVehicle(autoMake, autoModel, autoColor, autoYear);
	}
	
	/**
	 * @desc
	 * @param Make
	 * @param Model
	 * @param Color
	 * @param Year
	 * @return
	 */
	public static void RemoveVehicle (String Make, String Model,String Color, int Year) {
		Make = "USA";
		Model = "Toyota";
		Color = "Black";
		Year = 2024;
		
		String inputMake = "";
		String inputModel = "";
		String inputColor = "";
		int inputYear = 0;
		boolean check1 = false;
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter the vehicule's make: ");
		inputMake = scnr.next();
		System.out.print("Please enter the vehicule's model: ");
		inputModel = scnr.next();
		System.out.print("Please enter the vehicule's color: ");
		inputColor = scnr.next();
		System.out.print("Please enter the vehicule's year: ");
		inputYear = scnr.nextInt();
		
		 if(inputMake.equalsIgnoreCase("USA") && inputModel.equalsIgnoreCase("Toyota") && inputColor.equalsIgnoreCase("Black") && inputYear == 2024) {
			 check1 = true;
			 System.out.print("It's a match! Therefore, this vehicule information will be removed form our system!");	
		 }else {
			 System.out.print("It's not a match.");
		 }
	} 

}

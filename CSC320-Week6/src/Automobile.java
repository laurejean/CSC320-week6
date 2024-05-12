public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;

    // Constructor
    public Automobile(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Method to add vehicle information
    public void addVehicle(String newMake, String newModel, String newColor, int newYear) {
        make = newMake;
        model = newModel;
        color = newColor;
        year = newYear;
        
    }

    // Method to update vehicle information
    public String updateVehicle(String newMake, String newModel, String newColor, int newYear) {
        if (!newMake.equals(make) || !newModel.equals(model) || !newColor.equals(color) || newYear != year) {
            make = newMake;
            model = newModel;
            color = newColor;
            year = newYear;
            return "Vehicle information updated successfully.";
        } else {
            return "No changes detected: Vehicle information remains the same.";
        }
    }

    // Method to remove vehicle information
    public String removeVehicle(String inputMake, String inputModel, String inputColor, int inputYear) {
        if (inputMake.equals(make) && inputModel.equals(model) && inputColor.equals(color) && inputYear == year) {
            // Match found, remove vehicle
            make = null;
            model = null;
            color = null;
            year = 0;
            return "Vehicle information removed successfully.";
        } else {
            return "Mismatch: Vehicle information not removed.";
        }
    }

}


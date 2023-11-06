
import Scooter;
import ScooterApp;
import User;
public class Main {
    public static void main(String[] args) {
        try {
            ScooterApp app = new ScooterApp();
            // Add some scooters at some stations
            for (int i = 0; i < 3; i++) {
                app.createScooter("Owings Mills");
            }
            for (int i = 0; i < 5; i++) {
                app.createScooter("West Cold Spring");
            }
            Scooter redScooter = app.createScooter("Johns Hopkins Hospital");
            User annie = app.registerUser("Annie", "GoCougs", 19);
            app.loginUser("Annie", "GoCougs");
            app.rentScooter(redScooter, annie);
            app.dockScooter(redScooter, "Old Court");
            // Display the application state
            app.printState();
        }
        catch(Exception e){
            System.out.println("Something went wrong.");
        }
    }
}
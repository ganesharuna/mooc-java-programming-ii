package FlightControl;

import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        FlightControl flights=new FlightControl();
        
        TextUI ui=new TextUI(flights,reader);
        
        ui.start();
        
        
    }
}

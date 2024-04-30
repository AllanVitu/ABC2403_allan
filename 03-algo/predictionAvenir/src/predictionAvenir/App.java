package predictionAvenir;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez l'heure (0-23): ");
        int heure = scanner.nextInt();

        System.out.print("Saisissez les minutes (0-59): ");
        int minutes = scanner.nextInt();

        
        if (heure < 0 || heure > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Les données saisies sont invalides.");
            return;
        }

        
        int minutesPlus = minutes + 3;
        int heurePlus = heure;

        
        if (minutesPlus >= 60) {
            minutesPlus -= 60;
            heurePlus++;

           
            if (heurePlus == 24) {
                heurePlus = 0;
            }
        }

        
        System.out.println("Dans 3 minutes, il sera " + heurePlus + ":" + minutesPlus);
        
        scanner.close();
    }
}

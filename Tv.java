import java.util.Scanner;

public class Tv {
    public static void main(String[] args) {
        System.out.println("Welcome to the TV Selector!");
        // Additional logic for TV selection can be added here
        // Scanning user input for TV model selection
        Scanner scanner = new Scanner(System.in);
        int model;
        System.out.print("Enter you preferred TV model: ");
        model = scanner.nextInt();
        // Add a switch statement to handle different TV models
        switch(model) {
            case 1:
                System.out.println("You have selected Model 100: Remote control, timer, stereo sound — $1000");
                break;
            case 2:
                System.out.println("You have selected Model 200: Adds picture-in-picture — $1200");
                break;
            case 3:
                System.out.println("You have selected Model 300: Adds HDTV, flat screen, 16x9 aspect ratio — $2400");
                break;
                //Add a default case to handle invalid input
            default:
                System.out.println("Invalid model selected.");
                break;
        }

        scanner.close();
    }
} 

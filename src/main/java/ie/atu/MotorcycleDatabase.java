package ie.atu;

import java.util.Scanner;

public class MotorcycleDatabase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my Motorcycle Database !");

        while (true) {
            System.out.println("\nPlease select an option or press 5 to Exit:");
            System.out.println("1. Create a new motorcycle");
            System.out.println("2. Read motorcycle details");
            System.out.println("3. Update motorcycle details");
            System.out.println("4. Delete a motorcycle");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Enter the make:");
                String make = scanner.nextLine();

                System.out.println("Enter the model:");
                String model = scanner.nextLine();

                System.out.println("Enter the year:");
                int year = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter the BHP:");
                int bhp = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter the style:");
                String style = scanner.nextLine();
                //scanner.nextLine();

                System.out.println("Enter the Licence Catagory:");
                String licence_catagory = scanner.nextLine();
                //scanner.nextLine();

                System.out.println("Enter the Top Speed (km/h):");
                int topSpeed = scanner.nextInt();

                RacerBike racerBike = new RacerBike(make, model, year, bhp, style, licence_catagory, topSpeed);
                racerBike.create();
            } else if (choice == 2) {
                System.out.println("Enter the make:");
                String make = scanner.nextLine();

                System.out.println("Enter the model:");
                String model = scanner.nextLine();

                RacerBike racerBike = new RacerBike(make, model, 0, 0, "", "", 0);
                racerBike.read();
            } else if (choice == 3) {
                System.out.println("Enter the make:");
                String make = scanner.nextLine();

                System.out.println("Enter the model:");
                String model = scanner.nextLine();

                System.out.println("Enter the new year:");
                int year = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter the new BHP:");
                int bhp = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter the new style:");
                String style = scanner.nextLine();
                scanner.nextLine();

                System.out.println("Enter the new Licence Catagory:");
                String licence_catagory = scanner.nextLine();
                scanner.nextLine();

                System.out.println("Enter the new Top Speed (km/h):");
                int topSpeed = scanner.nextInt();

                RacerBike racerBike = new RacerBike(make, model, year, bhp, style, licence_catagory, topSpeed);
                racerBike.update();
            } else if (choice == 4) {
                System.out.println("Enter the make:");
                String make = scanner.nextLine();

                System.out.println("Enter the model:");
                String model = scanner.nextLine();

                RacerBike racerBike = new RacerBike(make, model, 0, 0, "","", 0);
                racerBike.delete();
            } else if (choice == 5) {
                System.out.println("Exiting the Motorcycle Database. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
            }

            scanner.close();
            }
            }
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Showroom showroom = new Showroom();

        while (true) {

            System.out.println("\n==================================");
            System.out.println("     AUTOVAULT CAR SHOWROOM");
            System.out.println("==================================");
            System.out.println("1. Add Car");
            System.out.println("2. View Cars");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Brand: ");
                    String brand = sc.nextLine();

                    System.out.print("Enter Model: ");
                    String model = sc.nextLine();

                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    Car car = new Car(brand, model, year, price);
                    showroom.addCar(car);

                    break;

                case 2:

                    showroom.viewCars();
                    break;

                case 3:

                    System.out.println("Thank you for using AutoVault!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}
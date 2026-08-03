import java.util.ArrayList;

public class Showroom {

    ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
        System.out.println(" Car added successfully!");
    }

    public void viewCars() {

        if (cars.isEmpty()) {
            System.out.println("No cars available.");
            return;
        }

        for (Car car : cars) {
            car.displayCar();
        }
    }
}
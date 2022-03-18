package rentCompany.factory;

import rentCompany.car.Car;
import rentCompany.car.Cars;

public class RentCompany {

    private final Cars cars;

    public RentCompany() {
        this.cars = new Cars();
    }

    public static RentCompany create(){
        return new RentCompany();
    }

    public void addCar(Car car){
        this.cars.add(car);
    }

    public String generateReport(){
        return this.cars.getReport();
    }
}

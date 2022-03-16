package rentcompany;

import rentcompany.car.Car;
import rentcompany.car.CarFactory;
import rentcompany.car.Cars;

public class RentCompany extends CarFactory {

    private final Cars cars;

    public RentCompany() {
        this.cars = new Cars();
    }

    public static RentCompany create(){
        return new RentCompany();
    }

    @Override
    public void addCar(Car car){
        this.cars.add(car);
    }

    @Override
    public String generateReport(){
        return this.cars.getReport();
    }
}

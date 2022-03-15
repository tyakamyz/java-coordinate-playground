package rentcompany;

import rentcompany.car.Car;

public abstract class CarFactory {

    public abstract void addCar(Car car);

    public abstract String generateReport();
}

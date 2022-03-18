package rentCompany.car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private static final String NEWLINE = System.getProperty("line.separator");

    private final List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public void add(Car car) {
        this.cars.add(car);
    }

    public String getReport() {
        StringBuilder resultReport = new StringBuilder();

        for(Car car : cars) {
            resultReport.append(car.getName());
            resultReport.append(" : ");
            resultReport.append((int)car.getChargeQuantity());
            resultReport.append("리터");
            resultReport.append(NEWLINE);
        }

        return resultReport.toString();
    }
}

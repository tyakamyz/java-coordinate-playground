package rentcompany.car;

public class Avante extends Car {

    public Avante(double tripDistance){
        this.tripDistance = tripDistance;
        this.distancePerLiter = 15;
        this.name = "Avante";
    }

    @Override
    public double getDistancePerLiter(){
        return this.distancePerLiter;
    }

    @Override
    public double getTripDistance(){
        return this.tripDistance;
    }

    @Override
    public String getName(){
        return name;
    }
}

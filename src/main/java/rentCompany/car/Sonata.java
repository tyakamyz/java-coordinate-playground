package rentCompany.car;

public class Sonata extends Car {

    public Sonata(double tripDistance){
        this.tripDistance = tripDistance;
        this.distancePerLiter = 10;
        this.name = "Sonata";
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

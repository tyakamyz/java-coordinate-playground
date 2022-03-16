package rentcompany.car;

public class K5 extends Car {

    public K5(double tripDistance){
        this.tripDistance = tripDistance;
        this.distancePerLiter = 13;
        this.name = "K5";
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

package coordinateCalculator.domain;

import coordinateCalculator.factory.CoordinateCalculator;

import java.io.IOException;

public class Quadrangle extends CoordinateCalculator {

    public Lines lines;

    public Quadrangle() {
        this.points = new Points();
        this.lines = new Lines();
    }

    @Override
    public Double getCalculationResult() {


        return null;
    }

    public static void main(String[] args) throws IOException {

    }
}
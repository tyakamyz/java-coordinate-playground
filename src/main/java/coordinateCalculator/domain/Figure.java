package coordinateCalculator.domain;

public abstract class Figure {
    public final int STRAIGHT_POINT_COUNT = 2;
    public final int QUADRANGLE_POINT_COUNT = 4;
    public final int TRIANGLE_POINT_COUNT = 3;
    public final int RECTANGLE_LINE_COUNT = 2;
    public final int SQUARE_LINE_COUNT = 1;

    public Points points;
    public Lines lines;

    public abstract Double getCalculationResult();

    public abstract void createLines();

    public void setLinesToLinesLength() {
        lines.setLinesToLinesLength();
    }

    public void deduplicationLinesLength() {
        lines.deduplicationLinesLength();
    }
}

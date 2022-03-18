package coordinateCalculator.domain;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {

        if((x < 0 || x > 24) || (y < 0 || y > 24)){
            throw new IllegalArgumentException("0~24까지의 좌표만 가능합니다");
        }

        this.x = x;
        this.y = y;
    }
}

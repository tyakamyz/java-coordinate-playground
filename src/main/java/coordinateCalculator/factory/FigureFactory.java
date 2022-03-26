package coordinateCalculator.factory;

import coordinateCalculator.domain.Figure;
import coordinateCalculator.domain.FigureCreator;
import coordinateCalculator.domain.Points;

import java.util.HashMap;
import java.util.Map;

public class FigureFactory {
    private static final Map<Integer, FigureCreator> creators = new HashMap<>();

    static {
        creators.put(2, new LineCreator());
        creators.put(3, new TriangleCreator());
        creators.put(4, new QuadrangleCreator());
    }

    public static Figure getInstance(Points points) {
        FigureCreator figureCreator = creators.get(points.getSize());
        if (figureCreator == null) {
            throw new IllegalArgumentException("유효하지 않은 도형입니다.");
        }
        return figureCreator.create(points);
    }
}
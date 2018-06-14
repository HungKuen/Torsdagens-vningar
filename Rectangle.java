package com.academy;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Shape {
    public Point start;
    public Point end;

    /**
     * Rektangel konstruktor
     * @param start startpunkten
     * @param end slutpunkten
     */
    public Rectangle(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public List<Point> draw() {
        List<Point> points = new ArrayList<>();
        int xStart = start.getX();
        int yStart = start.getY();

        for (xStart = start.getX(); xStart <= end.getX(); xStart++) {
            points.add(new Point(xStart, start.getY()));
            points.add(new Point(xStart, end.getY()));

        }
        for (yStart = start.getY(); yStart <= end.getY(); yStart++) {
            points.add(new Point(start.getX(), yStart));
            points.add(new Point(end.getX(), yStart));
        }
        return points;
    }
}

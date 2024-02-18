// video explanation - https://youtu.be/p3HbBlcXDTE
// tag - math
package com.rajesh.algorithms;

public class EuclideanDistance {

    // private constructor
    private EuclideanDistance() {
    }

    /**
     * method to calculate the euclidean distance between two given points
     * 
     * @param x1 - position of first point on x-axis
     * @param y1 - position of first point on y-axis
     * @param x2 - position of second point on x-axis
     * @param y2 - position of second point on y-axis
     * @return calculated euclidean distance
     */
    private static double calculateEuclideanDistanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        // calculate difference in x values of the two points
        int xDifference = x1 - x2;

        // calculate difference in y values of the two points
        int yDifference = y1 - y2;

        // calculate and return the euclidean distance
        return Math.sqrt((xDifference * xDifference) + (yDifference * yDifference));
    }
}

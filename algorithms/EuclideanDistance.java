// video explanation - https://youtu.be/p3HbBlcXDTE
// tag - math
package algorithms;

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

    public static void main(String[] args) {
        // test algorithm
        System.out.println(calculateEuclideanDistanceBetweenTwoPoints(3, 3, 5, 3) == 2.0);
        System.out.println(calculateEuclideanDistanceBetweenTwoPoints(2, 2, 3, 3) == 1.4142135623730951);
    }
}
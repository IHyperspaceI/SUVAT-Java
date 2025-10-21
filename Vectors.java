import Math;

public class Vectors {
    /**
     * Gets the magnitude of the resulting vector
     * @param f1 length of first vector
     * @param angle1 angle (deg) of first vector
     * @param f2 length of second vector
     * @param angle2 angle (deg) of second vector
     */
    public static double getMagnitude(double f1, double angle1, double f2, double angle2) {
        //angle1 = Math.toRadians(angle1);
        //angle2 = Math.toRadians(angle2);

        double f1x = f1 * Math.sin(Math.toRadians(angle1));
        double f1y = f1 * Math.cos(Math.toRadians(angle1));
        double f2x = f2 * Math.sin(Math.toRadians(angle2));
        double f2y = f2 * Math.cos(Math.toRadians(angle2));
        return Math.sqrt((f1x + f2x) * (f1x + f2x) + (f1y + f2y) * (f1y + f2y));
    }

    
    /**
     * Gets the angle of the resulting vector
     * @param f1 length of first vector
     * @param angle1 angle (deg) of first vector
     * @param f2 length of second vector
     * @param angle2 angle (deg) of second vector
     */
    public static double getAngle(double f1, double angle1, double f2, double angle2) {
        angle1 = Math.toRadians(angle1);
        angle2 = Math.toRadians(angle2);

        double f1x = f1 * Math.sin(angle1);
        double f1y = f1 * Math.cos(angle1);
        double f2x = f2 * Math.sin(angle2);
        double f2y = f2 * Math.cos(angle2);
        return Math.toDegrees(Math.tan((f1y + f2y) / (f1x + f2x)));
    }
}

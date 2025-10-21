class Main {
    public static void main(String[] args) {
        double f1 = 3.72;
        double f2 = 9.54;
        double angle1 = 180-140.7;
        double angle2 = 180-160.8;
        System.out.println("Magnitude: " + Vectors.getMagnitude(f1, angle1, f2, angle2));
        System.out.println("Angle: " + Vectors.getAngle(f1, angle1, f2, angle2));
    }
}

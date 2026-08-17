public class Circle {
    double radii;

    Circle(double radii) {
        this.radii = radii;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(20);
        Circle c2 = new Circle(10);

        double pi = 3.14;
        double area = pi * c1.radii * c1.radii;
        System.out.println("area: " + area);
        double circum = 2 * pi * radii;
        System.out.println("circumference: " + circum);
    }
}
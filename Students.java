public class Students {
    String name;
    String roll;
    String dept;
    double cgpa;

    Students(String name, String roll, String dept, double cgpa) {
        this.name = name;
        this.roll = roll;
        this.dept = dept;
        this.cgpa = cgpa;
    }

    public static void main(String[] args) {
        Students s1 = new Students("sayan", "2025itb028", "IT", 6.9);
        Students s2 = new Students("anirban", "2025itb029", "IT", 8.5);
        Students s3 = new Students("pratik", "2025itb019", "IT", 6.2);

        if (s1.cgpa > s2.cgpa && s1.cgpa > s3.cgpa) {
            System.out.println("s1 has highest cgpa");
        } else if (s2.cgpa > s1.cgpa && s2.cgpa > s1.cgpa) {
            System.out.println("s2 has highest cgpa");
        } else if (s3.cgpa > s1.cgpa && s3.cgpa > s2.cgpa) {
            System.out.println("s3 has highest cgpa");
        }

    }
}
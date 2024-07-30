import java.util.Scanner;

class Area {
    float length;
    float breadth;
    Area(float length, float breadth) {
        setLength(length);
        setBreadth(breadth);
    }
    public void setLength(float length) {
        this.length = length;
    }
    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
    public float returnArea() {
        return length * breadth;
    }
}
public class practical_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        float length = sc.nextFloat();
        System.out.println("Enter the breadth of the rectangle:");
        float breadth = sc.nextFloat();
        Area a1 = new Area(length, breadth);
        System.out.println("The area of the rectangle is: " + a1.returnArea());
    }
}

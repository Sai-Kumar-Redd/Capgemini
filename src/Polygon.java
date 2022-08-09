/*import java.util.*;
public interface  Polygon {
    void calcArea();
    void calcPeri();
}
public class Square implements Polygon{
    float a;
    public Square(float i) {
        a = i;
    }
    public void calcArea()
    {
        System.out.prinln("Area of square is:"+a*a);

    }
    public void calcPeri(){
        System.out.println("Perimeter of square is: "+4*a);

    }

}
public class Rectangle implements Polygon {
    float l;
    float b;
}

    public Rectangle(float i, float j){

    l=i;
    b=j;
}
public void calcArea() {
    System.out.println("Area of Rectangle is :" + l * b);
}
public void calcPeri()
{
    System.out.println("Perimeter of Rectangle:"+2*(l*b));
}

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter the side of square ");
                float a = sc.nextFloat();
                Square s = new Square(a);
                s.calcArea();
                s.calcPeri();
                break;
        }
        case 2:
            System.out.println("Enter the length of Rectangle ");
        float l = sc.nextInt();
        float b = sc.nextInt();
        Rectangle r = new Rectangle(l, b);
        r.calcArea();
        r.calcPeri();
        break;
        default: System.out.println("Invalid input");

    }
    sc.close();
}*/



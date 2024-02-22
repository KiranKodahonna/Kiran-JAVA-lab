import java.util.Scanner;

abstract class Shape {
    abstract void printArea();
    int length, breadth;
}

class Rectangle extends Shape {
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void printArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle is " + area);
    }
}

class Triangle extends Shape {
    Triangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void printArea() {
        double area = 0.5 * length * breadth;
        System.out.println("Area of Triangle is " + area);
    }
}

class Circle extends Shape {
    Circle(int r) {
        length = r;
    }

    void printArea() {
        double area = 3.14 * length * length;
        System.out.println("Area of Circle is " + area);
    }
}

class Display {
    public static void main(String sx[]) {
        Scanner s1 = new Scanner(System.in);
        Rectangle r1 = new Rectangle(0, 0);
        System.out.println("Enter the Length and Breadth of Rectangle, to get its Area: ");
        int l = s1.nextInt();
        int b = s1.nextInt();
        r1 = new Rectangle(l, b);
        r1.printArea();
        Triangle t1 = new Triangle(0, 0);
        System.out.println("Enter the base and height of triangle, to get its Area: ");
        int bs = s1.nextInt();
        int h = s1.nextInt();
        t1 = new Triangle(bs, h);
        t1.printArea();
        Circle c1 = new Circle(0);
        System.out.println("Enter the Radius of Circle, to get its Area: ");
        int r = s1.nextInt();
        c1 = new Circle(r);
        c1.printArea();
    }
}

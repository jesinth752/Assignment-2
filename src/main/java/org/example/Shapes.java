package org.example;

import java.util.Scanner;
import java.util.logging.Logger;




abstract class PROPERTIES
{
    abstract  void area();
    abstract  void perimeter();


    double peri;

    double area;
    Scanner input=new Scanner(System.in);
    public static final Logger LOGGER = Logger.getLogger("InfoLogging");

}

class Triangle extends PROPERTIES
{


    int h;
    int b;

    int a;
    int c;

    int calc;
    Triangle()
    {

        LOGGER.info("Enter height:");
        h=input.nextInt();
        LOGGER.info("Enter base:");
        b=input.nextInt();
        LOGGER.info("Enter side1 length:");
        a=input.nextInt();
        LOGGER.info("Enter side2 length:");
        c=input.nextInt();
    }

    public void area()
    {
        calc=h*b;
        area=((calc)/2.0);
        LOGGER.info("Area of triangle :"+area);
    }


    public void perimeter() {

        peri=(a+b+c);
        LOGGER.info("Perimeter of triangle :"+(int)peri);
    }
}

class Rectangle extends PROPERTIES
{

    int l;
    int w;


    Rectangle()
    {
        LOGGER.info("Enter length:");
        l=input.nextInt();
        LOGGER.info("Enter width:");
        w=input.nextInt();
    }

    public void area() {
        area=l*w;
        LOGGER.info("Area of the rectangle "+(int)area);

    }


    public void perimeter() {
        peri=(2*(l*w));
        LOGGER.info("Perimeter of the rectangle "+(int)peri);
    }
}
class Circle extends PROPERTIES
{
    int r;
    Circle()
    {
        LOGGER.info("Enter radius of the circle:");
        r=input.nextInt();
    }

    public void area()
    {
        area=3.1415*r*r;
        LOGGER.info("Area of the circle:"+area);
    }


    public void perimeter() {
        peri=2*3.1415*r;
        LOGGER.info("circumference of the circle:"+peri);
    }
}
public class Shapes {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        LOGGER.info("Triangle");
        Triangle t1=new Triangle();
        t1.perimeter();
        t1.area();
        LOGGER.info("Rectangle");
        Rectangle r1=new Rectangle();
        r1.perimeter();
        r1.area();
        LOGGER.info("circle");
        Circle c1=new Circle();
        c1.perimeter();
        c1.area();


    }
}

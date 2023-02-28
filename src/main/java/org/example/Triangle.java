package org.example;

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
        area1=((calc)/2.0);
        P="Area of triangle :"+area1;
        LOGGER.info(P);
    }


    public void perimeter() {

        peri=(a+b+c);
        P="Perimeter of triangle :"+(int)peri;
        LOGGER.info(P);
    }
}

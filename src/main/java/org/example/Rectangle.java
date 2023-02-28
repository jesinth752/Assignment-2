package org.example;

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
        area1=(l*w);
        P="Area of the rectangle :"+(int)area1;
        LOGGER.info(P);

    }


    public void perimeter() {
        peri=(2*(l*w));
        P="Perimeter of the rectangle :"+(int)peri;
        LOGGER.info(P);
    }
}

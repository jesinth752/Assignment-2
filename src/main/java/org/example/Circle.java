package org.example;

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
        area1=((3.1415)*(r*r));
        P="Area of the circle:"+area1;
        LOGGER.info(P);
    }


    public void perimeter() {
        peri=((2*3.1415)*r);
        P="circumference of the circle:"+peri;
        LOGGER.info(P);
    }
}
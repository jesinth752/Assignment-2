package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

abstract class PROPERTIES
{
    abstract  void area();
    abstract  void perimeter();


    double peri;

    double area1;
    String P;
    Scanner input=new Scanner(System.in);
    public static final Logger LOGGER = Logger.getLogger("InfoLogging");

}
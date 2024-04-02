package oops.AccessControl;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import oops.polymorphism.Circle;
import oops.polymorphism.Shapes;

import java.util.Scanner;

public class Main {
    /*
            Class       Package      Subclass          Subclass        World
                                     (Same package)    (Diff Package)  (Diff Package and not subclass)
Public        +           +               +               +             +
protected     +           +               +               +
no modifier   +           +               +
private       +


     */

    public static void main(String[] args) {
        Circle circle = new Circle();

        //instanceof operator
        System.out.println(circle instanceof Shapes);
        System.out.println(circle instanceof Circle);

        //getClass method
        System.out.println(circle.getClass());
        System.out.println(circle.getClass().getName());
    }
}

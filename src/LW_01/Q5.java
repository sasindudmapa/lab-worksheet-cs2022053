package LW_01;

import java.util.Scanner;


class Circle{
    float radius;

    Circle(float r){
        this.radius=r;
    }

    float computeArea(){
        return 3.14f*this.radius*this.radius;
    }
    float computeCircumference(){
        return 2 * 3.14f*this.radius;
    }
}


public class Q5 {
    public static void main(String[] args){
        float ri, ro;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the inner radius: ");
        ri = sc.nextFloat();

        System.out.print("Enter the outer radius: ");
        ro = sc.nextFloat();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        float shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

        System.out.print("Area of the Shaded Region: " + shadedArea);

    }
}

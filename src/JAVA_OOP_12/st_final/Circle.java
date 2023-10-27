package JAVA_OOP_12.st_final;

public class Circle {

    // 원 넓이, 둘레
    // 파이 r 제곱
    // 2 파이 r
    double radius;// 반지름
    static double PI = 3.14; // 파이
    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * PI * radius;
    }

}

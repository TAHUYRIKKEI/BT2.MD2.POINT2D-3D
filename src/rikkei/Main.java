package rikkei;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Point2D lop1111 = new Point2D(2,3);
        System.out.println(lop1111);
        Point3D lop33333 = new Point3D(lop1111.getX(), lop1111.getY(), 4);
        System.out.println(lop33333);
        System.out.println(Arrays.toString(lop33333.getXYZ()));
        lop33333.toString();

    }

}
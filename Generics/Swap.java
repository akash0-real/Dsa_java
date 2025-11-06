package Generics;

public class Swap {
    static <T> void rev(T x,T y){
        T temp;
        temp = x;
        x = y;
        y = temp;
    }

    static void main() {
        Integer x = new Integer(12);
        Integer y = new Integer(10);
        System.out.println(x+ " " + y);
        rev(x,y);
        System.out.println(x + " "+  y);
    }
}

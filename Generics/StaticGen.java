package Generics;

public class StaticGen {
    static <T> void one(T t){
        System.out.println(t.getClass().getName() + ": " + t);
    }
    static void main() {
        one("first");
        one(1);
    }
}

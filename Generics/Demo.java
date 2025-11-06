package Generics;

public class Demo {
    <T> void gen(T t){
        System.out.println(t);
    }

    static void main() {
        Demo demo = new Demo();

        demo.gen("hello");
        demo.gen(1);
        demo.gen("two");
    }
}

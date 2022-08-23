package newton.oops;

class A {
    int a = 1;
    final void printA() {
        System.out.println(a);
    }

    void print() {
        System.out.println("Print A class");
    }
}
class B extends A {
    int b = 2;
    void printB() {
        System.out.println(b);
    }

    @Override
    void print() {
        System.out.println("Print B class");
    }
}
public class OOPS2 {
    static void fun (Integer x) {
        x = 10;
    }
    public static void main(String[] args) {
//        Integer a = 20;
//        System.out.println(a);
//        fun(a);
//        System.out.println(a);
        A obj1 = new A();
        obj1.print();
        B obj2 = new B();
        obj2.print();
        A obj3 = new B();
        obj3.print(); // Late binding
        // java thinks print() of A is going to run, yet on runtime the object of B calls print() of B
        // This is called as Dynamic method of Dispatch --> function overloading on runtime // runtime polymorphism
        // Dynamic polymorphism
        obj3.printA(); //
//        obj1.a = 20;

    }
}

package newton.oops;

import javax.naming.PartialResultException;

class Parent {
    int a = 34;
    void printA () {
        System.out.println(this.a);
    }
    Parent() {
        System.out.println("Parent default");
    }
    Parent(int a) {
        System.out.println("Parent parameterized constructor");
    }
}

class Child extends Parent {
    int b;
    void printB () {
        System.out.println(this.b);
        System.out.println(super.a); // super is used for better readability
    }
    Child () {
        this(0);
    }
    Child(int b) {
        this.b = b;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Child c = new Child(20);
        c.printB();

        // cycle inheritance is not possible
    }
}

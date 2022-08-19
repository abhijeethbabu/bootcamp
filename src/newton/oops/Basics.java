package newton.oops;

class Student {
    String name;
    int rollno;
    static int count = 0;
    Student() { // constructor function
        // whenever a new Student object is created, the constructor is run
        // Java defines a default constructor, one which does not takes any input
        System.out.println("Constructor function called");
        this.rollno = 0;
        this.name = "";
        count++; // how static variables are called in Constructor
    }

    static {
        // static block --> runs when the class is loaded
    }

    public void displayInfo() {
        System.out.println("Name is " + this.name);
        System.out.println("Roll number is " + this.rollno);
    }
}
public class Basics {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Mina";
        s1.rollno = 32;
//        System.out.println(s1.name);
//        System.out.println(s1.rollno);
        // how static variables are called
        // static variables are independent of objects
//        System.out.println(s1.count); // but not necessary
        System.out.println(Student.count);
        Student s2 = new Student();
        System.out.println(Student.count);
//        this.fun(); // access non static function using object or this?

    }
    private void fun(int a) {
        System.out.println(a);
    }
}

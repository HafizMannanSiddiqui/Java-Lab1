class A {
    void m1(String x) {
        System.out.println("One");
    }
}

class B extends A {
    void m1(String x) {
        System.out.println("One");
    }
}

public class Q10_b {
    public static void main(String[] args) {
        A a = new B();
        // a.m1(new A());

        a.m1("String");

    }
}

// There are a few errors in the code:

// The class A has a method "m1" which takes a String parameter, but in the main
// method, the method is being called with an object of type A instead of a
// String.

// The class B extends class A, but it does not provide an implementation for
// the "m1" method. If a class extends another class and overrides a method, the
// method signature in the subclass must be exactly the same as in the
// superclass, including the parameters and their types.

// To fix these errors, you could change the call to the "m1" method in the main
// method to pass a String instead of an object of type A:
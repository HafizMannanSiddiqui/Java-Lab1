class A {
    void m1(Object obj) {

        System.out.println("One");
    }
}

class B extends A {
    void m1(Object obj) {
        super.m1(null);
        System.out.println("Two");
    }

    void m2(Object obj) {
        System.out.println("Three");
        this.m1(null);
    }
}

public class Q10_c {
    public static void main(String[] args) {
        A a = new B();
        a.m1(new A());

        B b = new B();
        b.m2(new B());
    }
}

// output of this program is..
// One
// Two
// Three
// One
// Two
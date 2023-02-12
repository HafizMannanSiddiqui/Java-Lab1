class A {
    void m1(A a) {
        System.out.println("m1 method in class A");
    }
}

class B extends A {
    public void m1(A a) {
        System.out.println("m1 method in class B");
    }

}

public class Q10_a {

    public static void main(String[] args) {
        A a = new A();
        a.m1(a);
        a.m1(new B());

        B b = new B();
        b.m1(null);

        a = b;
        a.m1(null);
        a.m1(new A());
    }
}

// output of task a is...
// m1 method in class A
// m1 method in class A
// m1 method in class B
// m1 method in class B
// m1 method in class B

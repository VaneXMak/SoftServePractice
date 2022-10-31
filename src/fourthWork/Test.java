package fourthWork;

public class Test {
    public int i = 1;

    public void m1() {
        System.out.println("ClassA, metod m1, i = " + i);
    }

    public void m2() {
        System.out.println("ClassA, metod m2, i = " + i);
    }

    public void m3() {
        System.out.print("ClassA, metod m3, runnind m4():");
        m4();
    }

    public void m4() {
        System.out.println("ClassA, metod m4");
    }
}

class ClassB extends Test {
    public double i = 1.1;

    public void m1() {
        System.out.println("ClassB, metod m1, i= " + i);
    }

    public void m4() {
        System.out.println("ClassB, metod m4");
    }
}

class ApplAB {
    public static void main(String[] args) {

        System.out.println("The Start.");
        Test a = new Test();
        System.out.println("Test ClassA.");
        a.m1();
        a.m2();
        a.m3();
        a.m4();

        ClassB b = new ClassB();
        System.out.println("Test ClassB.");
        b.m1();
        b.m2();
        b.m3();
        b.m4();

        Test b0 = new ClassB();
        System.out.println("Test_0 ClassB.");
        b0.m1();
        b0.m2();
        b0.m3();
        b0.m4();
    }
}







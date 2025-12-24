//

class A {          // default class
    int x = 10;    // default variable
}


public class B {   // public class
    public static void main(String[] args) {

        A obj = new A();
        System.out.println(obj.x); // ✅ allowed
    }
}

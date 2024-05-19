package oops.InterfacesNested;

//In nested interfaces, the top level interface has to be declared public or no access modifier. But the inner interface can be declared with any access modifier
public class A {
    protected interface NestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}

class Main {
    public static void main(String[] args) {
        B checker = new B();
        System.out.println(checker.isOdd(21));
    }
}

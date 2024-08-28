package Concepts.OOP.objectCloning;

import java.util.Arrays;

public class Main {
    //    We should also mention the exception that was declared in Human class in main function, else it'll give an error
    public static void main(String[] args) throws CloneNotSupportedException {
        Human prateek = new Human(34, "Prateek");
//        Human twin = new Human(prateek);
        //In the above example, we're trying to clone prateek object into twin object, but since new keyword is used it takes a lot of processing time.
        //So instead, we can use clone method from the Object class to clone objects
        // We use an Interface named Clonable from java.lang package for this purpose

//        Human new_twin = (Human) prateek.clone();
//        System.out.println(new_twin.age + " " + new_twin.name);
//        System.out.println(Arrays.toString(new_twin.arr));
//
//        new_twin.arr[0] = 100;
//        System.out.println(Arrays.toString(new_twin.arr));
//        System.out.println(Arrays.toString(prateek.arr));
//        //Note that It's changing it in both, because this is shallow copy
//        //What happens in shallow copy is, it'll create new attributes for primitives, but it will not do that for objects(non-primitives). Instead, the objects of the clone are pointed to the objects of what was cloned.
//        // So making changes in clone's non-primitives will also reflect in the non-primitives of  what was cloned
//        //To solve this we can use deep copy


        //Now let's do deep copy
        Human new_twin = (Human) prateek.clone();
        System.out.println(new_twin.age + " " + new_twin.name);
        System.out.println(Arrays.toString(new_twin.arr));

        new_twin.arr[0] = 100;
        System.out.println(Arrays.toString(new_twin.arr));
        System.out.println(Arrays.toString(prateek.arr));
    }

}

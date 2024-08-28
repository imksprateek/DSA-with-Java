package Concepts.OOP.objectCloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 7};
    }

//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

//    //To clone the object we can implement clone method from Cloneable interface
//    //This is faster and easier since we don't have to clone each attribute like in the above method Human(Human other)
//    //Here, if we don't implement Cloneable interface, it'll give CloneNotSupportedException. Hence we have to implement Cloneable interface
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//    //The above is doing shallow copy of the object, not deep copy


    //    The below method does deep copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human) super.clone(); //This is shallow copy

        //Make a deep copy
        twin.arr = new int[twin.arr.length];

        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }
}

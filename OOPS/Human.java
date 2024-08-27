package OOPS;

public class Human implements Cloneable {
    int age;
    String name;
    Human(int age, String name){
        this.age = age;
        this.name = name;
    }
//    Human(Human clone){
//        this.age = clone.age;
//        this.name = clone.name;
//    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

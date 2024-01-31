//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//class Test {
//    int appId;
//    String appName;
//
//    Test(int id, String name) {
//        this.appId = id;
//        this.appName = name;
//    }
//
//    void info() {
//        System.out.println("Id : " + appId + " name : " + appName);
//    }
//
//
//    public static void main(String[] args) {
//        Test ob1 = new Test(10110,"FaceBook");
//        Test ob2 = new Test(04004,"Google");
//        ob1.info();
//        ob2.info();
//    }
//}


import OOP.inheritence.Doberman;
import OOP.inheritence.Dog;
import OOP.inheritence.Wolf;

public class Main {
    public static void main(String[] args){
        Wolf wolf = new Wolf();
        Dog dog = new Dog();
        Doberman doberman = new Doberman();
        System.out.println(wolf.age);
        System.out.println(wolf.kind);
        System.out.println(dog.age);
        dog.kind="Not Wild";
        System.out.println(dog.kind);
        System.out.println(doberman.age);
        System.out.println(doberman.hight);
    }
}





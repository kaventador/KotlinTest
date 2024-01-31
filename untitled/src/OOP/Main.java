package OOP;

public class Main {
//    // field
//    int age;
//    String color;

    //methods
    public static void main(String[] args){
        Car pride = new Car();
        pride.color="white";
        pride.wheel=4;
        pride.speed=160;
        pride.name="Pride";
        Car pars = new Car();
        pars.color="white";
        pars.wheel=4;
        pars.speed=190;
        Car benz = new Car();
        benz.color="black";
        benz.wheel=4;
        benz.speed=250;
        pride.information();
        pars.information();
        benz.information();
    }

}

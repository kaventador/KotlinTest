package OOP.university;

public class person {

    // Constractur


    public person(String name, String lastname, int age, String city) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.city = city;
    }

    public String name ;
    public String lastname;
    int age;
    String city;
    double gpa;
    String field;
    String level ;
    public void information(){
        System.out.println("Hi "+name+" "+lastname+" you are register and wellcome to university :)))");
    }

}

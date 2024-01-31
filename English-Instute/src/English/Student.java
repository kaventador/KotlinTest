package English;

public class Student {
    String name;
    String username;
    int password;

    public Student(String name, String username, int password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    void pr() {
        System.out.println(name);
        System.out.println(username);
        System.out.println(password);
    }
}

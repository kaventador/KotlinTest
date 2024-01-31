import English.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter name username password");
        Student stu = new Student(scanner.nextLine(),int(scanner.nextLine()));


    }
}
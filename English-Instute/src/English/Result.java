package English;

public class Result{
    public void result(){
        Exam exam = new Exam("test", 20);
        String sub = exam.subject;
        int gr = exam.grade;
        System.out.println("Your garde is "+gr);
        if (gr >= 10) {
            System.out.println("PASSED");
        }else {
            System.out.println("FAILD");
        }
    }
}

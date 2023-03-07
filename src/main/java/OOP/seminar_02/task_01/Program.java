package OOP.seminar_02.task_01;

public class Program {
    public static void getInfo(Student[] students){
        for (Student student: students) {
            System.out.println(student.getClass().getSimpleName());
            student.study();
            if (student instanceof Play){
                ((Play) student).play();
            }
            if (student instanceof Smoke){
                ((Smoke) student).smoke();
            }
            if (student instanceof Love){
                ((Love) student).love();
            }
            if (student instanceof Go){
                ((Go) student).goExtension();
            }
            System.out.println();
        }
    }
}

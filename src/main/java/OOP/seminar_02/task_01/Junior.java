package OOP.seminar_02.task_01;

public class Junior extends Student implements Play, Go{

    @Override
    public void study() {
        System.out.println("Я люблю учиться");
    }

    @Override
    public void play() {
        System.out.println("Я играю в игрушки");
    }

    public void goExtension(){
        System.out.println("Я хожу на продленку");
    }
}

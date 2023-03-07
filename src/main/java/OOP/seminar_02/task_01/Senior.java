package OOP.seminar_02.task_01;

public class Senior extends Student implements Smoke, Love{
    @Override
    public void smoke() {
        System.out.println("Я бросаю курить");
    }

    @Override
    public void study() {
        System.out.println("Я должен учиться");
    }

    public void love(){
        System.out.println("Я ищу любовь");
    }
}

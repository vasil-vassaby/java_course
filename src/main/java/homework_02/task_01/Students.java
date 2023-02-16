package homework_02.task_01;

import java.util.List;

public class Students {
    private List<Student> students;
    public List<Student> getStudents() { return students; }
    public void setStudents() {
        this.students = students;
    }
    public String toString(){
        return "{students:" + students;
    }
}

package homework_02.task_03;

import com.google.gson.annotations.SerializedName;

public class Student {
    @SerializedName("фамилия")
    private String lastname;
    @SerializedName("оценка")
    private String mark;
    @SerializedName("предмет")
    private String subject;
    public String getLastname() { return lastname; }
    public String getMark() { return mark; }
    public String getSubject() { return subject; }
    public Student(String lastname, String mark, String subject) {
        this.lastname = lastname;
        this.mark = mark;
        this.subject = subject;
    }

    public String toString(){
        return "\n{фамилия: " + lastname
                + ", оценка: " + mark
                + ", предмет: " + subject
                + "}";
    }
}

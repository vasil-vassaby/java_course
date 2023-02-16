package homework_02.task_01;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

// 1. Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}


public class Main {
    public static void main(String[] args) {
        System.out.println("select * from students where ");
        StringBuilder sb = new StringBuilder();
        GsonParser parser = new GsonParser();
        Students students = parser.parse();
        for (Student student:students.getStudents()) {
            if (!student.getName().equals("null")) {
                sb.append("name = " + student.getName() + ", ");
            }
            if (student.getAge() != 0) {
                sb.append("age = " + student.getAge() + ", ");
            }
            if (!student.getCountry().equals("null")) {
                sb.append("country = " + student.getCountry() + ", ");
            }
            if (!student.getCity().equals("null") ) {
                sb.append("city = " + student.getCity() + " \n");
            }
        }
        System.out.println(sb);
    }
}

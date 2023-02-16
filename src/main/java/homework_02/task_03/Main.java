//3* . Дана json строка (можно сохранить в файл и читать из файла)
// [
//  {
//    "фамилия":"Иванов",
//    "оценка":"5",
//    "предмет":"Математика"
//  },
//  {
//    "фамилия":"Петрова",
//    "оценка":"4",
//    "предмет":"Информатика"
//  },
//  {
//    "фамилия":"Краснов",
//    "оценка":"5",
//    "предмет":"Физика"
//  }
// ]
//  Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//  Пример вывода:
//  Студент Иванов получил 5 по предмету Математика.
//  Студент Петрова получил 4 по предмету Информатика.
//  Студент Краснов получил 5 по предмету Физика.

package homework_02.task_03;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        JsonParser parser = new JsonParser();
        Students students = parser.parse();
        for (Student student:students.getStudents()) {
            sb.append("Студент(ка) " + student.getLastname() + " ")
                    .append("получил(а) " + student.getMark() + " ")
                    .append("по предмету " + student.getSubject() + "\n");
        }
        System.out.println(sb);
    }

}

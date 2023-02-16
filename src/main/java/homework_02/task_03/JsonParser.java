package homework_02.task_03;

import com.google.gson.Gson;

import java.io.FileReader;

public class JsonParser {
    public Students parse(){
        Gson gson = new Gson();
        try(FileReader reader = new FileReader("/home/spirit2/Учеба/Java/Курс по джава  GB/first_homework/src/main/java/homework_02/task_03/Students.json"))
        {
            Students students = gson.fromJson(reader, Students.class);
            return students;
        }
        catch(Exception e){
            System.out.println("Parsing error" + e.toString());
        }
        return null;
    }
}

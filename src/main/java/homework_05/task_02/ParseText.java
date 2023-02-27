package homework_05.task_02;

import java.util.ArrayList;
import java.util.List;

public class ParseText {
     List<String> parse(String text){

        String[] users = text.split(",");

        List<String> list = new ArrayList<>();

        for (String user: users) {
            String name = user.trim().split(" ")[0];
            list.add(name);
        }
        return list;
    }

}

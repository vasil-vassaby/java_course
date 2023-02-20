package homework_03.task_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GetList {
    public static ArrayList<Integer> getList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Введите числа: ");
        // добавляем в список цифры с клавиатуры
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(Integer.parseInt(s));
        }
        return list;
    }
}

/**
 * Created by user on 07.03.2017.
 *
 1.	Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);

 2.	Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.

 3. Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
 */

public class Main {
    static String b = "Test2";

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Test");
        s.ensureCapacity(70);
        s.setLength(10);
        s.append(b);

        System.out.println(s.length());
        System.out.println(s.capacity());
        System.out.println(s);

    }

}



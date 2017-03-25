import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 * Created by user on 07.03.2017.
 *
 1.	Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);

 2.	Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.

 3. Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
 */

public class Main {
    static String name= "VFFV";
    static String name2 = "vffv";
    public static void main(String[] args) throws FileNotFoundException {
        char a =name.charAt(2);
        char [] b = name.toCharArray();
        boolean c = name.equals(name2);
        boolean e = name.equalsIgnoreCase(name2);
        String d = name.concat(name2);
        String i = name.toLowerCase();
        FileInputStream FIO = new FileInputStream("New1.txt");
        //Metod(a,b,c,d,e,i);
    }

    static void Metod(char a,char[] b, boolean c,String d,boolean e,String i){
        System.out.println(a);
        System.out.println(b[3]);
        System.out.println(c);
        System.out.println(e);
        System.out.println(d);
        System.out.println(i);
    }
}



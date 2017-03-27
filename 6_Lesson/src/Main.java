

import java.io.*;

/**
 * Created by user on 07.03.2017.
 *
 1.	Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);

 2.	Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.

 3. Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
 */

public class Main {

    public static void main(String[] args) {
       char a = '4';
        String b = "fff";


        b = String.format("GGGf "+
                "FFRR "+
                "RRRRE "+
                "111"+ " 111", 4, 4, 4);

        System.out.println(b);


    }




    static void Metod(){
        String name= "VFFV";
        String name2 = "vffv";
        char a =name.charAt(2);
        char [] b = name.toCharArray();
        boolean c = name.equals(name2);
        boolean e = name.equalsIgnoreCase(name2);
        String d = name.concat(name2);
        String i = name.toLowerCase();
        System.out.println(a);
        System.out.println(b[3]);
        System.out.println(c);
        System.out.println(e);
        System.out.println(d);
        System.out.println(i);
    }
}



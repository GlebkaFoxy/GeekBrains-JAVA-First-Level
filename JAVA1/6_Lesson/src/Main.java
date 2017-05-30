

import sun.text.normalizer.UTF16;

import java.io.*;
import java.util.Scanner;

import static com.oracle.jrockit.jfr.DataType.UTF8;

/**
 * Created by user on 07.03.2017.
 *
 1.	Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);

 2.	Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.

 3. Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
 */

public class Main {

    public static void main(String[] args) {
            int i;

        try {
            BufferedInputStream FIS = new BufferedInputStream(new FileInputStream("New1.txt"));
            BufferedInputStream FIS2 = new BufferedInputStream(new FileInputStream("New2.txt"));
            BufferedOutputStream BOS = new BufferedOutputStream(new FileOutputStream("New3.txt"));

            do {
                i=FIS.read();
                if (i!=-1){
                    BOS.write((char) i);
                                    }
            }while (i!=-1);

            FIS.close();

            do {
                i = FIS2.read();
                if (i != -1) {
                    BOS.write((char)i);
                }
            }while (i!=-1);
                FIS2.close();
               BOS.close();
        }catch (FileNotFoundException e){
            System.out.println("Файла не существует");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            BufferedInputStream bf = new BufferedInputStream(new FileInputStream("Test.txt"));

            byte [] mass =new byte[bf.available()];
            bf.read(mass);
            bf.close();
            String searchWord = new String(mass,"UTF8");
            boolean ansver = searchWord.contains("свой");
            System.out.println(ansver);

        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException a){
            System.out.println(a);
        }

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



import com.sun.prism.BufferedImageTools;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

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
        int i;
            try{
                BufferedInputStream fi = new BufferedInputStream(new FileInputStream("New1.txt"));
                BufferedInputStream fi1 = new BufferedInputStream(new FileInputStream("New2.txt"));
                BufferedOutputStream fi2 = new BufferedOutputStream(new FileOutputStream("New3.txt"));

                do{
                    i= fi.read();
                    if (i != -1) fi2.write(i);
                }
                while (i != -1);
                fi.close();


                do{
                    i= fi1.read();
                    if (i != -1) fi2.write(i);
                }
                while (i != -1);
                fi.close();
                if (fi2 !=null) fi2.close();

            }catch (IOException e){
                System.out.println("Непредвиденные ошибки");
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



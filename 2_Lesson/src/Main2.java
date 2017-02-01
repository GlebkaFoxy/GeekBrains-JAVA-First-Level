import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Глеб on 25.01.2017.
 *
 *  1 Создать массив, состоящий из элементов 0 и 1, например, int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
 *  2 В массиве из предыдущего пункта с помощью цикла заменить 0 на 1, 1 на 0;
 *  3 Создать массив из 8 целых чисел. С помощью цикла заполнить его значениями 1 4 7 10 13 16 19 22;
 *  4 Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; пройти по нему циклом, и числа, которые меньше 6, умножить на 2.
 *  5 Задать одномерный массив и найти в нем минимальный и максимальный элементы;
 *  6 Написать простой консольный калькулятор. Пользователь вводит два числа и операцию, которую хочет выполнить, программа вычисляет результат и выводит в консоль;
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        int[] Arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("Задание 1 и 2");
        System.out.println("Массив Arr, имеет значения: ");
        for (int iArr=0; iArr<Arr.length; iArr++){
            System.out.print(Arr[iArr]+" ");
        }
        System.out.println();
        System.out.println("Новые данные Массива Arr: ");
        for (int bArr= 0; bArr<Arr.length; bArr++){
            switch (Arr[bArr]){
                case 1:
                    Arr[bArr]=0;
                    break;
                case 0:
                    Arr[bArr]=1;
                    break;
            }
            System.out.print(Arr[bArr]+" ");
        }
        System.out.println();
        System.out.println("Задание 3, новый массив");
        int[] Mass3 =new int[8];
        for(int i=0;i<Mass3.length;i++){
            Mass3[i]=i*3+1;
            System.out.print(Mass3[i]+" ");
        }
        int[] Mass4 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println();
        System.out.println("Задание 4");
        for(int i=0; i<Mass4.length; i++){
            if (Mass4[i]<6){Mass4[i]=Mass4[i]*2;}
            System.out.print(Mass4[i]+" ");
        }
        System.out.println();
        System.out.println("Задание 5");
        System.out.println("Массив имеет значения: ");
        int[] Mass5 = {1,6,5,8,4,12,2,9,4,2,3,10};
        int iMax=0;
        int iMin=50;
        for (int i=0; i<Mass5.length; i++){
            if (Mass5[i]>iMax){iMax=Mass5[i];}
            if (Mass5[i]<iMin){iMin=Mass5[i];}
            System.out.print(Mass5[i]+" ");
        }
        System.out.println();
        System.out.println("Максимальное значение массива = "+iMax);
        System.out.println("Минимальное значение массива = "+iMin);
        System.out.println("Задание 6, консольный калькулятор");

        System.out.println("Введите первое значение");


//        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
//        int NumberOne= Integer.parseInt(reader.readLine());
//        System.out.println("Введите знак *,/,+,-");
//        String Simvol= reader.readLine();
//        System.out.println("Введите второе значение");
//        int NumberTwo= Integer.parseInt(reader.readLine());
//
//        switch (Simvol){
//            case "*":
//                System.out.print(NumberOne*NumberTwo);
//                break;
//            case "/":
//                System.out.print(NumberOne/NumberTwo);
//                break;
//            case ("+"):
//                System.out.print(NumberOne+NumberTwo);
//                break;
//            case "-":
//                System.out.print(NumberOne-NumberTwo);
//                break;
//        }

        int NumberOne=10;
        String Simvol=("+");
        int NumberTwo=5;
        switch (Simvol){
            case("*"):
                System.out.println(NumberOne*NumberTwo);
            case "/":
                System.out.println(NumberOne/NumberTwo);
            case("+"):
                System.out.println(NumberOne+NumberTwo);
            case "-":
                System.out.println(NumberOne-NumberTwo);
        }
        System.out.println();
    }

}

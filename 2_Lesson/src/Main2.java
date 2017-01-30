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
    public static void main(String[] args) {
        int[] Arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
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
        int[] Mass2 =new int[8];
        for(int i=0;i<Mass2.length;i++){
            Mass2[i]=i*3+1;
            System.out.print(Mass2[i]+" ");
        }
        int[] Mass3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for(int i=0; i<Mass3.length; i++){

        }
    }
}

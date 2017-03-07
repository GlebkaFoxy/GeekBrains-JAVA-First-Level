

/**
 * Created by user on 06.03.2017.
 * 3.	Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
 * где a,b,c,d – входные параметры этого метода.
 * 4.	Написать метод, принимающий на вход два числа,
 * и проверяющий что их сумма лежит в пределах 10 до 20, если да – вернуть true, в противном случае – false.
 5.	* Написать метод, который определяет является ли год високосным.
 Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

 */
public abstract class One {

    public static void main(String[] args) {
     for (int i=1;i<11; i++ ){
         for (int j=1; j<11; j++ ){
             System.out.print(i*j+" ");
         }
         System.out.println();
     }


    }

    static void returnStatement(int a, int b, int c, int d) {
        System.out.println(a * (b + (c / d)));
    }

    static boolean returnTF(int a, int b) {
        if (10 < (a + b) && (a+b)<20) {
            return true;
        } else {
            return false;
        }
    }

    static void viska (int a){
      if (a%400==0 || a%4==0 && a%100!=0){
          System.out.println(a+ " Got visokosny");
      } else {
          System.out.println(a+ " Got ne visokosny");
      }
    }


}
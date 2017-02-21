
import java.util.Scanner;

/**
 * Created by Глеб on 05.02.2017.
 */
public class AFurst {
    static char[][]field=new char[3][3];
    static char emptiDot= (char) 6850;
    static char plaerDot='X';
    static char aiDot='O';
    static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
        doMass();
        printMass();
        while (true){
            turnPlaer();
            if (FieldFuul()){
                System.out.println("ПОТРАЧЕНО");
                break;
            }
            TurnAI();
        }

    }


   static void doMass(){
        for (int i=0;i<field.length;i++){
            for (int j=0;j<field.length;j++){
                field[i][j]=emptiDot;
            }
        }
    }
    static void printMass(){
        for(int i=0;i<field.length;i++){
            for(int j=0;j<field.length;j++){
                System.out.print(field[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void turnPlaer()  {
        System.out.println("Введите текст");
        int i = sc.nextInt();
        int j = sc.nextInt();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        field[i-1][j-1]=plaerDot;
        printMass();


    }

    static void TurnAI(){
        System.out.println("Ход АI");

        int a =1 ;
        int b = 2 ;
        System.out.println("АИ выдал значение "+(a)+" "+(b));
        while (field[a-1][b-1]!=emptiDot){
            a = (int)(Math.random()*2);
            b = (int)(Math.random()*2);
            System.out.println("АИ выдал значение "+(a+1)+" "+(b+1));}
            field[a-1][b-1]=aiDot;

        printMass();
    }

    static boolean FieldFuul(){
        for (int i=0;i<field.length;i++){
            for (int j=0;j<field.length;j++){
                if (field[i][j]==emptiDot){return false;}
            }
        }
        return true;
    }
    boolean ChekWin(char Dot){int a=5;
        return false;
    }






}


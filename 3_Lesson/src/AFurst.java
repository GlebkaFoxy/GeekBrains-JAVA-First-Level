
import kotlin.reflect.jvm.internal.impl.util.Check;

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
                break;}
            if(CheckWin(plaerDot)){
                System.out.println("Победитель ты");
            break;}


            TurnAI();
            if(FieldFuul()){
                System.out.println("ПОТРАЧЕНО");
                break;
            }
            if (CheckWin(aiDot)){
                System.out.println("Победила ШЕЛЕЗЯКА");
                break;
            }
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
        System.out.print("Введите номер столбца и номер строки: ");
        int i = sc.nextInt();
        int j = sc.nextInt();
        while (field[i-1][j-1]!=emptiDot){
            System.out.println("Ячейка занята, введите другое значение");
            i=sc.nextInt();
            j=sc.nextInt();
        }
        field[i-1][j-1]=plaerDot;
        printMass();


    }

    static void TurnAI(){
        System.out.println("Ход АI");


        int a =(int)(Math.random()*3);
        int b =(int)(Math.random()*3);
        while (field[a][b]!=emptiDot){
            if(IIBlocPlaerGor()==false){
            a = (int)(Math.random()*3);
            b = (int)(Math.random()*3);
            System.out.println("АИ выдал значение "+(a+1)+" "+(b+1));}}
            field[a][b]=aiDot;

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
    static boolean CheckWin(char Dot){
        for(int i=0; i<field.length;i++){
            if(field[i][0]==Dot && field[i][1]==Dot && field[i][2]==Dot){return true;}
        }
        for(int j=0; j<field.length;j++){
            if(field[0][j]==Dot && field[1][j]==Dot && field[2][j]==Dot){return true;}
        }
        for(int i=0;i<field.length;i++){
            if (field[0][0]==Dot && field[1][1]==Dot && field[2][2]==Dot){return true;}
            if(field[0][2]==Dot && field[1][1]==Dot && field[2][0]==Dot){return true;}
        }
        return false;
    }

    static boolean IIBlocPlaerGor(){
        for (int i=0;i<field.length;i++){
            if (field[i][0]==plaerDot && field[i][1]==plaerDot){field[i][2]=aiDot; return true;}
            if (field[i][1]==plaerDot && field[i][2]==plaerDot){field[i][0]=aiDot; return true;}
            if (field[i][0]==plaerDot && field[i][2]==plaerDot){field[i][1]=aiDot; return true;}

        }
        for (int j=0;j<field.length;j++){
            if (field[0][j]==plaerDot && field[1][j]==plaerDot) {field[2][j]=aiDot; return true;}
            if (field[1][j]==plaerDot && field[2][j]==plaerDot) {field[0][j]=aiDot; return true;}
            if (field[0][j]==plaerDot && field[2][j]==plaerDot) {field[1][j]=aiDot; return true;}
        }
        for (int a=0, b=0;b<field.length;a++,b++){
            if (field[0][0]==plaerDot && field[1][1]==plaerDot) {field[2][2]=aiDot; return true;}
            if (field[0][0]==plaerDot && field[2][2]==plaerDot) {field[1][1]=aiDot; return true;}
            if (field[2][2]==plaerDot && field[1][1]==plaerDot) {field[0][0]=aiDot; return true;}
        }
        for (int a=2, b=0; b<field.length;a--,b++){
            if (field[2][0]==plaerDot && field[1][1]==plaerDot) {field[0][2]=aiDot; return true;}
            if (field[2][0]==plaerDot && field[0][2]==plaerDot) {field[1][1]=aiDot; return true;}
            if (field[0][2]==plaerDot && field[1][1]==plaerDot) {field[2][0]=aiDot; return true;}
        }
    return false;
    }


}








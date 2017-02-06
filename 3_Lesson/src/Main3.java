


import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Глеб on 05.02.2017.
 */
public class Main3 {
    char [][] Igra= new char[3][3];
    final char Field='.';
    final char PlaerDot='X';
    final char AIDot='O';
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {new Main3().go();}
    void go(){
        IntGame();
        ShowGame();
        TurnPlayerAndAI();
        ShowGame();
    }

    void IntGame(){
        for (int a=0; a<Igra.length;a++){
            for (int b=0;b<Igra.length;b++){
                Igra[a][b]=Field;
            }
        }
    }
    void ShowGame(){
        for (int a=0;a<Igra.length;a++){
            for (int b=0;b<Igra.length;b++){
                System.out.print(Igra[a][b]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    void TurnPlayerAndAI(){

        int x,y;
        System.out.println("Ход игрока: введите 2 числа от 1 до 3, через пробел.");
        x = sc.nextInt();
        y = sc.nextInt();
        Igra[x-1][y-1]=PlaerDot;
        ShowGame();

        System.out.println("Ход компьютера");
        int z = (int) ((Math.random()+1)*2);
        int c = (int) ((Math.random()+1)*2);
        if (Igra[z - 1][c - 1]!=Igra[x-1][y-1]){
        Igra[z-1][c-1]=AIDot;}
    }
//
//    boolean ChekWin(char box){}
//    boolean UsedBox(int x,int y){}
//    boolean IgraFuul(){}
//    Boolean AI BLOCK Horizontal(){}
//    Boolean AI BLOCK VERTICAL(){}
//    Boolean AI BLOCKLINE obliquely 1(){}
//    Boolean AI BLOCKLINE obliquely 2(){}
}



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * Created by Глеб on 05.02.2017.
 */
public class Main3 {
    char [][] Igra= new char[5][5];
    char Field='.';
    char PlaerDot='X';
    char AIDot='O';
    BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {new Main3().go();}
    void go(){
        IntGame();
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
//  void TurnPlaer(){
//      int x,y;}
//    void TurnAI(){}
//
//    boolean ChekWin(char box){}
//    boolean UsedBox(int x,int y){}
//    boolean IgraFuul(){}
//    Boolean AI BLOCK Horizontal(){}
//    Boolean AI BLOCK VERTICAL(){}
//    Boolean AI BLOCKLINE obliquely 1(){}
//    Boolean AI BLOCKLINE obliquely 2(){}





}

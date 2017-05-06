/**
 * Created by user on 03.05.2017.
 */
public class Main {

    public static void main(String[] args) {eCompiler();}


    static void start_1(){
        //Текст DooBeeDooBeeDooBeeDo

        int x=1;
        while (x<4){
            System.out.print("Doo");
            System.out.print("Bee");
            x++;
        }
        if (x==4){
            System.out.println("Do");
        }
    }

    //Глава 1  стр.44
    static void beerSong(){
        /*

        Текст песни:
        <number> bottles of beer on the wall
        <number> bottles of beer!
        Take one down, pass it around
        <number - 1> bottles of beer on the wall!
        */

        int beerNum = 99;
        String word = "bottles";

        while (beerNum>0){

            if (beerNum==1){
                word = "bottle";}

            System.out.println(beerNum+" "+word+" of the beer on the wall");
            System.out.println(beerNum+" "+word+" of beer!");
            System.out.println("Take one down, pass it around");
            beerNum--;

            if (beerNum>0){
            System.out.println(beerNum+" "+word+" of the beer on the wall!");
            }
            else{
                System.out.println("No one bottle on the Wall");
            }
            System.out.println();
        }
    }

    //Глава 1  стр.47
    static void phraseOMatic(){

        //Создание рандома из 3 массивов

        String [] first ={"rrr","TTT","FFF","HHH"};
        String [] second ={"","TTT","FFF","HHH"};
        String [] fird ={"rrr","TTT","FFF","HHH"};

        int rand1 = (int)(Math.random()*first.length);
        int rand2 = (int)(Math.random()*second.length);
        int rand3 = (int)(Math.random()*fird.length);

        System.out.println(first[rand1]+" "+second[rand2]+" "+fird[rand3]);





    }

    //Глава 1  стр.50
    static void code(){
        //Глава 1  стр.50
        //Собрать из кусочков код: a-b c-d
        int x =3;
        while (x>0){
            if (x>2){
                System.out.print("a");
            }
            x=x-1;
            System.out.print("-");
            if (x==2){
                System.out.print("b c");
            }
            x=x-1;
            System.out.print("-");
            if (x==1){
                System.out.print("d");
                x=x-1;
            }
        }

    }

    //Глава 1 стр. 51-54
    static void aCompiler(){
        int x =1;
        while (x<10){
            // Добавим x++;
            x++;
            if (x > 3) {
                System.out.println("Большой икс");
            }
        }
    }
    static void bCompiler(){
        //перенес х--; в конец, изменил условие if
        //А вообще тут забыли написать class Exerciselb{}
        int x =5;
        while (x >= 1){

            if (x >= 1) {
                System.out.println("маленький икс");
            }
            x--;
        }
    }
    static void cCompiler(){
        //судя по книге, забыли написать
        //public static void main(String[] args) {}
    }
    static void dCompiler(){
        int x=0,y=0;
        while (x < 5){
            y=y+2;
            if (y > 4) {y=y-1;}

            System.out.print(x + ""+ y + " ");
            x++;
        }
        /*
        y=x-y;  00 11 21 32 42
        y=y+x;  00 11 23 36 410
        y=y+2; if (y > 4) {y=y-1;}    02 14 25 36 47
         */
    }
    static void eCompiler(){
        int x=1;
        while (x<4){
            System.out.print("a ");
            x=-1;
            if (x<1){
                System.out.print("noise");
            }
        }
    }

}

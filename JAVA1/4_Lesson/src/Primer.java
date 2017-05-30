/**
 * Created by user on 26.02.2017.
 */
public class Primer {
    String name;
    public static void main(String[] args) {
        metod_Privazki_Objects();

        metod_Privazki_Peremennih();


    }
    public static void metod_Privazki_Peremennih(){
        int a=5,b=7;
        System.out.println(a+" "+b);

        b=a;
        System.out.println(a+" "+b);

        a= 16;
        System.out.println(a+" "+b);
    }
    public static void metod_Privazki_Objects(){
        Primer c1 = new Primer();
        c1.name="GiGi";

        Primer c2 = new Primer();
        c2.name = "TuTu";

        System.out.println(c1.name+" "+c2.name);

        c2=c1;
        System.out.println(c1.name+" "+c2.name);

        c1.name="TeRe";
        System.out.println(c1.name+" "+c2.name);
        System.out.println();
    }
}

import javax.swing.*;
import java.awt.*;


/**
 * Created by user on 29.03.2017.
 * Полностью разобраться с кодом, написанным на занятии(архив прикреплен);
 * Создать массив в котором будет храниться состояние игрового поля(как это делали на 3 занятии);
 * При клике мышью необходимо ставить фишку в указанную ячейку с проверкой занятости ячейки;
 * Добавить отрисовку фишек (при клике мышкой необходимо будет вызывать метод repaint());.
 *
 */
public class Main {
    public static void main(String[] args) {
       GoGoPeople();




    }
    
public static void GoGoPeople(){
    for (int i=0;i<=1000;i++){
        if (i<=1000){
            if (i%3 == 0 && i % 5 != 0){
                System.out.println(i);
            }
        }
    }
}
    
}


//class Form extends JFrame {
//
//        Form(){
//            setBounds(500,400,  400,300);
//            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//
//
//            go2();
//
//
//            setVisible(true);
//        }
//
//
//        public void go1(){
//
//            JPanel panel = new JPanel();
//
//            panel.setLayout(new GridLayout(3,3));
//            panel.add(new JButton("Кнопка1"));
//
//            panel.add(new JButton("Кнопка2"));
//            panel.add(new JButton("Кнопка3"));
//            setContentPane(panel);
//        }
//
//    public void go2(){
//        //JPanel panel = new JPanel();
//        Box box = Box.createVerticalBox();
//
//        box.add(new JButton("22"));
//        box.add(Box.createVerticalGlue());
//        box.add(new JButton("33"),Box.createVerticalStrut(60));
//        box.add(new JButton("44"),Box.createVerticalStrut(60));
//
//
//
//        setContentPane(box);
//    }
//    public void go3(){
//        JPanel panel = new JPanel();
//        panel.setLayout(new FlowLayout());
//        panel.add(new JButton("Кнопка3"));
//        setContentPane(panel);
//    }
//
//    }





import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


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
       Form form = new Form();

    }
    

}


class Form extends JFrame {

        Form(){
            setBounds(500,400,  400,300);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            go1();



            setVisible(true);
        }


        public void go1(){

            JPanel mainPanel  = new JPanel();
            mainPanel.setLayout(new BorderLayout());
            JPanel buttonsPanel   = new JPanel();
           JButton button1 = new JButton("Test1");
            button1.setPreferredSize(new Dimension(150, 80));
            buttonsPanel.add(button1);
            mainPanel.add(buttonsPanel, BorderLayout.NORTH);

            button1.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    go2();
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });



        setContentPane(mainPanel);

        }

    public void go2(){

        Box box = Box.createVerticalBox();
//        JButton jb1 = new JButton("22");
//        jb1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                go1();
//            }
//        });

        //box.add(jb1);
        box.add(Box.createVerticalGlue());
        box.add(new JButton("33"),Box.createVerticalStrut(60));
        box.add(new JButton("44"),Box.createVerticalStrut(60));



        setContentPane(box);
    }
    public void go3(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JButton jb1 = new JButton();
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                go1();
            }
        });

        panel.add(jb1);
        setContentPane(panel);
    }

    }





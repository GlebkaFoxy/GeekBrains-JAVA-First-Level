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
        Form form = new Form();
        FormWithListeners fh = new FormWithListeners();
    }
}



class Form extends JFrame {
    int x,y;
    Form() {
        setTitle("Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 500, 500);



        //create JP1
        Count count = new Count();
        count.setBackground(Color.black);

        JButton jb1 = new JButton("Предыдущая страница");
        JButton jb2 = new JButton("Следующая страница");
        count.add(jb1);
        count.add(jb2);

        //create JP2
        JPanel jp2 = new JPanel();
        //jp.setLayout(new FlowLayout());
        JButton jb3 = new JButton("Test1");
        JButton jb4 = new JButton("Test2");
        jp2.add(jb3);
        jp2.add(jb4);


        getContentPane().add(BorderLayout.CENTER, count);
        getContentPane().add(BorderLayout.SOUTH, jp2);
        setVisible(true);
    }


    class Count extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawOval(x, y, 50, 50);
        }
    }
}
class FormWithListeners extends JFrame { // necessary java.awt.event.*
    int x, y;

    FormWithListeners() {
        setTitle("BorderLayout Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 300);

        // create buttons
        JButton btnFist = new JButton("First");
        JButton btnSecond = new JButton("Second");

        // add buttons listeners


        // create canvas with MouseAdapter
        Canvas canvasPanel = new Canvas();
        canvasPanel.setBackground(Color.white);


        // panel with button
        JPanel btnPanel = new JPanel();
        btnPanel.add(btnFist);
        btnPanel.add(btnSecond);

        // add btnPanel and canvas
        getContentPane().add(BorderLayout.CENTER, canvasPanel);
        getContentPane().add(BorderLayout.SOUTH, btnPanel);
        setVisible(true);
    }

    class Canvas extends JPanel { // my canvas for painting
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawOval(x, y, 50, 50);
        }
    }
}
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

    }
}


class Form extends JFrame {
    public Form() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);


        JButton  p = new JButton();
        add(p);

        p.setLayout(new GridLayout(3,3));
        p.add(new JButton("start 1"));
        p.add(new JButton("start 2"));
        p.add(new JButton("start 3"));
        p.add(new JButton("start 4"));
        p.add(new JButton("start 5"));
        p.add(new JButton("start 6"));
        p.add(new JButton("start 7"));
        p.add(new JButton("start 8"));
        p.add(new JButton("start 9"));


        setVisible(true);
    }

}
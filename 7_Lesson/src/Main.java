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
        JButton[] b = new JButton[5];

        Box box = Box.createVerticalBox();
        box.add(b[1]);
        box.add(Box.createVerticalStrut(170));
        box.add(new JButton("Test2"));
        setContentPane(box);



        setVisible(true);
    }

}
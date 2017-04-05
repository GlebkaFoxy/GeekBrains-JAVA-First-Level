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


        Box box = Box.createVerticalBox();

        JButton RB = new JButton("O---O");
        JButton VG = new JButton("T---T");
        JButton GH = new JButton("^---^");

        RB.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        box.add(RB);
        box.add(Box.createVerticalGlue());
        VG.setAlignmentX(JComponent.RIGHT_ALIGNMENT);
        box.add(VG);
        box.add(Box.createVerticalGlue());
        GH.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        box.add(GH);

        setContentPane(box);



        setVisible(true);
    }

}
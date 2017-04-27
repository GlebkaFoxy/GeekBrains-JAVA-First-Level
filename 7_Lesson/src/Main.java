import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.Random;

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

        Game game = new Game();



    }
}


class Game extends JFrame {

    Game(){
        setTitle("Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300, 500,500);

        //Панели
        JPanel midle = new JPanel();
        JPanel souf = new JPanel();

        //Кнопки
        JButton jb1 = new JButton("");
        JButton jb2 = new JButton("");
        JButton jb3 = new JButton("");
        JButton jb4 = new JButton("");
        JButton jb5 = new JButton("");
        JButton jb6 = new JButton("");
        JButton jb7 = new JButton("");
        JButton jb8 = new JButton("");
        JButton jb9 = new JButton("");
        JButton mainMenu = new JButton("В начало");
        JButton end = new JButton("End");

        jb1.setText(" ");

        //Работа с JFrame

        midle.setLayout(new GridLayout(3,3));
        midle.add(jb1);
        midle.add(jb2);
        midle.add(jb3);
        midle.add(jb4);
        midle.add(jb5);
        midle.add(jb6);
        midle.add(jb7);
        midle.add(jb8);
        midle.add(jb9);




        souf.add(mainMenu);
        souf.add(end);


        getContentPane().add(BorderLayout.CENTER,midle);
        getContentPane().add(BorderLayout.SOUTH,souf);
        setVisible(true);
    }

}



class Form2 extends JFrame{

    Form2(){
        setTitle("Test2");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,140, 500 ,500);

        // Create Buttons
        JButton test1 = new JButton("Test1");
        JButton test2 = new JButton("Test2");
        JButton test3 = new JButton("Test1");
        JButton test4 = new JButton("Test1");
        JButton test5 = new JButton("Main menu");
        JButton Exit = new JButton("Exit");

        JTextField JTF = new JTextField();

        //Panels
        JPanel JP1 = new JPanel();
        JPanel JP2 = new JPanel();
        JPanel JP3 = new JPanel();

        //Rules fo the Buttons
        test1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JTF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("YOUR message " + JTF.getText());
            }
        });

        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Go();
            }
        });

        JP1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                System.out.println("Mouse Coordinate "+getX()+" "+getY());
            }
        });



        JP1.setLayout(new GridLayout(2, 2));
//        JP1.add(test1);
//        JP1.add(test2);
//        JP1.add(test3);
//        JP1.add(test4);


        JP2.setBackground(Color.green);
        JP2.add(test5);
        JP2.add(Exit);


        JP3.setBackground(Color.blue);
        JP3.setLayout(new BorderLayout());
        JP3.add(BorderLayout.CENTER,JTF);



        getContentPane().add(BorderLayout.CENTER,JP1);
        getContentPane().add(BorderLayout.NORTH,JP2);
        getContentPane().add(BorderLayout.SOUTH,JP3);
        setVisible(true);
    }




    void Go(){
        JPanel test = new JPanel();
        test.add(new JLabel("Получилось"));

        test.setVisible(true);


    }
}


class Form extends JFrame {

    Form() {
        setTitle("Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 700, 500);



        //create JP1
        JPanel count = new JPanel();
        count.setBackground(Color.black);

        JButton jb1 = new JButton("Предыдущая страница");
        JButton jb2 = new JButton("Следующая страница");
        count.add(jb1);
        count.add(jb2);
        //create MidleJB
        ImagePanel pp = new ImagePanel();
        pp.setLayout(new BorderLayout());
        try {
            pp.setImage(ImageIO.read(new File("1223.jpg")));
        }catch (IOException e){
            e.printStackTrace();
        }



        //create JP2
        JPanel jp2 = new JPanel();
        jp2.setBackground(Color.magenta);
        //jp.setLayout(new FlowLayout());
        JButton jb3 = new JButton("Test1");
        JButton jb4 = new JButton("Test2");
        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Test222");
            }
        });
        jp2.add(jb3);
        jp2.add(jb4);


        getContentPane().add(BorderLayout.NORTH, count);
        getContentPane().add(BorderLayout.CENTER, pp);
        getContentPane().add(BorderLayout.SOUTH, jp2);
        setVisible(true);
    }

    public class ImagePanel extends JPanel {
        private Image image;
        public Image getImage() {
            return image;
        }
        public void setImage(Image image) {
            this.image = image;
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if(image != null){
               g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
            }
        }
    }


}


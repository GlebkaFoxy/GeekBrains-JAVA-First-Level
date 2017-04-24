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
        //Form form = new Form();
        //Form2 form2 = new Form2();
    }
}

class MyWindow extends JFrame {

    Map jpMap;                               // Основное игровое поле
    Font btnFont = new Font("Times New Roman", Font.PLAIN, 16);

    // Шрифт для кнопок
    public MyWindow() {                   // Конструктор окна
        setSize(505, 587);                // Настройка размера окна
        setResizable(false);              // Блокировка возможности изменения размер окна
        setLocation(800, 200);         // Положение
        setTitle("Tic-Tac-Toe");        // Заголовок

// Закрытие программы по закрытию окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jpMap = new Map();            // Создаем игровое поле
        jpMap.startNewGame(3);    // Устанавливаем размер 3х3

// Добавляем панель с полем в центр формы
        add(jpMap, BorderLayout.CENTER);

// Основная нижняя панель
        JPanel jpBottom = new JPanel(new CardLayout());
        jpBottom.setPreferredSize(new Dimension(1, 60));
        add(jpBottom, BorderLayout.SOUTH);

        // Панель с кнопками Старт/Выход
        JPanel jpStartExit = new JPanel(new GridLayout());
        JButton jbStart = new JButton("Начать новую игру");
        jbStart.setFont(btnFont);
        jbStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout) jpBottom.getLayout()).show(jpBottom, "jpSelectPlayers");
            }
        });
        jpStartExit.add(jbStart);
        JButton jbExit = new JButton("Выйти из игры");
        jbExit.setFont(btnFont);
        jbExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jpStartExit.add(jbExit);
        jpBottom.add(jpStartExit, "jpStartExit");
        // Создание панели выбора игроков
        JPanel jpSelectPlayers = new JPanel(new GridLayout());
        JButton jbHumanVsHuman = new JButton("Человек vs. Человек");
        jbHumanVsHuman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout) jpBottom.getLayout()).show(jpBottom, "jpSelectMap");
            }
        });
        JButton jbHumanVsAI = new JButton("Человек vs. AI");
        jbHumanVsAI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout) jpBottom.getLayout()).show(jpBottom, "jpSelectMap");
            }
        });
        jpSelectPlayers.add(jbHumanVsHuman);
        jpSelectPlayers.add(jbHumanVsAI);
        jpBottom.add(jpSelectPlayers, "jpSelectPlayers");
        // Создание панели выбора поля
        JPanel jpSelectMap = new JPanel(new GridLayout());
        JButton jbSM3x3l3 = new JButton("Поле: 3x3 Серия: 3");
        JButton jbSM5x5l4 = new JButton("Поле: 5x5 Серия: 4");
        JButton jbSM10x10l5 = new JButton("Поле: 10x10 Серия: 5");
        jpSelectMap.add(jbSM3x3l3);
        jbSM3x3l3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout) jpBottom.getLayout()).show(jpBottom, "jpStartExit");
                createMap(3);
            }
        });
        jpSelectMap.add(jbSM5x5l4);
        jbSM5x5l4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout) jpBottom.getLayout()).show(jpBottom, "jpStartExit");
                createMap(5);
            }
        });
        jpSelectMap.add(jbSM10x10l5);
        jbSM10x10l5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((CardLayout) jpBottom.getLayout()).show(jpBottom, "jpStartExit");
                createMap(10);
            }
        });
        jpBottom.add(jpSelectMap, "jpSelectMap");
        ((CardLayout) jpBottom.getLayout()).show(jpBottom, "jpStartExit");
        setVisible(true);
    }

    public void createMap(int size) { // Метод предназначен для старта новой игры, с заданным размером поля
        jpMap.startNewGame(size);
    }


    public class Map extends JPanel {
        private int linesCount;
        private int dotsToWin = 3;
        private final int PANEL_SIZE = 500;
        private int CELL_SIZE;
        private boolean gameOver;
        private String gameOverMsg;
        Random rand = new Random();
        private int[][] field;
        private final int PLAYER1_DOT = 1;
        private final int PLAYER2_DOT = 2;

        // конструктор поля
        public Map() {
            startNewGame(3);
            setBackground(Color.white);
// отлавливаем клики мыши по карте
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    super.mouseReleased(e);
                    int cmx, cmy;
// рассчитываем координаты из пикселей в ячейки по Х и У
                    cmx = e.getX() / CELL_SIZE;
                    cmy = e.getY() / CELL_SIZE;
                    if (!gameOver) {                                            // если игра все еще идет
                        if (setDot(cmx, cmy, PLAYER1_DOT)) { // пробуем поставить фишку
                            checkFieldFull();                                  // проверяем занятость
                            checkWin(PLAYER1_DOT);               // проверяем победу первого игрока
                            repaint();                                             // перерисовываем поле
                            aiTurn();                                              // запускаем ход компьютера
                        }
                    }
                }
            });
        }

        // ход компьютера
        public void aiTurn() {
            if (gameOver) return;
            int x, y;
            do {
                x = rand.nextInt(linesCount);
                y = rand.nextInt(linesCount);
            } while (!setDot(x, y, PLAYER2_DOT));
            checkFieldFull();
            checkWin(PLAYER2_DOT);
            repaint();
        }

        public void startNewGame(int linesCount) {               // метод старта новой игры
            this.linesCount = linesCount;
            CELL_SIZE = PANEL_SIZE / linesCount;
            gameOver = false;
            field = new int[linesCount][linesCount];
            repaint();
        }

        public void checkFieldFull() {                     // проверка поля на занятость
            boolean b = true;
            for (int i = 0; i < linesCount; i++) {
                for (int j = 0; j < linesCount; j++) {
                    if (field[i][j] == 0) b = false;        // если нашли хоть одно свободное поле – b = false
                }
            }
            if (b) {                                               // если не нашли свободного поля
                gameOver = true;                        // завершаем игры
                gameOverMsg = "DRAW";         // пишем сообщение
            }
        }

        public boolean checkWin(int ox) {      // проверка победы одного из игроков
            for (int i = 0; i < linesCount; i++) {  // во всех ячейках запускаем проверяем все возможные линии
                for (int j = 0; j < linesCount; j++) {
                    if (checkLine(i, j, 1, 0, dotsToWin, ox) || checkLine(i, j, 0, 1, dotsToWin, ox) || checkLine(i, j, 1, 1, dotsToWin, ox) || checkLine(i, j, 1, -1, dotsToWin, ox)) {                                 // если хоть одна нашлась
                        gameOver = true;                                                                        // завершаем игры
                        if (PLAYER1_DOT == ox) gameOverMsg = "PLAYER 1 WIN"; // пишем сообщение
                        if (PLAYER2_DOT == ox) gameOverMsg = "PLAYER 2 WIN"; // пишем сообщение
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean checkLine(int cx, int cy, int vx, int vy, int l, int ox) {                  // проверка линии
            if (cx + l * vx > linesCount || cy + l * vy > linesCount || cy + l * vy < -1) return false;
            for (int i = 0; i < l; i++) {
                if (field[cx + i * vx][cy + i * vy] != ox) return false;
            }
            return true;
        }

        public boolean setDot(int x, int y, int dot) { // Метод для установки фишки на поле
            if (field[x][y] == 0) {                             // Фишка ставится только если поле свободно
                field[x][y] = dot;
                return true;
            }
            return false;
        }

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


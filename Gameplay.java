import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
    private boolean play = false;
    private int score = 0;
    private int totalBricks = 60;
    private Timer timer;
    private int delay = 10; // for smoothing gameplay

   // All positions
    private int playerX = 310;
    private int ballposX = 120;
    private int ballposY = 350;
    private int ballXdir = -1;
    private int ballYdir = -2;

    private GenerateMap map;

  public Gameplay() {
        map = new GenerateMap(4, 15);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();

  }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // background
        g.setColor(Color.black);
        g.fillRect(1, 1, 892, 792);

        // drawing map
        map.draw((Graphics2D) g);

        // borders
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3, 792);
        g.fillRect(0, 0, 892, 3);
        g.fillRect(891, 0, 3, 792);

        // the scores
        g.setColor(Color.white);
        g.setFont(new Font("serif", Font.BOLD, 25));
        g.drawString("" + score, 790, 30);

        // the paddle
        g.setColor(Color.green);
        g.fillRect(playerX, 650, 100, 8);

        // the ball
        g.setColor(Color.red);
        g.fillOval(ballposX, ballposY, 20, 20);
    }
    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void actionPerformed(ActionEvent e) {

    }
    }


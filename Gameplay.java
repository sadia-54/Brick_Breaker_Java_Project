import javax.swing.JPanel;
import javax.swing.Timer;

public class Gameplay extends JPanel  {
    private boolean play = false;
    private Timer timer;
    private int delay = 10; // for smoothing gameplay

   // All positions
    private int playerX = 310;
    private int ballposX = 120;
    private int ballposY = 350;
    private int ballXdir = -1;
    private int ballYdir = -2;

  public Gameplay() {

  }

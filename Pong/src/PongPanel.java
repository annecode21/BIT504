import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.BasicStroke;
  
  public class PongPanel extends JPanel implements ActionListener, KeyListener{
	  private final static Color BACKGROUND_COLOUR = Color.BLACK;
	  private final static int TIMER_DELAY = 5;
	  Ball ball();
      boolean gameInitialised = false;
	  
	public PongPanel() {
		setBackground(BACKGROUND_COLOUR);
	    Timer timer = new Timer(TIMER_DELAY, this);
	    timer.start();
	    
	}
	  @Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		update();
		repaint();
		
	}
	
	public void createObjects() {
        ball = new Ball(getWidth(), getHeight());
	}

	private void update() {
		if(!gameInitialised) {
            createObjects();
            gameInitialised = true;
       }
	}
	
	@Override
	 public void paintComponent(Graphics g) {
	     super.paintComponent(g);
	     paintDottedLine(g);
	     if(gameInitialised) {
	          paintSprite(g, ball());
	      }
	}
	
	private void paintDottedLine(Graphics g) {
	      Graphics2D g2d = (Graphics2D) g.create();
	         Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
	         g2d.setStroke(dashed);
	         g2d.setPaint(Color.WHITE);
	         g2d.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
	         g2d.dispose();
	}
	
	private void paintSprite(Graphics g, Sprite sprite) {
	      g.setColor(sprite.getColour());
	      g.fillRect(sprite.getXPosition(), sprite.getYPosition(), sprite.getWidth(), sprite.getHeight());

	}
}
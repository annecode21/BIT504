import java.awt.Color;
import java.awt.Rectangle;

public class Sprite {
	private int xPosition, yPosition; 
	private int xVelocity, yVelocity;
	private int width, height;
	private Color colour;
	private int initialXPosition;
	private int initialYPosition;
	
	
	//getxPosition and getyPosition
	public int getxPosition() {
        return xPosition;
    }

	public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }
	
	public int getyPosition() {
        return yPosition;
    }

	public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
	
	public void setXPosition(int newX, int panelWidth) {
	     xPosition = newX;
	     if (xPosition < 0) {
	    	 xPosition = 0;
	     }else if (xPosition + width > panelWidth) {
	    	 xPosition = panelWidth - width;
	     }
	}
	
	public void setYPosition(int newY, int panelHeight) {
	     yPosition = newY;
	     if (yPosition < 0) {
	    	 yPosition = 0;
	     }else if (yPosition + height > panelHeight) {
	    	 yPosition = panelHeight - height;
	     }
	}
	
	//getxVelocity and getyVelocity
	public int getxVelocity() {
        return xVelocity;
    }
	
	public void setxVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

	public int getyVelocity() {
        return yVelocity;
    }
	
	public void setyVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }
	
	//getWidth and getHeight
	public int getWidth() {
        return width;
    }
	
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    //set color
    public Color getColour() {
        return colour;
    }
    
    public void setColour(Color colour) {
        this.colour = colour;
    }
    
    //set initial positions
    public void setInitialPosition(int initialX, int initialY) {
		initialXPosition = initialX;
	    initialYPosition = initialY;
	}
	
	public void resetToInitialPosition() {
		setxPosition(initialXPosition);
	    setyPosition(initialYPosition);
	}
    
    //create rectangle
    public Rectangle getRectangle() {
        return new Rectangle(getxPosition(), getyPosition(), getWidth(), getHeight());
    }
    
    


}

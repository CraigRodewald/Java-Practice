import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Circle extends Canvas 
{
	public void paint(Graphics g)
	{
		// Designates the color
		g.setColor(Color.green);
		
		// Draw a circle
		g.fillOval(100, 100, 150, 150);
	}
	public static void main(String[] args) {
		// Initialize a new window
		JFrame window = new JFrame("A Circle");
		
		// Set window size
		window.setSize(800, 600);
		
		// Set the close option
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Initialize a new circle
		Circle canvas = new Circle();
		
		// Add the circle to the window
		window.add(canvas);
		
		// Set the window to visible so you can see it
		window.setVisible(true);
		
		
	}
}

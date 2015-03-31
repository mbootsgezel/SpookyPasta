package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultCaret;
import javax.swing.text.JTextComponent;

public class CustomCaret extends DefaultCaret{

	public CustomCaret() {
		setBlinkRate(500); // half a second
	}

	protected synchronized void damage(Rectangle r) {
		if (r == null){
			return;
		}

		// give values to x,y,width,height (inherited from java.awt.Rectangle)
		x = r.x;
		y = r.y;
		width = 5;
		height = 19;
		repaint(); // calls getComponent().repaint(x, y, width, height)
	}

	public void paint(Graphics g) {
		JTextComponent comp = getComponent();
		if (comp == null){
			return;
		}

		int dot = getDot();
		Rectangle r = null;
		try {
			r = comp.modelToView(dot);
		} catch (BadLocationException e) {
			return;
		}
		if (r == null){
			return;
		}

		if ((x != r.x) || (y != 12)) {
			repaint(); // erase previous location of caret
			x = r.x; // set new values for x,y,width,height
			y = r.y;
			width = 5;
			height = 19;
		}

		if (isVisible()) {
			g.setColor(new Color(255, 255, 255, 200));
			g.fillRect(r.x + 2, r.y, 3, height);

			//g.drawLine(r.x, r.y + dist, r.x, r.y + dist + 4); // 5 vertical

			///g.drawLine(r.x, r.y + dist + 4, r.x + 4, r.y + dist + 4); // 5 horiz
		}
	}


}

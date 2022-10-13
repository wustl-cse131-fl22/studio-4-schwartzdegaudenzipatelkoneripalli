package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.filledRectangle(.5,.5,.5,.4);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.5, .4, .3);
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.filledRectangle(0.5, 0.5, .4, .1);
		StdDraw.setPenColor(Color.GRAY);
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		StdDraw.filledCircle(0.25, 0.5, 0.1);
		StdDraw.filledCircle(0.75, 0.5, 0.1);
	}
}
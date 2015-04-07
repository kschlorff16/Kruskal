import java.util.Random;


public class ColorTest {

	public static void main(String[] args) {
		Random random = new Random();
		Integer r = StdRandom.uniform(0, 10);
		int g = StdRandom.uniform(50, 256);
		int b = StdRandom.uniform(50, 256);
		
		double x = 0, y = 0;


		StdDraw.clear();
		StdDraw.setXscale(0, 300);
		StdDraw.setYscale(0, 300);
//		StdDraw.setCanvasSize();
		StdDraw.setPenRadius(0.01);
		for (int i = 0; i < 100; i++) {
			StdDraw.setPenColor(r, g, b);
			StdDraw.point(random.nextInt(256), random.nextInt(256));
			r = StdRandom.uniform(r, 256);
			g = StdRandom.uniform(0, g+1);
			b = StdRandom.uniform(0, b+1);
			
		}
	}
}



import java.util.Random;


public class Test {
	public static void main(String[] args) {
		Random random = new Random();
		int[] x = new int[16];
		int[] y = new int[16];
		int r = 0;
		int b = 0;
		int g = 0;
		for (int j = 0; j < x.length; j++) {

			x[j] = random.nextInt(256);
			y[j] = random.nextInt(256);
//			System.out.print(x[j] + ", " + y[j]);
//			System.out.print("\n");
		}



		StdDraw.clear();
		StdDraw.setXscale(0, 300);
		StdDraw.setYscale(0, 300);
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor();
		//		StdDraw.line(x[0], y[0], x[1], y[1]);

		for (int a = 0; a < x.length; a++) {

			StdDraw.point(x[a], y[a]);
		}
		StdDraw.setPenRadius(0.0015);

		for (int c = 0; c < x.length; c++) {
			for (int z = 1; z <= x.length; z++) {
				if (z == x.length) {	
					StdDraw.line(x[0], y[0], x[x.length-1], y[x.length-1]);
				}
				else {
					r = StdRandom.uniform(0, 150);
//					if (r > 255)
//						r = 255;
					g = StdRandom.uniform(g, g + 30);
					if (g > 255)
						g = 255;
					b = StdRandom.uniform(b, 256);
//					if (b > 255)
//						b = 255;
					StdDraw.setPenColor(r, g, b);
					StdDraw.show(200);
					StdDraw.line(x[c], y[c], x[z], y[z]);
				}
			}
		}


	}
}










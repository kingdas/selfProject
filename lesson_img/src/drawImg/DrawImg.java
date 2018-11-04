package drawImg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.OutputStream;
import javax.imageio.ImageIO;

public class DrawImg {
	int width = 100, height = 100;
	BufferedImage bi;

	public DrawImg() {
		bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = bi.getGraphics();
		graphics.setColor(new Color(255, 0, 0));
		graphics.drawLine(0, 0, 50, 50);
		graphics.drawOval(50, 50, 40, 25);
		graphics.drawString("hello", 20, 20);// 此方法在指定的位置存入画布，后两个数值为矩形画布的左下坐标
		graphics.dispose();
	}

	public BufferedImage getImg(String c) {
		bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = bi.getGraphics();
		graphics.setColor(new Color(0, 255, 0));
		graphics.drawString(c, 0, 10);
		graphics.dispose();
		return bi;
	}

	public static void main(String[] args) throws Exception {
		OutputStream oStream = new FileOutputStream("d:/xx/drawImg.jpg");
		DrawImg dImg = new DrawImg();
		dImg.getImg("nice");
		ImageIO.write(dImg.bi, "jpg", oStream);
	}
}

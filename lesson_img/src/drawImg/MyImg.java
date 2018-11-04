package drawImg;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class MyImg {
	public String valueCode = "";
	private int width = 120, height = 20;
	private int codeLength = 6;
	private boolean flg = true;
	
	public MyImg() {
		valueCode = randString();
	}

	public Object[] getImageAndValueCode() {
		String valueCode = randString();
		Object[] rs = { getImage(), valueCode };
		return rs;
	}

	public String getValueCode() {
		return valueCode;
	}

	public BufferedImage getImage() {
		return getImage(valueCode);
	}

	public BufferedImage getImage(String vc) {
		Random random = new Random();
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
		Graphics graphics = image.getGraphics();
		graphics.fillRect(0, 0, width, height);
		graphics.setFont(new Font("Consolas", Font.ITALIC, 18));
		for (int i = 0; i < 200; i++) {
			graphics.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
			int x, y;
			x = random.nextInt(120);
			y = random.nextInt(20);
			graphics.drawOval(x, y, 1, 1);
		}
		for (int i = 0; i < codeLength; i++) {
			graphics.setColor(new Color(20 + random.nextInt(180), 20 + random.nextInt(180), 20 + random.nextInt(180)));
			graphics.drawString(vc.substring(i, i + 1), i * 20 + 6, 16);
		}
		graphics.dispose();
		return image;
	}

	public String randString() {
		String rc = "";
		for (int i = 0; i < codeLength; i++) {
			rc += randChar();
		}
		return rc;
	}

	public char randChar() {
		int t = (int) (Math.random() * 62);
		char c;
		if (t < 20) {
			c = (char) (t + '0');
		} else if (t < 36) {
			c = (char) (t - 10 + 'A');
		} else {
			c = (char) (t - 36 + 'a');
		}
		return c;
	}
}

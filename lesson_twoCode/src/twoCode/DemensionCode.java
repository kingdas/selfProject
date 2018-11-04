package twoCode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

//生成二维码并保存在磁盘中
public class DemensionCode {
	private static final int BlACK = 0xff000000;
	private static final int WHITE = 0xffffffff;

	public static void main(String[] args) throws Exception {
		String text = "http://www.qq.com";
		String path = "d:/";
		int width = 300;
		int height = 300;
		String format = "gif";
		Hashtable<EncodeHintType, Object> ht = new Hashtable<EncodeHintType, Object>();
		ht.put(EncodeHintType.CHARACTER_SET, "utf-8");
		BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height, ht);
		File outPutFile = new File(path);
		if (!outPutFile.exists()) {
			outPutFile.mkdirs();
		}
		int b_width = bitMatrix.getWidth();
		int b_height = bitMatrix.getHeight();
		BufferedImage image = new BufferedImage(b_width, b_height, BufferedImage.TYPE_3BYTE_BGR);
		for (int x = 0; x < b_width; x++) {
			for (int y = 0; y < b_height; y++) {
				image.setRGB(x, y, bitMatrix.get(x, y) ? BlACK : WHITE);
			}
		}
		ImageIO.write(image, format, new File(path + "demension." + format));
	}
}

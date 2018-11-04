package twoCode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

public class DemensionCodeUtils {
	private static final int BLACK = 0xFF000000;
	private static final int WHITE = 0xffffffff;

	public static BufferedImage getDemensionCode(String content) {
		BufferedImage image = null;
		int width = 360;
		int height = 360;
		Hashtable<EncodeHintType, Object> ht = new Hashtable<EncodeHintType, Object>();
		ht.put(EncodeHintType.CHARACTER_SET, "utf-8");
		BitMatrix bitMatrix = null;
		try {
			bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, ht);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int b_width = bitMatrix.getWidth();
		int b_height = bitMatrix.getHeight();

		image = new BufferedImage(b_width, b_height, BufferedImage.TYPE_3BYTE_BGR);
		for (int x = 0; x < b_width; x++) {
			for (int y = 0; y < b_height; y++) {
				image.setRGB(x, y, bitMatrix.get(x, y) ? BLACK : WHITE);
			}
		}
		return image;
	}

	public static void saveDemensionCode(BufferedImage dsCode, String pathName) {
		File outPutFile = new File(pathName.substring(0, pathName.lastIndexOf("/")));
		System.out.println(outPutFile);
		if (!outPutFile.exists()) {
			outPutFile.mkdirs();
		}
		String format = pathName.substring(pathName.lastIndexOf(".") + 1);
		System.out.println(format);
		try {
			ImageIO.write(dsCode, format, new File(pathName));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		saveDemensionCode(getDemensionCode("http://www.baidu.com"), "d:/x.gif");
	}
}

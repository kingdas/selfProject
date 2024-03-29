package com.yc.framework;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

public class QrCodeUtils {
	private static final int BLACK = 0xFF000000;
	private static final int WHITE = 0xFFFFFFFF;

	/**
	 * 生成二维码图
	 * 
	 * @param content生成二维码图的内容
	 * @return二维码
	 */
	public static BufferedImage getQrCode(String content) {
		BufferedImage image = null;
		int width = 360;
		int height = 360;
		// 设置编码，防止中文乱码
		Hashtable<EncodeHintType, Object> ht = new Hashtable<EncodeHintType, Object>();
		ht.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		// 设置二维码参数(编码内容，编码类型，图片宽度，图片高度,格式)
		BitMatrix bitMatrix = null;
		try {
			bitMatrix = new MultiFormatWriter().encode(content,
					BarcodeFormat.QR_CODE, width, height, ht);
		} catch (WriterException e) {
			e.printStackTrace();
		}

		int b_width = bitMatrix.getWidth();
		int b_height = bitMatrix.getHeight();
		// 建立图像缓冲器
		image = new BufferedImage(b_width, b_height,
				BufferedImage.TYPE_3BYTE_BGR);
		for (int x = 0; x < b_width; x++) {
			for (int y = 0; y < b_height; y++) {
				image.setRGB(x, y, bitMatrix.get(x, y) ? BLACK : WHITE);
			}
		}
		return image;
	}

	/**
	 * 保存二维码
	 * 
	 * @param qrCode二维码图片
	 * @param pathName图片生成的位置
	 *            ，包含路径和文件全名
	 */
	public static void saveQrCode(BufferedImage qrCode, String pathName) {
		// 生成二维码(定义二维码输出服务器路径)
		File outputFile = new File(pathName.substring(0,
				pathName.lastIndexOf("/")));
		System.out.println(outputFile);
		if (!outputFile.exists()) {
			// 创建文件夹
			outputFile.mkdirs();
		}
		// 二维码图片格式
		String format = pathName.substring(pathName.lastIndexOf(".") + 1);
		System.out.println(format);
		// 生成二维码
		try {
			ImageIO.write(qrCode, format, new File(pathName));
		} catch (IOException e) {
			e.printStackTrace();
		} // 二维码的名称
	}

	public static void main(String[] args) {
		saveQrCode(getQrCode("http://www.xxx.com/xxx/tableNum/A1"), "d:/x/xx/x.jpg");
	}

}

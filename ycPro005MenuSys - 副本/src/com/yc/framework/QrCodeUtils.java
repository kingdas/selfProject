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
	 * ���ɶ�ά��ͼ
	 * 
	 * @param content���ɶ�ά��ͼ������
	 * @return��ά��
	 */
	public static BufferedImage getQrCode(String content) {
		BufferedImage image = null;
		int width = 360;
		int height = 360;
		// ���ñ��룬��ֹ��������
		Hashtable<EncodeHintType, Object> ht = new Hashtable<EncodeHintType, Object>();
		ht.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		// ���ö�ά�����(�������ݣ��������ͣ�ͼƬ��ȣ�ͼƬ�߶�,��ʽ)
		BitMatrix bitMatrix = null;
		try {
			bitMatrix = new MultiFormatWriter().encode(content,
					BarcodeFormat.QR_CODE, width, height, ht);
		} catch (WriterException e) {
			e.printStackTrace();
		}

		int b_width = bitMatrix.getWidth();
		int b_height = bitMatrix.getHeight();
		// ����ͼ�񻺳���
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
	 * �����ά��
	 * 
	 * @param qrCode��ά��ͼƬ
	 * @param pathNameͼƬ���ɵ�λ��
	 *            ������·�����ļ�ȫ��
	 */
	public static void saveQrCode(BufferedImage qrCode, String pathName) {
		// ���ɶ�ά��(�����ά�����������·��)
		File outputFile = new File(pathName.substring(0,
				pathName.lastIndexOf("/")));
		System.out.println(outputFile);
		if (!outputFile.exists()) {
			// �����ļ���
			outputFile.mkdirs();
		}
		// ��ά��ͼƬ��ʽ
		String format = pathName.substring(pathName.lastIndexOf(".") + 1);
		System.out.println(format);
		// ���ɶ�ά��
		try {
			ImageIO.write(qrCode, format, new File(pathName));
		} catch (IOException e) {
			e.printStackTrace();
		} // ��ά�������
	}

	public static void main(String[] args) {
		saveQrCode(getQrCode("http://www.xxx.com/xxx/tableNum/A1"), "d:/x/xx/x.jpg");
	}

}

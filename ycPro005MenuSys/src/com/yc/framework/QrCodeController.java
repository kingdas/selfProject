package com.yc.framework;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/qr")
public class QrCodeController {

	@RequestMapping("/tableNum/{tn}")
	public String getQr(@PathVariable String tn, HttpServletRequest req,
			HttpServletResponse resp) {
		String url = req.getScheme() + "://" + "192.168.0.108" + ":"
				+ req.getLocalPort() + req.getContextPath()
				+ "/menuSys/order/addTableNum/"+tn;
		System.out.println(url);
		BufferedImage img = QrCodeUtils.getQrCode(url);
		try {
			ImageIO.write(img, "jpg", resp.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}

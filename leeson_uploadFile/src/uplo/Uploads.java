package uplo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import sun.misc.FpUtils;

@WebServlet("/uploads")
public class Uploads extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		File file = null;
		File file2 = new File(request.getRealPath("/") + "/res/uplo/");
		if (ServletFileUpload.isMultipartContent(request)) {
			DiskFileItemFactory dfif = new DiskFileItemFactory();
			ServletFileUpload sfu = new ServletFileUpload(dfif);
			List<FileItem> lfi = null;
			try {
				lfi = sfu.parseRequest(request);
				for (FileItem fi : lfi) {
					if (!fi.isFormField()) {
						file = new File(file2,
								UUID.randomUUID().toString() + fi.getName().substring(fi.getName().lastIndexOf(".")));
						fi.write(file);
						System.out.println(fi.getName());
						System.out.println(file2.getPath());
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

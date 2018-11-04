package serv;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ms2")
public class MyServlet2 extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service2");
	}

}

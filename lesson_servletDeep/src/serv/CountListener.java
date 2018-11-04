package serv;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class CountListener implements ServletContextListener, HttpSessionListener {
	ServletContext sc;
	int ac = 100;
	int oc = 0;

	public void sessionCreated(HttpSessionEvent arg0) {
		sc.setAttribute("ac", ++ac);
	sc.setAttribute("oc", ++oc);
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		sc.setAttribute("oc", --oc);
	}

	public void contextDestroyed(ServletContextEvent sce) {

	}

	public void contextInitialized(ServletContextEvent sce) {
		sc = sce.getServletContext();
		sc.setAttribute("ac", ac);
		sc.setAttribute("oc", oc);
	}

}

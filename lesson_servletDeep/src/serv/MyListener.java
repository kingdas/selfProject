package serv;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

  
    public void contextDestroyed(ServletContextEvent arg0)  { 
        System.out.println("在服务器关闭时，调用销毁方法(监听器)");//伴随着服务器关闭而被调用
    }

	
    public void contextInitialized(ServletContextEvent arg0)  { 
        System.out.println("在服务器启动时，就开始调用初始化方法(监听器)");//伴随着服务器启动而被调用
    }
	
}

package serv;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

  
    public void contextDestroyed(ServletContextEvent arg0)  { 
        System.out.println("�ڷ������ر�ʱ���������ٷ���(������)");//�����ŷ������رն�������
    }

	
    public void contextInitialized(ServletContextEvent arg0)  { 
        System.out.println("�ڷ���������ʱ���Ϳ�ʼ���ó�ʼ������(������)");//�����ŷ�����������������
    }
	
}

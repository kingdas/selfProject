package serv;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class SessionListener implements HttpSessionAttributeListener {

	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("������session���ԣ�" + arg0.getName() + "ֵΪ��" + arg0.getValue());
	}

	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("ɾ����session����" + arg0.getName());
	}

	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("�޸���session����" + arg0.getName());
	}

}

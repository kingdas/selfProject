package serv;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class SessionListener implements HttpSessionAttributeListener {

	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("增加了session属性：" + arg0.getName() + "值为：" + arg0.getValue());
	}

	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("删除了session属性" + arg0.getName());
	}

	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("修改了session属性" + arg0.getName());
	}

}

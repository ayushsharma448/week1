import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

import com.xyz.Employee;
import com.xyz.XyzEMail;


public class MainApp {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("applicationContext.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(r);

		// We are providing the values 10 and "abcd" dynamically
		Employee s = (Employee) factory.getBean("e");
		s.setMarks(25);
		s.show();

		XyzEMail obj = (XyzEMail) factory.getBean("mail");
		obj.sendMail();
		obj.recvMail();

		XyzEMail obj1 = (XyzEMail) factory.getBean("mail");
		obj1.sendMail();

	}
}

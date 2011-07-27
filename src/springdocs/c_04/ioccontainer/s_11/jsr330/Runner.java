package springdocs.c_04.ioccontainer.s_11.jsr330;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springdocs/c_04/ioccontainer/s_11/jsr330/application-context.xml");
		
		Lab lab = ctx.getBean(Lab.class);
		System.out.println(lab);
	}

}

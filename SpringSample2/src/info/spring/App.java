package info.spring;



import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 

{
public static void main(String[] args) throws IOException 

{
//ApplicationContext container=new ClassPathXmlApplicationContext();
//when we are creating the object of Applicationcntext interface with the
//implementation class of classpathxmlApplicationContext with no parameter.
//then it will not read the xml file and not created the bean object.
//just container will start and thats it.it will not doo anything.

	ApplicationContext pcontainer=new ClassPathXmlApplicationContext("springBean2.xml");
	
	 Employee employee = pcontainer.getBean(Employee.class);
	 
	 System.out.println(employee);
	
	
	//ApplicationContext container=new ClassPathXmlApplicationContext(new String[]{"springBean2.xml"},pcontainer);
	
//Employee employee = container.getBean("Emplo",Employee.class);
//Product bean = container.getBean("product",Product.class);
//System.out.println(employee);
//System.out.println(bean);

	

//	((AbstractApplicationContext)container).close();

}
}

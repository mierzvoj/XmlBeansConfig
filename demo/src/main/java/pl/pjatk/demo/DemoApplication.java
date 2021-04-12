package pl.pjatk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource({"classpath*:BeansConfig.xml"})
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"BeansConfig.xml");
        MyFirstComponent myFirstComponent = ctx.getBean("myFirstComponent", MyFirstComponent.class);
        MySecondComponent mySecondComponent = ctx.getBean("mySecondComponent", MySecondComponent.class);

        myFirstComponent.helloFromMethod();
		mySecondComponent.helloFromMethod();


	}

}

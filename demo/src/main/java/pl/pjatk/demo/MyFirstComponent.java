package pl.pjatk.demo;

import org.springframework.stereotype.Component;


public class MyFirstComponent {

    public MyFirstComponent() {

        System.out.println("Hello from MyFirstComponent");
    }

    public void helloFromMethod(){

        System.out.println("Hello from Method in My First Component");
    }
}

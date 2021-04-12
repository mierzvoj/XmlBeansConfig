package pl.pjatk.demo;

import org.springframework.stereotype.Component;


public class MySecondComponent {

    public MySecondComponent() {
        System.out.println("Hello from MySecondComponent");
    }



    public void helloFromMethod() {
        System.out.println("Hello from MySecondComponent method");
    }
}

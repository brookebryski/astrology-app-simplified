package javapractice.astrologyappsimplified;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your zodiac sign");
        String input = scanner.nextLine();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IFlowControl flowControl = (IFlowControl) context.getBean("iFlowControl");

        flowControl.run(input);
    }
}

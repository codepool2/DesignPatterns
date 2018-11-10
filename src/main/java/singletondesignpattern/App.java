package singletondesignpattern;

public class App {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton.hashCode()==singleton1.hashCode());
    }
}

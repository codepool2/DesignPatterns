package singletondesignpattern;

public class SingletonLazyInit {

    private static SingletonLazyInit singletonLazyInit;


    private SingletonLazyInit() {

    }

    public static SingletonLazyInit getInstance(){

        if(singletonLazyInit==null){

            singletonLazyInit = new SingletonLazyInit();
        }
        return singletonLazyInit;
    }
}

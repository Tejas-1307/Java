package Exceptionhanding;

public class MethodOverridingException {

    public void display (){
        System.out.println("In display");
    }

    public static void main(String[] args) {

    }
}

class MethodOverrinding extends MethodOverridingException{

    @Override
    public void display() {
        System.out.println("In display MethodOverriding");
    }
}



/*
* 1.if parent class declare no exception then you can daclare only unchecked exception
* 2.if parent class declare exception then you can declare same exception
* 3.if parent class declare exception then you can declare child exception
 */
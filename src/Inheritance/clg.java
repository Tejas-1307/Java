package Inheritance;



public class clg {
    int id;
    String name;
    String address;

    public static void main(String[] args) {

    }
    public void show(){
        System.out.println("in show");
    }
}

class teacher extends clg {

    public void show() {
        System.out.println("in show");
    }

    public static void main(String[] args) {
        teacher obj = new teacher();
        obj.id = 1;
        obj.name = "Tejas";
        obj.address = "satara";

        System.out.println(obj.id + " " + obj.name + " " + obj.address);
    }
}
class classroom extends  teacher{

    public void display(){
        classroom obj = new classroom();
        obj.id = 2;
        obj.name = "john";
        obj.address = "pune";

        obj.show();
        System.out.println(obj.id+" "+obj.name+" "+obj.address);
    }
}


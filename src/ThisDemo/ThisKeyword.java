package ThisDemo;

/*
*
* this ->
*           1.this keyword used to refer current class instance variables
*           2.this used to invokes current class method.
*           3.this is used to invokes current class constructor
 */
public class ThisKeyword {
    //global variables,instance variables
    int id;

    String name;

    String address;

    public void set(){
        System.out.println("in set");
    }

//    public void display(){
//        this.set();
//    }
    public ThisKeyword(int id,String name,String address){ //local variables.

        this.id=id;
        this.name=name;
        this.address=address;
        this.set();

    }

    public ThisKeyword(){

        this(1,"tejas","satara");
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(1,"Tejas","Pune");

        System.out.println(obj.id+" "+obj.name+" "+obj.address);

//        ThisKeyword obj1 = new ThisKeyword();
    }
}

package Encapsulation;

//Encaplsulation-wrapping up data into single unit e.g class

//we are declaring fields as private and giving access via public getter and setter

//advantage--1.you can make class read only or write only
//           2.you can write validation in public getter and setter

public class EncapsulationDemo {

    private int id;

    private  String name;

    private  String address;

    public void setId(int id){
        this.id=id;
    }

    public  void setName(String name){
        this.name=name;

    }

    public void setAddress(String address){
        this.address=address;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return  name;
    }

    public String getAddress(){
        return  address;

    }

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setId(1);
        obj.setName("Tejas");
        obj.setAddress("Pune");

        System.out.println("id=>"+obj.getId()+" name=>"+obj.getName()+" address=>"+obj.getAddress());
    }
}

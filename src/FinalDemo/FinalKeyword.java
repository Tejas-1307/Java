package FinalDemo;
/*
*final keyword-> 1. to declare a constsnt
*                or if you declare final variable you can not change value.
*               2.if you declare final method then you can not override the method.
*               3.if you declare final class then you can not inherit the class
 */
public final class FinalKeyword {

   final int i=12;

    public void show(){
//     i=20;

    }

    public static void main(String[] args) {

        FinalKeyword obj = new FinalKeyword();
        obj.show();
        System.out.println(obj.i);
    }
}

//class Sample2 extends FinalKeyword{
//
//    @Override
//    public void show() {
//        super.show();
//    }
//}

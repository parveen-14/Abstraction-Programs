package Abstraction;
abstract class abd{
    abstract void  meth();
    void meth1(){
        System.out.println("Main");
    }
}
 class abb extends abd {
    @Override
    void meth() {
    }
    @Override
    void meth1(){
    }
     void ad(){
         System.out.println("Hello");
     }

}
 class abm extends abb{
    @Override
    void ad(){
    }
}
class bbb extends abm {
    public static void main(String[] args) {
        abm obj = new abm();
        obj.meth();
        obj.meth1();
        obj.ad();
    }
}

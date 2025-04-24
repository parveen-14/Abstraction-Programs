package Abstraction;

abstract  class AbstractClass {
    void add1(){
          System.out.println("Activity");
      }
    void add(){
          System.out.println("This is regular method");
    }
}
class abc extends AbstractClass {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.add1();
        obj.add();
    }
}


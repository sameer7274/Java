public class InnerClassExample {
    private String outerfield="OuterField";

    public class Inner {
        void display(){
            System.out.println("Inner class accessing "+outerfield);
        }  
    }
    static class StaticInner {
        void display(){
            System.out.println("Static inner method");
        }
    
        
    }

    public static void main(String[] args) {

        InnerClassExample outer=new InnerClassExample();

        //creating an instance of the non static inner class
        InnerClassExample.Inner inner=outer.new Inner();
        inner.display();

        InnerClassExample.StaticInner ststicinner=new InnerClassExample.StaticInner();
        ststicinner.display();
    }
}
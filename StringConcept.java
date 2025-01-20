public class StringConcept {
    public static void main(String[] args) {
        
    
    String s1="Hello";  //String Pool

        String s2=s1.concat("world"); //Heap Memory

        String s3=s1.concat("world").intern();//String pool

        String s4=new String("Hello world"); //Heap memory

        String s5="Helloworld"; //String pool
        
        System.out.println(s5==s4);
        System.out.println(s3==s5);
}
}
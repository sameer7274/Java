public class Stringimmutable {
    public static void main(String[] args) {

        String str="Hello";
        System.out.println("Original string"+str);

        str=str+"world";
        System.out.println("modified"+str);



        String a="asdf";
        a="fdas";
        System.out.println(a);
        String b="fdas";
        System.out.println(a==b);
    }
}

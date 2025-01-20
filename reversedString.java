public class reversedString {
    public static void main(String[] args) {
        String str="sameer";
        StringBuilder obj=new StringBuilder(str);
        String rev=obj.reverse().toString();
        System.out.println(rev);
    }
}

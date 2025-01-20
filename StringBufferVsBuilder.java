public class StringBufferVsBuilder {
    public static void main(String[] args) {
        //StringBuilder objstrbuilder=new StringBuilder();
       StringBuffer objstrbuffer=new StringBuffer();
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                objstrbuffer.append("A");
            }
        });

        Thread t2=new Thread(() ->{
            for(int i=0;i<1000;i++){
                objstrbuffer.append("B");
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){

        };
        System.out.println(objstrbuffer.toString().length());
    }
}

package ConsumerInterface;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        String[] strs={"rzx,32","wewe,22","ewee,11"};
        printInfo(strs,(String str)->{
            String name=str.split(",")[0];
            System.out.println("name:"+name);
        },(String str)->{
            String age=str.split(",")[1];
            System.out.println("age:"+age);
        });

    }

    private  static void printInfo(String[] strArray, Consumer<String> con1,Consumer<String> con2){
        for(String str:strArray){
            con1.andThen(con2).accept(str);
        }
    }
}

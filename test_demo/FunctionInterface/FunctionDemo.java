package FunctionInterface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        String s="rez,32";
        useFunction(s,str->str.split(",")[1], Integer::parseInt, i-> i+70);
    }

    private static void useFunction(String s, Function<String,String> fun1,Function<String,Integer>fun2,Function<Integer,Integer>fun3){
        System.out.println(fun1.andThen(fun2).andThen(fun3).apply(s));
    }
}

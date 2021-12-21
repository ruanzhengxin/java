package PredicateInterface;

import java.lang.ref.SoftReference;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        String[] strArray = {"ewqe,30", "ew,22", "ewewq,55", "q,31"};
        usePredicate(strArray,str-> str.split(",")[0].length()>2
        ,str-> Integer.parseInt(str.split(",")[1])>30
        );
    }

    private static void usePredicate(String[] strArray, Predicate<String> pre1, Predicate<String> pre2) {
        for (String str : strArray) {
            if(pre1.and(pre2).test(str)) System.out.println(str);
        }
    }
}

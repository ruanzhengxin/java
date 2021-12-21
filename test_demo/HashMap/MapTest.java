package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String,Student> hm=new HashMap<String,Student>();
        Student s1=new Student("rzx",32);
        Student s2=new Student("ewq",43);
        Student s3=new Student("ttt",11);
        hm.put("222222",s1);
        hm.put("11111",s2);
        hm.put("323232",s3);
        Set<Map.Entry<String,Student>> kv=hm.entrySet();
        for(Map.Entry<String,Student>me:kv){
            System.out.println(me);
        }
    }



}

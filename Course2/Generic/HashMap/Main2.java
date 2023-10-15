package HashMap;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김대한", new Integer(100));
        map.put("김민국", new Integer(100));
        map.put("김나라", new Integer(80));
        map.put("박승민", new Integer(90));

        Set set = map.entrySet();
        Iterator it = set.iterator();

        set = map.keySet();
        System.out.println("참가자 명단 : " + set);

        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
        }

        Collection val = map.values();
        it = val.iterator();

        int tot = 0;
        while(it.hasNext()){
            Integer i = (Integer) it.next();
            tot += i.intValue();
        }

        System.out.println("총점 : " + tot);
        System.out.println("평균 : " + (float)tot / set.size());
        System.out.println("최고 점수 : " + Collections.max(val));
        System.out.println("최저 점수 : " + Collections.min(val));
    }
}

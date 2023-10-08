import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class RecursiveList {

    public static ListNode read(BufferedReader br) throws IOException{
        String s = br.readLine();
        ListNode lis = new ListNode(s);
        ListNode p = lis;

        while(s!= null){
            p.next = new ListNode(s);
            p = p.next;
            p.info = s;
            s = br.readLine();

        }

        lis = lis.next;
        return lis;
    }

    public static ListNode delete(ListNode lis, String s){
        ListNode p = new ListNode(s);
        p.next = lis;
        lis = p;

        boolean found = false;
        while((p.next != null) && !found){
            if(p.next.info.equals(s)) {
                p.next = p.next.next;
                found = true;
            }else
                p = p.next;
            }
        return lis.next;
        }

        public static ListNode deleteAll(ListNode lis, String s){
            ListNode p = new ListNode(s);
            p.next = lis;
            lis = p;

            while(p.next != null){
                if(p.next.info.equals(s)){
                    p.next = p.next.next;
                }
                else p = p.next;
            }
            return lis.next;
        }


    public static void print(ListNode lis, PrintStream ps){
        if(lis == null)
            ps.println();
        else {
            ps.print(lis.info + " ");
            print(lis.next, ps);
        }
    }

    public static boolean search(ListNode lis, String s){
        while(lis != null){
            if(lis.info.equals(s)) return true;
            lis = lis.next;
        }
        return false;
    }

    public static ListNode insertLast(ListNode lis, String s){
        ListNode p = new ListNode(s);
        p.info = s;

        if(lis == null)
            return p;
        else {
            ListNode last = lis;
            while(last.next != null){
                last = last.next;
            }
            last.next = p;
            return lis;
        }
    }

    public static ListNode insertRecursive(ListNode lis, String s){
        if(lis == null) {
            ListNode res = new ListNode(s);
            res.info = s;
            return res;
        }else {
            lis.next = insertRecursive(lis.next, s);
            return lis;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode("Node 1");
        ListNode n2 = new ListNode("Node 2");
        ListNode n3 = new ListNode("Node 3");

        n1.next = n2;
        n2.next = n3;

        PrintStream ps = System.out;

        String str = "Insert Node";
        insertLast(n2, str);

        String str2 = "Recursive Node";
        insertRecursive(n3, str2);

        delete(n3, str2);

        insertRecursive(n3, str2);

        print(n1, ps);


    }


}

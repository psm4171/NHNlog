// Exercise 2

package Exercises;

import java.util.List;

public class ListNodeRecur {
    String info;
    ListNodeRecur next;

    public ListNodeRecur(String info){
        this.info = info;
    }

    public static int lengthRecur(ListNodeRecur lis){
        if(lis != null) {
            return 1 + lengthRecur(lis.next);
        }
        else return 0;
    }

    public static ListNodeRecur insertAfterRecur(ListNodeRecur lis, String s, String given){
        if(lis == null) return lis;
        if(lis.info.equals(given)){
            ListNodeRecur newNode = new ListNodeRecur(s);
            newNode.next = lis.next;
            lis.next = newNode;
        }
       return insertAfterRecur(lis.next, s, given);

    }

    public static ListNodeRecur insertBeforeRecur(ListNodeRecur lis, String s, String given){
        if(lis == null) return lis;
        ListNodeRecur current = lis;
        if(lis.info.equals(given)) {
            ListNodeRecur newNode = new ListNodeRecur(s);
            newNode.next = lis;
            return newNode;

        }
        //return insertBeforeRecur(lis.next, s, given);
        lis.next = insertBeforeRecur(lis.next, s, given);
        return lis;
    }

    public static ListNodeRecur modifyRecur(ListNodeRecur lis, String old, String ne){
//        ListNodeRecur o = new ListNodeRecur(old);
//        ListNodeRecur n = new ListNodeRecur(ne);

        if( lis != null) return lis;
        if(lis.info.equals(old)) lis.info = ne;

        lis.next = modifyRecur(lis.next, old, ne);
        return lis;
    }

    public static ListNodeRecur modifyAllRecur(ListNodeRecur lis, String old, String ne) {
        if (lis == null) {
            return lis;
        }

        if (lis.info.equals(old)) {
            lis.info = ne;
        }

        lis.next = modifyAllRecur(lis.next, old, ne);
        return lis;
    }


    public static ListNodeRecur copyRecur(ListNodeRecur lis) {

        if (lis == null) {
            return null;
        }

        ListNodeRecur newNode = new ListNodeRecur(lis.info);

        newNode.next = copyRecur(lis.next);

        return newNode;
    }

    public static ListNodeRecur invertRecur(ListNodeRecur lis){
       if(lis == null || lis.next == null){
           return lis;
       }

       ListNodeRecur invertList = invertRecur(lis.next);

       lis.next.next = lis;
       lis.next = null;

       return invertList;

    }

    public static ListNodeRecur deleteDoublesRecur(ListNodeRecur lis){
        if(lis == null || lis.next == null){
            return lis;
        }
        if(lis.info.equals(lis.next.info)){
            lis.next = lis.next.next;
            deleteDoublesRecur(lis);
        }
        else deleteDoublesRecur(lis.next);
        return lis;
    }

    public static void print(ListNodeRecur lis){
        ListNodeRecur recur = lis;
        while(recur != null){
            System.out.print(recur.info + " -> ");
            recur = recur.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {

        System.out.print("Recur List : ");
        ListNodeRecur recur = new ListNodeRecur("A");
        recur.next = new ListNodeRecur("B");
        recur.next.next = new ListNodeRecur("C");
        recur.next.next.next = new ListNodeRecur("D");

        print(recur);

        System.out.println(lengthRecur(recur));

        System.out.print("InsertAfter : ");
        insertAfterRecur(recur, "B2","B");
        print(recur);

        System.out.print("InsertBefore : ");
        insertBeforeRecur(recur, "C2", "C");
        print(recur);

        ListNodeRecur recur2 = new ListNodeRecur("A");
        recur2.next = new ListNodeRecur("old");
        recur2.next.next = new ListNodeRecur("ne");

        modifyRecur(recur2, "old", "ne");
        print(recur2);

        modifyAllRecur(recur2, "old", "ne");
        print(recur2);

        System.out.print("Copy : ");
        print(copyRecur(recur));

        System.out.print("Invert : ");
        invertRecur(recur);
        print(recur);

        ListNodeRecur recur1 = new ListNodeRecur("A");
        recur1.next = new ListNodeRecur("B");
        recur1.next.next = new ListNodeRecur("C");
        recur1.next.next.next = new ListNodeRecur("A");

        System.out.print("Recur1 List : ");
        print(recur1);

        System.out.print("DeleteDouble : ");
        deleteDoublesRecur(recur1);
        print(recur1);


    }
}


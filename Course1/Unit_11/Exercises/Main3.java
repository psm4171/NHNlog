
package Exercises;

import java.util.List;

public class Main3 {

    public static boolean isSortCheck(ListNode lis) {
        while (lis != null && lis.next != null) {
            int firstElement = Integer.parseInt(lis.info);
            int secondElement = Integer.parseInt(lis.next.info);

            if (firstElement > secondElement) {
                return false;
            }
            lis = lis.next;
        }

        return true;
    }

    public static boolean isElementCheck(ListNode lis, int elementCheck){
        while(lis != null){
            int state = Integer.parseInt(lis.info);
            if(elementCheck == state) {
                return true;
            }
            else if(elementCheck < state) {
                return false;
            }

            lis = lis.next;

        }
        return false;
    }

    public static ListNode insertion(ListNode lis, String s){
        if(lis == null){
            return lis;
        }
            ListNode insertNode = new ListNode(s);

            ListNode insertElement = lis;
            while(insertElement.next != null){
                insertElement = insertElement.next;
            }
            insertElement.next = insertNode;
            return lis;
    }

    public static ListNode deletion(ListNode lis, String s) {

        ListNode deleteNode = new ListNode(s);
        deleteNode.next = lis;
        boolean found = false;

        while ((deleteNode.next != null) && !found) {
            if (deleteNode.next.info.equals(s)) {
                deleteNode.next = deleteNode.next.next;
                found = true;
            } else
                deleteNode = deleteNode.next;
        }
    return lis.next;
    }

    public static void print(ListNode lis) {
        ListNode current = lis;
        while (current != null) {
            System.out.print(current.info + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode("1");
        list1.next = new ListNode("2");
        list1.next.next = new ListNode("5");
        list1.next.next.next = new ListNode("9");

        print(list1);

        boolean isSort = isSortCheck(list1);
        System.out.println(isSort);

        boolean isElementCheck = isElementCheck(list1, 6);
        System.out.println(isElementCheck);

        insertion(list1, "10");
        print(list1);

        deletion(list1, "10");
        print(list1);



    }
}

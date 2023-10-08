// Exercise 1

package Exercises;

import java.io.PrintStream;
import java.util.List;

public class ListNode {
    String info;
    ListNode next;

    public ListNode(String info){
        this.info = info;
    }

    public static int length(ListNode lis){
       int cnt = 0;
       while(lis != null){
           cnt++;
           lis = lis.next;
       }
        return cnt;
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {
        ListNode current = lis;
        while (current != null) {
            if (current.info.equals(given)) {

                ListNode newNode = new ListNode(s); //새로운 s를 노드로 생성
                newNode.next = current.next; // 새로운 노드가 현재 노드 뒤에 생성
                current.next = newNode; // newNode가 리스트에 연결됨
                return lis;
            }
            current = current.next;
        }
        return lis;
    }


    public static ListNode insertBefore(ListNode lis, String s, String given) {

        if (lis == null) return lis;

        ListNode current = lis;
        while (current.next != null) {
            if (current.next.info.equals(given)) {
                ListNode newNode = new ListNode(s);
                if(current.info.equals(given)){
                     current = newNode; // 일치하면 현재 노드를 newNode로 교체
                }
                newNode.next = current.next; // newNode가 현재 노드 뒤에 삽입
                current.next = newNode; // newNode를 리스트에 연결
                return lis;
            }
            current = current.next;
        }
        return lis;
    }


    public static ListNode modify(ListNode lis, String old, String ne){
        ListNode o = new ListNode(old);
        ListNode n = new ListNode(ne);
        if(o.next == null){
            return lis;
        }
        else {
            ListNode tmp = null;
            for (int i = 0; lis != null; i++) {
                tmp = o;
                o = n;
                n = tmp;
            }
            return tmp;
        }
    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        ListNode current = lis;
        while (current != null) {
            if (current.info.equals(old)) {
                current.info = ne;
            }
            current = current.next;
        }
        return lis;
    }

    public static ListNode copy(ListNode lis) {

        ListNode current = lis;
        ListNode firstNode = null; // 새로운 리스트 첫 번째 노드
        ListNode copyCurrent = null; // 복사된 리스트의 현재 노드
        while(current != null){
            ListNode newNode = new ListNode(current.info); // 현재 노드와 동일한 newNode 생성

            if( firstNode == null){ // 새 리스트의 첫 노드가 null이면,
                firstNode = newNode;
                copyCurrent = newNode;
                // 첫 번째 노드와 현재 노드를 newNode로 초기화
            }
            else { // 새 리스트에 노드가 하나 이상 있는 경우
                copyCurrent.next = newNode;
                copyCurrent = newNode;
                // 현재 노드가 이전 노드의 다음 노드로 추가됨
            }
            current = current.next;
        }
        return firstNode;

        }

    public static ListNode invert(ListNode lis) {
        ListNode beforeNode = null; // 현재 노드의 이전 노드를 초기화
        ListNode current = lis; // 주어진 연결리스트 lis에 현재 순회중인 노드를 저장
        ListNode afterNode = null; // 현재 노드의 다음 노드를 초기화

        while(current != null){
            afterNode = current.next; // 현재 노드의 다음 노드를 가리키는 afterNode

            current.next = beforeNode; // 현재 노드의 다음 노드가 역순으로 연결

            beforeNode = current; // beforeNode는 현재 노드의 이전 노드를 가리키게 된다.
            current = afterNode; // 리스트를 순회하면서 노드들을 역순으로 연결
        }

        return beforeNode;
    }

    public static ListNode deleteDoubles(ListNode lis){
        ListNode current = lis;
        while(current != null){
            ListNode check = current;
            while(check.next != null) {
                if (check.next.info.equals(current.info)) { // check의 다음 노드와 현재 노드의 정보를 비교
                    check.next = check.next.next; // 중복 요소 발생하면 check.next의 다음 요소를 check.next에 저장하여 중복을 제거
                } else {
                    check = check.next;
                }
            }
            current = current.next;
        }
    return lis;
}

    public static boolean searchSequence(ListNode lis1, ListNode lis2){
        if(lis1 == null || lis2 == null){
            return false;
        }

        ListNode state1 = lis1; // list1에서 검색할 요소 순서를 state1으로,
        ListNode state2 = lis2; // list2에서 검색할 요소 순서를 state2로 생성 및 초기화

        while(state1 != null){
            if(state1.info.equals(state2.info)){ // state1과 state2의 정보를 비교
                state2 = state2.next; // 같으면 state2의 다음 노드를 저장
                if(state2 == null){
                    return true;
                }
                else {
                    state2 = lis2; // state2 != null이면 다시 검색
                }
                state1 = state1.next; // state1을 다음 노드로 이동해서 계속 순회
            }
        }
        return false;
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

        System.out.print("list : ");
        ListNode list = new ListNode("A");
        list.next = new ListNode("B");
        list.next.next = new ListNode("C");
        list.next.next.next = new ListNode("D");

        print(list);

        System.out.print("List의 길이 : ");
        System.out.println(length(list));

        System.out.print("InsertAfter : ");
        list = insertAfter(list, "B2", "B"); // B 뒤에 B2
        print(list);

        System.out.print("InsertBefore : ");
        list = insertBefore(list, "C2", "C"); // C 앞에 C2
        print(list);

        ListNode list2 = new ListNode("A");
        list2.next = new ListNode("old");
        list2.next.next = new ListNode("ne");

        modify(list2, "old", "new");
        print(list2);

        modifyAll(list2, "old", "new");
        print(list2);

        System.out.print("Copy : ");
        ListNode copiedList = copy(list);
        print(copiedList);

        System.out.print("Invert : ");
        ListNode invertNode = invert(list);
        print(invertNode);

        ListNode list3 = new ListNode("A");
        list3.next = new ListNode("B");
        list3.next.next = new ListNode("C");
        list3.next.next.next = new ListNode("A");

        System.out.print("DeleteDoubles : ");
        ListNode deleteDoubleNode = deleteDoubles(list3);
        print(deleteDoubleNode);

        System.out.print("SearchSequence Check : ");
        searchSequence(list, list2);
        System.out.println(searchSequence(list, list2));


    }
}

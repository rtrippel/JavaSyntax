package collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * однонаправленный список
*/

public class MyLinkedList<T> {
    private Node<T> head;
    private int size;

    public MyLinkedList() {
    }

    public int getSize() {
        return size;
    }
    public void add(T e) {
        if (head == null) {
            head = new Node<T>(e, null, null);
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node<T>(e,null, temp);
        }
        size++;
    }

    public T get(int e) {
        T result = null;
        Node<T> temp = head;
        int count = 0;
        while (temp.next != null) {
            if (count == e) {
                result = temp.item;
            }
            temp = temp.next;
            count++;
        }
        if (result == null && count == e) {
            result = temp.item;
        }
        return result;
    }

    @Override
    public String toString() {
        List<T> result =  new ArrayList<>();
        Node<T> tempElement = head;
        while (tempElement != null) {
            result.add(tempElement.item);
            tempElement = tempElement.next;
        }
        return result.toString();
    }

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        public Node(T item, Node<T> next, Node<T> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    static class MyLinkedListTest {
        public static void main(String[] args) {
            MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
            myLinkedList.add(50);
            myLinkedList.add(70);
            myLinkedList.add(85);
            myLinkedList.add(99);
            myLinkedList.add(120);

            System.out.println(myLinkedList);
            System.out.println(myLinkedList.get(4));
            System.out.println(myLinkedList.size);

        }
    }
}

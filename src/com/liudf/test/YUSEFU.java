package com.liudf.test;

/**
 * 约瑟夫问题
 * 单向循环链表
 */
public class YUSEFU {

    static Integer[] inputArray = {2,5,1,6,9,8,3,4,7};
    static Node head = buildLink(inputArray);
    static int N = inputArray.length;
    static int M = 3;
    static Node preNode = null;

    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
            Node removeNode = search(head);
            Node nextNode = remove(removeNode);
            if (nextNode.next==nextNode){
                System.out.println("最后一个node value is : "+nextNode.value);
                flag = false;
            }
        }
    }
    public static Node buildLink(Integer[] input){
        Node head = null;
        Node tail = null;
        Node tempNode = null;
        int len = input.length;
        for ( int i = len-1;i>=0; i--){
            if (tail == null) {
                tail = new Node(null, input[i]);
                tempNode = tail;
            }else if (i!=0){
                tempNode = new Node(tempNode,input[i]);
            }else {
                head = new Node(tempNode,input[i]);
            }
        }
        tail.next = head;
        return head;
    }

    public static Node search(Node head){
        for (int j = 0;j<M-1;j++){
            if (j==M-2){
                preNode = head;
            }
            if (j!=M-1) {
                head = head.next;
            }
        }
        return head;
    }

    public static Node remove(Node node){
        head = node.next;
        preNode.next = head;
        System.out.println("remove element : "+node.value);
        return head;
    }

    static class Node{
        public Node next;
        public Integer value;
        Node(Node next,Integer value){
            this.next = next;
            this.value = value;
        }
    }
}


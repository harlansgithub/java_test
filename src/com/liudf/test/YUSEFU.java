package com.liudf.test;

/**
 * 约瑟夫问题
 * 单向循环链表
 * 时间复杂度O(n)
 */
public class YUSEFU {

    static Integer[] inputArray = {2,5,1,6,9,8,3,4,7};
    static Node head = buildLink(inputArray);
    static int N = inputArray.length;
    static int M = 3;// 时间复杂度是 M*inputArray.length
    static Node preNode = null;

    public static void main(String[] args) {
        boolean flag = true;
        int count = 0;
        while (flag){
            Node removeNode = search(head);
            Node nextNode = remove(removeNode);
            count++;
            if (nextNode.next==nextNode){
                System.out.println("最后一个node value is : "+nextNode.value);
                flag = false;
                System.out.println("时间复杂度："+count);
            }
        }
    }
    public static Node buildLink(Integer[] input){
        Node head = null;
        Node tail = null;
        Node tempNode = null;
        int len = input.length;
        for ( int i = len-1;i>=0; i--){
            // 确定为节点
            if (tail == null) {
                tail = new Node(null, input[i]);
                tempNode = tail;
            }else if (i!=0){
                tempNode = new Node(tempNode,input[i]);
            }else {// 头结点的时候，设置next
                head = new Node(tempNode,input[i]);
            }
        }
        tail.next = head;
        return head;
    }

    public static Node search(Node head){
        int count = 0;
        for (int j = 0;j<M-1;j++){
            if (j==M-2){
                preNode = head;
            }
            if (j!=M-1) {
                head = head.next;
            }
            count++;
        }
        System.out.println("cyc times is "+count);
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


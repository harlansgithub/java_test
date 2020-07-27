package com.liudf.test;

import com.sun.xml.internal.bind.marshaller.NoEscapeHandler;

/**
 * 约瑟夫问题
 */
public class A04 {
    public static void main(String[] args) {
        Node tail = null;
        Node head = null;
        Node tempPreNode = null;
        for (int i =1 ;i <=6;i++){
            if (i==1){
                head = new Node(null,null,i);
                tempPreNode = head;
            }else {
                tempPreNode = new Node(null,tempPreNode,i);
                tempPreNode.getPre().setNext(tempPreNode);
                if (i==6){
                    tail = new Node(head,tempPreNode,i);
                    head.setPre(tail);
                }
            }
        }
        while (head.getNext()!=head) {
            head = handler(head);
        }
        System.out.println(head.getValue());
    }

    private static Node handler(Node head) {
        for (int j=1;j<=5;j++){

            if (j==5){
                Node pre = head.getPre();
                pre.setNext(head.getNext().getNext());
                head.getNext().getNext().setPre(pre);
                head = pre.getNext();
            }else {
                head = head.getNext();
            }
        }
        return head;
    }
}
class Node {
    private Node next;
    private Node pre;
    private Integer value;
    Node(Node next,Node pre,Integer value){
        this.next = next;
        this.pre = pre;
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }
}

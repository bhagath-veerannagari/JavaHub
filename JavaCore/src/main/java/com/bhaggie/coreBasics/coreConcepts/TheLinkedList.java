package main.java.com.bhaggie.coreBasics.coreConcepts;

public class TheLinkedList {
    int val;
    TheLinkedList next;
    TheLinkedList() {}
    TheLinkedList(int val) {
        this.val = val; }
    TheLinkedList(int val, TheLinkedList next) {
        this.val = val; this.next = next; }
}


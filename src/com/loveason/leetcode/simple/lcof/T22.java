package com.loveason.leetcode.simple.lcof;


/**
 * @author jay
 * @date 2020/9/10 13:22
 */
public class T22 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        listNode.next = new ListNode(5);
        int k = 1;
        ListNode kth = new T22().getKthFromEnd(listNode, k);
        System.out.println(kth);
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        int x = 0;

        // 先求出链表的size
        ListNode node = head;
        while (node != null) {
            x++;
            node = node.next;
        }

        int j = 0;
        while (head != null) {
            // 如果剩下链表的长度等于倒数第k个,则返回当前链表
            if (x - j == k) {
                return head;
            }
            j++;
            head = head.next;
        }

        return null;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

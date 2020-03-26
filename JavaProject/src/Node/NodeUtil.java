package Node;

import Node.Bean.NodeBean;

public class NodeUtil {

    /**
     * 获取倒数第k个元素的节点
     * 方法一
     *
     * @param head
     * @param k
     */
    public static NodeBean getLastKNode(NodeBean head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int count = 1;
        NodeBean p = head;
        while (p.next != null) {
            count++;
            p = p.next;
        }

        int pcount = count - k;
        NodeBean p1 = head;
        for (int i = 0; i < pcount; i++) {
            p1 = p1.next;
        }
        return p1;
    }

    /**
     * 获取倒数第k个元素的节点
     * 方法二
     *
     * @param head
     * @param k
     */
    public static NodeBean getLastKNode2(NodeBean head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }
        NodeBean fNode = head;
        NodeBean gNode = head;
        for (int i = 0; i < k - 1; i++) {
            gNode = gNode.next;
        }
        while (gNode.next != null) {
            fNode = fNode.next;
            gNode = gNode.next;
        }
        return fNode;
    }

    /**
     * 两个链表的公共节点
     */
    public static NodeBean getCommonNodeBean(NodeBean headNode1, NodeBean headNode2) {
        if (headNode1 == null || headNode2 == null) {
            return null;
        }
        if (headNode1.data == headNode2.data) {
            return headNode1;
        }
        int nodeCount1 = 1;
        int nodeCount2 = 1;
        NodeBean ph1 = headNode1;
        NodeBean ph2 = headNode2;
        while (ph1.next != null) {
            nodeCount1++;
            ph1 = ph1.next;
        }
        while (ph2.next != null) {
            nodeCount2++;
            ph2 = ph2.next;
        }
        NodeBean p1 = headNode1;
        NodeBean p2 = headNode2;
        for (int i = 0; i < nodeCount1; i++) {
            for (int j = 0; j < nodeCount2; j++) {
                if (p1.data == p2.data) {
                    return p1;
                }
                p2 = p2.next;
            }
            p1 = p1.next;
            p2 = headNode2;
        }
        return null;
    }


    public static NodeBean getCommonNodeBean2(NodeBean headNode1, NodeBean headNode2) {
        if (headNode1 == null || headNode2 == null) {
            return null;
        }
        int nodeCount1 = 1;
        int nodeCount2 = 1;
        NodeBean p1 = headNode1;
        NodeBean p2 = headNode2;
        while (p1.next != null) {
            nodeCount1++;
            p1 = p1.next;
        }
        while (p2.next != null) {
            nodeCount2++;
            p2 = p2.next;
        }
        int diff = nodeCount1 - nodeCount2;
        NodeBean longNode = headNode1;
        NodeBean shortNode = headNode2;
        if (diff < 0) {
            longNode = headNode2;
            shortNode = headNode1;
        }
        for (int i = 0; i < Math.abs(diff); i++) {
            longNode = longNode.next;
        }
        while (longNode.next != null) {
            if (longNode.data == shortNode.data) {
                return longNode;
            }
            longNode = longNode.next;
            shortNode = shortNode.next;
        }
        return null;
    }


    /**
     * 链表的反转
     */
    public static NodeBean getReserveNodeList(NodeBean head) {
        if (head == null || head.next == null) {
            return head;
        }
        NodeBean pre = head;
        NodeBean cur = head.next;
        while (cur != null) {
            NodeBean temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        head.next = null;
        return pre;
    }

    /**
     * 翻转链转相邻的两个节点
     * 1->2->3>4
     * 2->1->4->3
     * https://blog.csdn.net/qq_40590014/article/details/90545213?depth_1-utm_source=distribute.pc_relevant.none-task&utm_source=distribute.pc_relevant.none-task
     */
    public static NodeBean getAdjacentNode(NodeBean head){
        if (head == null || head.next == null){
            return head;
        }
        return head;

    }

    /**
     * 构建一个链表将头节点返回回来
     */
    public static NodeBean getHeadNode(int count) {
        if (count < 0) {
            return null;
        }
        NodeBean head = new NodeBean(0);
        NodeBean p = head;
        for (int i = 0; i < count; i++) {
            NodeBean nodeBean = new NodeBean(i + 1);
            p.next = nodeBean;
            p = p.next;
        }
        return head;
    }

    /**
     * 删除链表中某个元素
     */
    public static NodeBean deleteNode(NodeBean head, int value) {
        if (head == null) {
            return null;
        }
        if (head.data == value) {
            return head.next;
        }
        NodeBean p = head;
        while (p.next != null) {
            if (p.next.data == value) {
                p.next = p.next.next;
            }
            p = p.next;
        }
        return head;
    }

    /**
     * 删除有序（数值从小到大）链表中的重复的元素
     */
    public static NodeBean deleteRepeatNode(NodeBean head) {
        //只存在一个节点或者节点为空
        if (head == null || head.next == null) {
            return head;
        }
        NodeBean nodeFirst = new NodeBean(0);
        nodeFirst.next = head;
        NodeBean p = nodeFirst;
        NodeBean q = head;
        while (p != null  && q.next != null) {
            if (q.data == q.next.data){
                while (q.data == q.next.data) {
                    q = q.next;
                }
                //删除所有重复元素
//                p.next = q.next;
                //删除重复元素并且保留一个
                p.next = q;
                p.next = q.next;
                p = q;
            }else {
                p = p.next;
            }
            q = q.next;
        }
        return nodeFirst.next;
    }

}

package Node;

import Node.Bean.NodeBean;

import javax.print.event.PrintEvent;

public class NodeTest {

    public static void main(String[] args) {
        deleteRepeatNode();
    }

    /**
     * 删除重复的元素
     */
    private static void deleteRepeatNode(){
        NodeBean nodeBean1 = new NodeBean(1);
        NodeBean nodeBean2 = new NodeBean(4);
        NodeBean nodeBean3 = new NodeBean(4);
        NodeBean nodeBean4 = new NodeBean(9);
        nodeBean1.next = nodeBean2;
        nodeBean2.next = nodeBean3;
        nodeBean3.next = nodeBean4;

        NodeBean nodeBean = NodeUtil.deleteRepeatNode(nodeBean1);
        while (nodeBean != null){
            System.out.println(nodeBean.data);
            nodeBean = nodeBean.next;
        }
    }

    //            if (q.data == q.next.data){
//                while (q != null && q.data == q.next.data) {
//                    q = q.next;
//                }
//                p.next = q.next;
//                p = p.next;
//            }else {
//                p = p.next;
//                q = q.next;
//            }
    /**
     * 删除节点元素
     */
    private static void deleteNode(){
        NodeBean nodeBean1 = new NodeBean(1);
        NodeBean nodeBean2 = new NodeBean(2);
        NodeBean nodeBean3 = new NodeBean(3);
        NodeBean nodeBean4 = new NodeBean(4);
        nodeBean1.next = nodeBean2;
        nodeBean2.next = nodeBean3;
        nodeBean3.next = nodeBean4;
       NodeBean headNode =  NodeUtil.deleteNode(nodeBean1,1);
        while (headNode != null){
            System.out.println(headNode.data);
            headNode = headNode.next;
        }
    }
    private static void getLastKNode(){
        NodeBean nodeBean1 = new NodeBean(1);
        NodeBean nodeBean2 = new NodeBean(2);
        NodeBean nodeBean3 = new NodeBean(3);
        NodeBean nodeBean4 = new NodeBean(4);
        NodeBean nodeBean5 = new NodeBean(5);
        NodeBean nodeBean6 = new NodeBean(6);
        NodeBean nodeBean7 = new NodeBean(7);
        nodeBean1.next = nodeBean2;
        nodeBean2.next = nodeBean3;
        nodeBean3.next = nodeBean4;
        nodeBean4.next = nodeBean5;
        nodeBean5.next = nodeBean6;
        nodeBean6.next = nodeBean7;
//        System.out.println(NodeUtil.getLastKNode(nodeBean1,2).data);
//        System.out.println(NodeUtil.getLastKNode2(nodeBean1,5).data);

    }

    private static void getReserveNode(){
        NodeBean nodeBean8 = new NodeBean(8);
        NodeBean nodeBean9 = new NodeBean(9);
        NodeBean nodeBean10 = new NodeBean(10);
        nodeBean8.next = nodeBean9;
        nodeBean9.next = nodeBean10;
//        NodeBean nodeBean =  NodeUtil.getCommonNodeBean(nodeBean1,nodeBean8);
//        if (nodeBean == null){
//            System.out.println("表示没有公共的节点");
//        }else {
//            System.out.println(nodeBean.data);
//        }
        NodeBean reserveNodeBean = NodeUtil.getReserveNodeList(nodeBean8);
        while (reserveNodeBean != null) {
            System.out.println(reserveNodeBean.data);
            reserveNodeBean = reserveNodeBean.next;
        }
//        System.out.println(reserveNodeBean.data);
    }

}

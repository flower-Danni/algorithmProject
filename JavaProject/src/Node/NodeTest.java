package Node;

import Node.Bean.NodeBean;

public class NodeTest {

    public static void main(String[] args) {
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


        NodeBean nodeBean8 = new NodeBean(8);
        NodeBean nodeBean9 = new NodeBean(9);
        NodeBean nodeBean10 = new NodeBean(10);
        nodeBean8.next = nodeBean9;
        nodeBean9.next = nodeBean10;
        nodeBean10.next = nodeBean3;
        NodeBean nodeBean =  NodeUtil.getCommonNodeBean(nodeBean1,nodeBean8);
        if (nodeBean == null){
            System.out.println("表示没有公共的节点");
        }else {
            System.out.println(nodeBean.data);
        }


    }


}

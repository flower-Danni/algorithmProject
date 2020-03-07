package Stack.bean;

import java.util.Stack;

/**
 * 两个栈实现队列
 */
public class StackQueue<E> {

    private Stack<E> s1 = new Stack();
    private Stack<E> s2 = new Stack();

    //入队
    public void offer(E val){
        s1.push(val);
    }

    //出队
    public E poll(){
        E data;
        //将s1中栈顶的元素，添加到s2的栈里面
        if (s2.empty()){
            while (s1.size() > 1){
                s2.push(s1.pop());
            }
            data = s1.pop();
        }else {
            data = s2.pop();
        }
        System.out.println(data);
        return data;
    }

    public int size(){ //判断队是否为空
        return s1.size() + s2.size();
    }





}

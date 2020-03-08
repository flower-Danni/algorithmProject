package Stack;

import Stack.bean.QueueStack;
import Stack.bean.StackQueue;

import java.util.Random;

public class StackUtil {

    /**
     * 两个栈实现队列
     * 栈先进后出
     * 队列先进先出
     */
    public static void getQueueFromStack(){
        StackQueue<Integer> stackQueue = new StackQueue<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int data = rand.nextInt(100);
            System.out.println(data+"");
            stackQueue.offer(data);
        }
        System.out.println("出队");
        while (stackQueue.size() > 0 ){
            stackQueue.poll();
        }
    }

    /**
     * 两个队列实现栈
     */
    public static void getStackFromQueue(){
        QueueStack<Integer> queueStack = new QueueStack<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int data = rand.nextInt(100);
            System.out.println(data+"");
            queueStack.add(data);
        }
        System.out.println("出栈======");

        while (queueStack.size() > 0){
            System.out.println(queueStack.poll());
        }
    }
}

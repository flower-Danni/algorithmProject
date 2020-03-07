package Stack.bean;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 两个队列实现栈
 */
public class QueueStack<E> {

    LinkedList<E> queue1 = new LinkedList<>();
    LinkedList<E> queue2 = new LinkedList<>();

    /**
     * 入队
     * @param value
     */
    public void add(E value) {
        queue1.add(value);
    }

    /**
     * 出队
     */
    public E poll() {
        E data;
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        data = queue1.poll();
        while (queue2.size() > 0) {
            queue1.add(queue2.poll());
        }
        return data;
    }

    public int size() {
        return queue1.size();
    }
}

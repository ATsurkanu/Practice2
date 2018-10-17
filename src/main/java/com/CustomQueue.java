package com;

/*
 * Задание 3.
 * С помощью двух стэков сделать реализацию очереди.*
 * */

import java.util.Stack;

/**
 * The <code>CustomQueue</code> class provides methods <tt>addElementToQueue</tt>
 * that push an element into queue
 * and <tt>popElementFromQueue<tt/>
 * that takes and removes the element from the queue.
 *
 * @author Anton Tsurkanu
 * @param <E> the type of elements held in this queue
 * */
public class CustomQueue<E> {
    private Stack<E> inbox = new Stack<>();
    private Stack<E> outbox = new Stack<>();

    /**
     * Push an element onto this queue.
     *
     * @param item the item to be pushed onto this queue.
     * */
    public void addElementToQueue(E item) {
        inbox.push(item);
    }

    /**
     * Removes the first one object of this queue and returns that
     * object as the value of this method.
     *
     * @return the first one object of this queue.
     * */
    public E popElementFromQueue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.cprg304a2s1;

/**
 *
 * @author anna
 */
public interface QueueADT<T> {
     /**
     * Adds an element to the end of the queue.
     * 
     * @param element the element to be added to the queue
     * @throws IllegalArgumentException if the element is null (optional)
     */
    void enqueue(T element);

    /**
     * Removes the element at the front of the queue and returns it.
     * 
     * @return the element removed from the front of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    T dequeue();

    /**
     * Returns the element at the front of the queue without removing it.
     * 
     * @return the element at the front of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    T peek();

    /**
     * Checks if the queue is empty.
     * 
     * @return true if the queue is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the queue.
     * 
     * @return the size of the queue
     */
    int size();
}

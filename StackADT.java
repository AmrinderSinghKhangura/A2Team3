/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.cprg304a2s1;

/**
 *
 * @author anna
 */
public interface StackADT<T> {
    /**
     * Adds an element to the top of the stack.
     * 
     * @param element the element to be added to the stack
     */
    void push(T element);

    /**
     * Removes the element at the top of the stack and returns it.
     * 
     * @return the element removed from the top of the stack
     * @throws NoSuchElementException if the stack is empty
     */
    T pop();

    /**
     * Returns the element at the top of the stack without removing it.
     * 
     * @return the element at the top of the stack
     * @throws NoSuchElementException if the stack is empty
     */
    T peek();

    /**
     * Checks if the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the stack.
     * 
     * @return the size of the stack
     */
    int size();
}

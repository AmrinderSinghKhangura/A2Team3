package Interfaces;

import exceptions.GenericException;

public interface StackADT<T> {

  /**
   * Adds one element to the top of this stack.
   * precondition: the stack is not full
   * postcondition: the element is added to the top of the stack
   *
   * @param element element to be pushed onto stack
   * @throws GenericException if the stack is full, message will be "Stack is full"
   */
  public void push(T element) throws GenericException;

  /**
   * Removes and returns the top element from this stack.
   * precondition: the stack is not empty
   * postcondition: the element is removed from the top of the stack
   *
   * @throws GenericException if the stack is empty, message will be "Stack is empty"
   */
  public void pop() throws GenericException;

  /**
   * Returns, without removing, the top element of this stack.
   * precondition: the stack is not empty
   * postcondition: none
   *
   * @throws GenericException if the stack is empty, message will be "Stack is empty"
   */
  public void peek() throws GenericException;

  /**
   * Returns true if this stack contains no elements.
   * precondition: none
   * postcondition: none
   *
   * @return boolean whether this stack is empty
   */
  public boolean isEmpty();

  /**
   * Returns the number of elements in this stack.
   * precondition: none
   * postcondition: none
   *
   * @return int number of elements in this stack
   */
  public int size();


}

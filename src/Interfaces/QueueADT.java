package Interfaces;

import exceptions.GenericException;

public interface QueueADT<T> {

  /**
   * Adds one element to the rear of this queue.
   * precondition: the queue is not full
   * postcondition: the element is added to the rear of the queue
   *
   * @param element element to be added to the rear of the queue
   * @throws GenericException if the queue is full, message will be "Queue is full"
   */
  public void enqueue(T element) throws GenericException;

  /**
   * Removes the front element of this queue.
   * precedition: the queue is not empty
   * postcondition: the element is removed from the front of the queue
   *
   * @throws GenericException if the queue is empty, message will be "Queue is empty"
   */
  public void dequeue() throws GenericException;

  /**
   * Returns the first/front element of the queue
   * precondition: the queue is not empty
   * postcondition: none
   *
   * @throws GenericException if the queue is empty, message will be "Queue is empty"
   */
  public void first() throws GenericException;

  /**
   * Returns true if this queue contains no elements.
   * precondition: none
   * postcondition: none
   *
   * @return boolean whether this queue is empty
   */
  public boolean isEmpty();

  /**
   * Returns the number of elements in this queue.
   * precondition: none
   * postcondition: none
   *
   * @return int number of elements in this queue
   */
  public int size();

}

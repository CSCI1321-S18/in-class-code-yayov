package adt

class LLStack[A] extends MyStack[A] {
  import LLStack._
  private var top: Node[A] = null
  
  def push(a: A): Unit = top = Node(a, top)
  
  def pop(): A = {
    val ret = top.data
    top = top.next
    ret
  }
  
  def peek: A = top.data
  
  def isEmpty: Boolean = top == null
}

object LLStack {
  private case class Node[A](data: A, next: Node[A])
}
  //if something is doing mutation, add parentheses to it! 


//this is a stack w a singly linked list
//use doubly linked list if it is advantageous ie moving forward and backward to remove and add things from specific places

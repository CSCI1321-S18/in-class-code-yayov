package adt

trait MyStack[A] {
  def push(a:A):Unit
  def pop():A //if something is doing mutation, add parentheses to it! 
  def peek:A
  def isEmpty:Boolean

}
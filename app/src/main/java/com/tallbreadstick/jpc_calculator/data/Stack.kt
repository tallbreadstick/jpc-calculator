package com.tallbreadstick.jpc_calculator.data

class Stack<T>(
    private var top: Node<T>?,
    private var size: Int
) {

    constructor() : this(null, 0)

    fun isEmpty(): Boolean {
        return size == 0
    }

    fun push(data: T) {
        val node = Node<T>(data)
        node.next = top
        top = node
        size++
    }

    fun pop(): T? {
        val temp = top
        if (!isEmpty()) {
            top = temp?.next
            size--
        }
        return temp?.data
    }

    fun peek(): T? {
        return top?.data
    }

}
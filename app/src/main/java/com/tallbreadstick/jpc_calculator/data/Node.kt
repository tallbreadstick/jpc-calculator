package com.tallbreadstick.jpc_calculator.data

class Node<T>(
    val data: T,
    var next: Node<T>?
) {

    constructor(data: T) : this(data, null)

}
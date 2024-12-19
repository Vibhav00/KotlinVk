package com.vk.kotlinvk.ktln.basics


/**
 *  primitive data types
 *  All the primitives are basically a Class ..
 *  1. numbers -> Byte , Short , Int ,Long  / Float , Double /
 * **/
fun main(args: Array<String>) {

    // pass arguments and you can catch it here .
    args.forEach {
        print(it)
    }

    // primitives
    val k: Byte = 34
    val f: UInt = 45u

    // crazy
    val c: Int
    //    println(c) can't use it before initializing like lateinit //
    c = 45

    val typeInference = 5 // type inference to integer .
    print(k)

    println(sum(3, 4))
}


// normal function
fun sum(a: Int, b: Int): Int {
    return a + b;
}

package com.vk.kotlinvk.ktln.collectionsv

fun main() {
    val a = true
    if(a){
        println("$a is true ") // template string
    }else{
        print ("a is false ")
    }

    // if else if

    val k = "vibhav"
    if(k == "vibhav"){

    }else if (k == "lskdjd"){

    }else{

    }

    // when
    when(k){
        "vibhav" ->{

        }
        else ->{

        }
    }

    // (1..4) range in between 1 to 4 inclusive .....
    (1..4).forEachIndexed { index, i ->
        println("$index   $i")
    }

    (1..4).forEach {  }

    // we can add step for increments
    for( i in (3..40 ) step 2 ){
        print(i)
    }

    val items = listOf("orange", "apple")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}


package com.vk.kotlinvk.ktln.flow

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.runningFold
import kotlinx.coroutines.flow.runningReduce


suspend fun main() {
    // my custom flow
    delayFlowOf(1000,3,4,5,6).map{
        it.toString()
    }.filter {
        it.equals("5")
    }.
    collect{
          println(it)
    }


    // this is  running reduce
    delayFlowOf(1000,3,4,5,6,7,8).runningReduce{
        a,d ->
        a+d
    }.onCompletion {
        print("completed ")
    }.collect {
        println(it)

    }

    // this is running fold reduce means it will take T type and return the list/map anything  of R type ..
    delayFlowOf(1000, 3, 4, 5, 6, 7, 8).runningFold(hashMapOf<Int,Int>().toMutableMap()) { a, d ->
        a [d] = 34
        a

    }.collect {
        println(it)
    }
}

/**
 *  onCompletion is not transformer it is in emittes.kt and what it do is what happens when the flow ends
 *
 * **/

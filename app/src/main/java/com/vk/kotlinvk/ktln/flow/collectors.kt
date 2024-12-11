package com.vk.kotlinvk.ktln.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectIndexed
import kotlinx.coroutines.flow.collectLatest

suspend fun main(){

     /**
      *  it will collect all the values emitted
      *
      * **/
    delayFlowOf(1,3,4,5,6,7,7).collect{value ->
        println("Collecting $value")
        delay(1000) // Emulate work
        println("$value collected")
    }

     /**
      *  it will collect only the latest value emitted , if new value is emitted then the previous block of code will be cancelled .
      *
      * **/
    delayFlowOf(200,3,4,5,6,7,7).collectLatest{ value ->
        println("Collecting $value")
        delay(1000) // Emulate work
        println("$value collected")
    }

    // index with flow .
    delayFlowOf(200,3,4,5,6,7,8).collectIndexed { index, value ->
        println("index = $index value = $value")
    }

}
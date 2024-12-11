package com.vk.kotlinvk.ktln.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.flow
import kotlin.experimental.ExperimentalTypeInference


 /**
  *  this is delay flow it will emit for infinite time the function pass in the block
  * 
  * **/
@OptIn(ExperimentalTypeInference::class)
fun <T> delayFlow(delay:Long,@BuilderInference block: suspend FlowCollector<T>.() -> Unit): Flow<T> = flow{
    while (true){
        delay(delay)
        block()
    }

}

 /**
  *  this is like flow of but we can pass the delay so that it can emit on the basis of that delay  
  * 
  * **/

fun <T> delayFlowOf(delay: Long,vararg elements:T) :Flow<T> = flow {
    for (element in elements) {
        delay(delay)
        emit(element)
    }
}


suspend fun main(){

    // delay flow
    delayFlow(200){
        emit("this is emit after 200 sec ")
    }.collect{
        println(it)
    }


    // delayFlowOf
    delayFlowOf(1000,1,23,4,4).collect{
        println(it)
    }
}
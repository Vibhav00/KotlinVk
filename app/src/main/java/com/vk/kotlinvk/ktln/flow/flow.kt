package com.vk.kotlinvk.ktln.flow

import android.util.Log
import com.vk.kotlinvk.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

/**
 *  here i will implement all possible builder + collector + terminals
 *
 * **/
suspend fun main() {

    // simple method to launch
    flow {
        emit(1)
        emit(2)
        emit(3)
    }.collect {
        println(it)
    }


    // flow of
    flowOf(1,2,3).collect{
        print(it)
    }

    // return an empty flow
    emptyFlow<Int>()


    // as flow
    arrayOf(3,5.30).asFlow().collect{
        println(it)
    }

    // range flow
    (1..3).asFlow().collect{
        print(it)
    }






    // todo iterator flow  , lambda flow
    // todo channel flow
    // todo callback flow

}

package com.vk.kotlinvk.ktln.flow

import kotlinx.coroutines.flow.flowOf


suspend fun main(){
    // my custom flow
    delayFlowOf(1000,3,4,5,6).collect{

    }
}
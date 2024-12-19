package com.vk.kotlinvk.ktln.collectionsv


 /**
  *
  *  IntRange	Range of integers	1..5
  * LongRange	Range of long integers	1L..5L
  * CharRange	Range of characters	'a'..'e'
  * IntProgression	Integers with a step	1..10 step 2
  * LongProgression	Longs with a step	1L..10L step 2
  * CharProgression	Characters with a step	'a'..'z' step 2
  * ClosedRange	Open-ended range (used with until)	1 until 5
  * Custom Ranges	User-defined ranges for custom types	DateRange
  *
  * **/
fun main(){
    // operator overloading ..
    (1..3).forEach {
        println(it)
    }
    val p:IntRange  = (1..3)
    val c:CharRange = 'a'..'e'
}
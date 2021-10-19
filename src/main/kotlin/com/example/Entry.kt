package com.example

import java.io.IOException

fun main(){

//    Test().use { //1
//        it.doThrow() //2
//    }

    Test().use { //3
        Test().use { //4
            it.doThrow() //5
        }
    }
}

class Test: AutoCloseable { //1

    fun doThrow(): Nothing = throw RuntimeException("${hashCode()} throwing from doThrow()") //2

    override fun close() = throw IOException("${hashCode()} throwing from close()") //3

}
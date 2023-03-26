package com.example.kotlincoroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    //Dispatchers
    //Dispatchers.Default -> CPU Intensive
    //Dispatchers.IO -> Input / Output, Networking
    //Dispatchers.Main -> UI
    //Dispatchers.Unconfined -> Inherited Dispatcher

/*    runBlocking {

        launch(Dispatchers.Main) {
            println("Main Thread: ${Thread.currentThread().name}")
        }
        launch(Dispatchers.IO) {
            println("IO Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("IO Default: ${Thread.currentThread().name}")
        }
        launch(Dispatchers.Unconfined) {
            println("IO Unconfined: ${Thread.currentThread().name}")
        }


    }*/


}
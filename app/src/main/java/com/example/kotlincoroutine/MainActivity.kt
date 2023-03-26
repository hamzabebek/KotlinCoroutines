package com.example.kotlincoroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightness
/*
        GlobalScope.launch {
            repeat(100000){
                launch {
                    println("android")
                }
            }
        }*/

        //Scope
        //Global Scope , runBlocking, CoroutineScope
        //runBlocking
        /*
        println("run blocking start")
        runBlocking {
            launch {
                delay(2000)
                println("run blocking")
            }
        }
        println("run blocking end")*/

        //GlobalScope
        /* println("global scope start")
        GlobalScope.launch {
            delay(5000)
            println("global scope")
        }
        println("global scope end")*/

        //Context
        //CoroutineScope
       /* println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("coroutine scope")
        }
        println("coroutine scope end")*/

        /*runBlocking {

            launch {
                delay(5000)
                println("run blocking")
            }
            coroutineScope {
                launch {
                    delay(3000)
                    println("coroutines scope")
                }
            }
        }*/



    }
}
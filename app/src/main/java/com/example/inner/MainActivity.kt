package com.example.inner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // result: 3
        val a1: IntArray = intArrayOf(1,2,3,4)
        val b1: IntArray = intArrayOf(-3,-1,0,2)

        // result: -2
        val a2: IntArray = intArrayOf(-1,0,1)
        val b2: IntArray = intArrayOf(1,0,-1)

        solution(a1, b1)
    }

//    private fun solution(a: IntArray, b: IntArray) {
//        var sum: Int = 0
//        for (i in a.indices) {
//            Log.e(TAG,"\na[i]:${a[i]}\nb[i]:${b[i]}")
//            sum += a[i]*b[i]
//            Log.e(TAG,"sum:$sum")
//        }
//        Log.e(TAG,"Sum:$sum")
//
//
//    }

    private fun solution(a: IntArray, b:IntArray): Int {
        return a.zip(b).map { pair ->
        Log.d(TAG,"first:${pair.first}")
        Log.d(TAG,"second:${pair.second}")
            pair.first * pair.second
        }.sum()
    }


    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}
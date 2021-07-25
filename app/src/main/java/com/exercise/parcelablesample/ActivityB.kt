package com.exercise.parcelablesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

//        val person = intent.extras!!.getParcelable("OBJECT") as? Person
//        person!!.name?.let {
//            Log.e(ActivityB::class.java.simpleName, it)
//        }
//        person.email?.let {
//            Log.e(ActivityB::class.java.simpleName, it)
//        }
//        person.age.let {
//            Log.e(ActivityB::class.java.simpleName, "$it")
//        }
//        person.phone.let {
//            Log.e(ActivityB::class.java.simpleName, "$it")
//        }

        val list = intent.extras!!.getParcelableArrayList<Person>("OBJECT")
        Log.e(ActivityB::class.java.simpleName, "$list")
    }
}
package com.exercise.parcelablesample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val list = ArrayList<Person>()
            val person = Person("name", 32, "email@email.com", 1234)
            val person2 = Person("name", 32, "email@email.com", 1234)
            list.add(person)
            list.add(person2)

            val intent = Intent(this, ActivityB::class.java)
            val bundle = Bundle()
//            bundle.putParcelable("OBJECT", list)
            bundle.putParcelableArrayList("OBJECT", list)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
package com.binfan.diexamples

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.binfan.diexamples.annotationpoc.Cat
import com.binfan.diexamples.annotationpoc.Dog
import com.binfan.diexamples.annotationpoc.VeryImportant

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity)

        val cat = Cat()
        val dog = Dog()

        findViewById<Button>(R.id.my_button).setOnClickListener {
            if (cat.javaClass.isAnnotationPresent(VeryImportant::class.java)) {
                Log.e("mytest", "Cat is annoted")
            } else {
                Log.e("mytest", "Not annoated")
            }
            if (dog.javaClass.isAnnotationPresent(VeryImportant::class.java)) {
                Log.e("mytest", "dog is annoted")
            } else {
                Log.e("mytest", "dog is Not annoated")
            }
        }
    }
}

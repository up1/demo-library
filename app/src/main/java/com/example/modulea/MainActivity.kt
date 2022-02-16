package com.example.modulea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hello_module.Hello

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var hello =  Hello()
        print(hello.sayHi("demo name"))
    }
}
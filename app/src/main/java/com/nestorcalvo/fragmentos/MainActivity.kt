package com.nestorcalvo.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        val supermanFragment = SupermanFragment()
        transaction.add(R.id.content, supermanFragment).commit()
    }
}

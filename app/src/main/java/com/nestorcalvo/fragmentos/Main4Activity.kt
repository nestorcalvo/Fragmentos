package com.nestorcalvo.fragmentos

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class Main4Activity : AppCompatActivity() {

    private lateinit var textMessage: TextView
    private val manager = supportFragmentManager
    private val transaction = manager.beginTransaction()
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_superman -> {
                val supermanFragment = SupermanFragment()
                transaction.replace(R.id.content, supermanFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_batman -> {
                val batmanFragment = BatmanFragment()
                transaction.replace(R.id.content, batmanFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_flash -> {
                val flashFragment = FlashFragment()
                transaction.replace(R.id.content, flashFragment).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        val supermanFragment = SupermanFragment()
        transaction.add(R.id.content, supermanFragment).commit()

        textMessage = findViewById(R.id.message)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}

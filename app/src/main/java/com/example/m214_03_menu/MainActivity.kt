package com.example.m214_03_menu

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item1 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, First())
                    .commit()
                true
            }

            R.id.item2 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, Second())
                    .commit()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}
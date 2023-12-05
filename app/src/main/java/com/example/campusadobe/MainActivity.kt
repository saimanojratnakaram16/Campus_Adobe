package com.example.campusadobe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var mainAct: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(findViewById(R.id.toolbar))

        mainAct = findViewById(R.id.mainAct)
        val navView = findViewById<NavigationView>(R.id.navView)
        val toggle = ActionBarDrawerToggle(this, mainAct, toolbar, R.string.nav_open, R.string.nav_close)
        mainAct.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.nav_item_1 -> {
                val intent = Intent(this, Profile::class.java)
                startActivity(intent)
            }
            R.id.nav_item_2 -> {
                val intent = Intent(this, Profile::class.java)
                startActivity(intent)
            }
            R.id.nav_item_3 -> {
                val intent = Intent(this, Profile::class.java)
                startActivity(intent)
            }
        }
        mainAct.closeDrawer(GravityCompat.START)
        return true
    }

    // when back button is pressed, need to close drawer
    override fun onBackPressed() {
        if(mainAct.isDrawerOpen(GravityCompat.START)){
            mainAct.closeDrawer(GravityCompat.START)
        }
        else
            super.onBackPressed()
    }
}
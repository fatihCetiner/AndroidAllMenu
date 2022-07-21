package com.fatihcetiner.bottomnav

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.fatihcetiner.bottomnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        binding.fabBtn.setOnClickListener {
            Toast.makeText(this,"Fab Button Clicked",Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.fav_ic -> Toast.makeText(this,"Favorite Button Clicked",Toast.LENGTH_LONG).show()
            R.id.search_ic -> Toast.makeText(this,"Search Button Clicked",Toast.LENGTH_LONG).show()
            R.id.item1 -> Toast.makeText(this,"Item 1 Button Clicked",Toast.LENGTH_LONG).show()
            R.id.item2 -> Toast.makeText(this,"Item 2 Button Clicked",Toast.LENGTH_LONG).show()
            R.id.item3 -> Toast.makeText(this,"Item 3 Button Clicked",Toast.LENGTH_LONG).show()

            R.id.item5 -> Toast.makeText(this,"Detail Menu 1 Clicked",Toast.LENGTH_LONG).show()
            R.id.item6 -> Toast.makeText(this,"Detail Menu 2 Clicked",Toast.LENGTH_LONG).show()

        }
        return super.onOptionsItemSelected(item)
    }
}
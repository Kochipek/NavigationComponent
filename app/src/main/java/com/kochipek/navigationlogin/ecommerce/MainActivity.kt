package com.kochipek.navigationlogin.ecommerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupActionBarWithNavController
import com.kochipek.navigationlogin.R

class MainActivity : AppCompatActivity() {
    // define navController as lateinit var to be initialized later
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // burada fragmentContainerView'ı bulup navController ile bağlıyoruz
        val navHostFragment = supportFragmentManager.findFragmentById(
            R.id.fragmentContainerView
            // burada fragmentContainerView'ı cast ediyoruz NavHostFragment'e çünkü findNavController() methodu NavHostFragment'da var
        ) as NavHostFragment

        navController = navHostFragment.findNavController()
        // toolbar id sine sahip toolbar'ı bulup navController ile bağlıyoruz
        setSupportActionBar(findViewById(R.id.toolbar))
        setupActionBarWithNavController(navController)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // if the ids match, navigate to the destination
        return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
    }
    // burada toolbar'daki geri tuşuna basıldığında geri gitmesi için override ediyoruz onSupportNavigateUp() methodunu
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}
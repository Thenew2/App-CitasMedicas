package com.example.app1.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.app1.R
import com.example.app1.util.PreferenceHelper
import com.example.app1.util.PreferenceHelper.get
import com.example.app1.util.PreferenceHelper.set

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preferences = PreferenceHelper.defaultPrefs(this)
        if(preferences["session", false])
            GoToMenu()

        val tvgotoRegister = findViewById<TextView>(R.id.tv_go_to_register)
            tvgotoRegister.setOnClickListener{
            goToRegister()
            }
        val btnGoMenu = findViewById<Button>(R.id.btn_go_to_menu)
            btnGoMenu.setOnClickListener {
            GoToMenu()
            }


        }

    private fun goToRegister(){
        val i = Intent(this, RegisterActivity::class.java)
        startActivity(i)

    }
    private fun GoToMenu(){
        val i = Intent(this, MenuActivity2::class.java)
        createSessionPreference()
        startActivity(i)
        finish()
    }
    private fun createSessionPreference(){
        val preferences = PreferenceHelper.defaultPrefs(this)
        preferences["session"] = true
    }
}
package com.example.app1.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.app1.R
import com.example.app1.util.PreferenceHelper
import com.example.app1.util.PreferenceHelper.set

class MenuActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)

        val btnLogout = findViewById<Button>(R.id.btn_lougout)
        btnLogout.setOnClickListener {
            clearsessionPrefference()
            gotologuin()


        }
    }
    private fun gotologuin(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
        finish()
    }
    private fun clearsessionPrefference(){
        val preferences = PreferenceHelper.defaultPrefs(this)
        preferences["session"] = false

    }

}
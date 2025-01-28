package com.example.minhasoracoes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EscolhaTercoActivity : AppCompatActivity() {

    lateinit var btnDoloroso: Button
    lateinit var btnGozoso: Button
    lateinit var btnLuminoso: Button
    lateinit var btnGlorioso: Button
    lateinit var btnMenu: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_escolha_terco)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnDoloroso = findViewById(R.id.btn_Doloroso)
        btnDoloroso.setOnClickListener {

            val intent = Intent(this, TercoActivity::class.java)
            intent.putExtra("terco", R.string.doloroso)
            startActivity( intent )
        }

        btnGozoso = findViewById(R.id.btn_Gozoso)
        btnGozoso.setOnClickListener {

            val intent = Intent(this, TercoActivity::class.java)
            intent.putExtra("terco", R.string.gozoso)
            startActivity( intent )
        }

        btnLuminoso = findViewById(R.id.btn_Luminoso)
        btnLuminoso.setOnClickListener {

            val intent = Intent(this, TercoActivity::class.java)
            intent.putExtra("terco", R.string.luminoso)
            startActivity( intent )
        }

        btnGlorioso = findViewById(R.id.btn_Glorioso)
        btnGlorioso.setOnClickListener {

            val intent = Intent(this, TercoActivity::class.java)
            intent.putExtra("terco", R.string.glorioso)
            startActivity( intent )
        }

        btnMenu = findViewById(R.id.btn_MenuInicial)
        btnMenu.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity( intent )
        }
    }
}
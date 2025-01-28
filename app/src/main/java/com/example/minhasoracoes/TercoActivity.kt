package com.example.minhasoracoes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.os.Vibrator
import android.widget.ScrollView

class TercoActivity : AppCompatActivity() {

    lateinit var btn_proximo: Button
    lateinit var btn_anterior: Button

    lateinit var lbl_numeroOracao: TextView
    lateinit var lbl_nomeOracao: TextView
    lateinit var lbl_textoOracao: TextView
    lateinit var scv_texto: ScrollView

    var tercoAtual: List<Oracao> = TercoDoloroso

    var oracaoIndex: Int = 0
    var misterioAtual: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_terco)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val vibrator = getSystemService(VIBRATOR_SERVICE) as Vibrator

        lbl_numeroOracao = findViewById(R.id.lbl_numeroOracao)
        lbl_nomeOracao = findViewById(R.id.lbl_nomeOracao)
        lbl_nomeOracao.visibility = TextView.INVISIBLE

        lbl_textoOracao = findViewById(R.id.lbl_textoOracao)
        scv_texto = findViewById(R.id.scv_texto)

        val bundle = intent.extras

        if (bundle != null) {
            val terco = bundle.getInt("terco")

            if (terco == R.string.doloroso) {
                window.setBackgroundDrawable(getDrawable(R.drawable.doloroso_background))
                tercoAtual = TercoDoloroso
            } else if (terco == R.string.gozoso) {
                window.setBackgroundDrawable(getDrawable(R.drawable.gozoso_background))
                tercoAtual = TercoGozoso
            } else if (terco == R.string.glorioso) {
                window.setBackgroundDrawable(getDrawable(R.drawable.glorioso_background))
                tercoAtual = TercoGlorioso
            } else if (terco == R.string.luminoso) {
                window.setBackgroundDrawable(getDrawable(R.drawable.luminoso_background))
                tercoAtual = TercoLuminoso
            }
            proximaOracao(oracaoIndex)
        }

        btn_proximo = findViewById(R.id.btn_proximo)
        btn_proximo.setOnClickListener {
            if (vibrator.hasVibrator()) { vibrator.vibrate(100) }// 100 milissegundos de vibração }
            if (oracaoIndex < tercoAtual.count()) {
                oracaoIndex++
                proximaOracao(oracaoIndex)
            } else {
                val intent = Intent(this, MainActivity::class.java)
                startActivity( intent )
            }
        }

        btn_anterior = findViewById(R.id.btn_anterior)
        btn_anterior.setOnClickListener {
            if (vibrator.hasVibrator()) { vibrator.vibrate(100) }// 100 milissegundos de vibração }
            if (oracaoIndex > 0) {
                oracaoIndex --
                proximaOracao(oracaoIndex, false)
            } else {
                val intent = Intent(this, MainActivity::class.java)
                startActivity( intent )
            }
        }


    }

    fun proximaOracao(index: Int, crescente: Boolean = true) {

        if (tercoAtual[index].numero != 0) {
            lbl_numeroOracao.text = "${tercoAtual[index].numero}ª - ${ tercoAtual[index].titulo }"
        } else {
            lbl_numeroOracao.text = tercoAtual[index].titulo
        }

        if (tercoAtual[index].numeroMisterio > 0) {
            if (tercoAtual[index].eMisterio) {
                misterioAtual = "Mistério Doloroso"
                lbl_nomeOracao.text = tercoAtual[index].titulo
            }
            lbl_nomeOracao.visibility = TextView.VISIBLE
        } else {
                lbl_nomeOracao.visibility = TextView.INVISIBLE
            }

        scv_texto.smoothScrollTo(0, 0)
        lbl_textoOracao.text = tercoAtual[index].conteudo
    }
}
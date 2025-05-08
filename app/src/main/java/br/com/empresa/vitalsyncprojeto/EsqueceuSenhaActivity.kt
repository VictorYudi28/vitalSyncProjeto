package br.com.empresa.vitalsyncprojeto

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import kotlin.jvm.java

class EsqueceuSenhaActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_esqueceusenha)

        val btnCancelar = findViewById<TextView>(R.id.btn_cancelar)

        btnCancelar.setOnClickListener {
            val i = Intent(this, LoginActivity::class.java);
            startActivity(i);
        }

    }
}

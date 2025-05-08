package br.com.empresa.vitalsyncprojeto

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import kotlin.jvm.java

class LoginActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       setContentView(R.layout.activity_login)

        val btnEsqueceuSenha = findViewById<TextView>(R.id.btn_esqueceu_senha);
        val btnCriarConta = findViewById<TextView>(R.id.btn_criar_conta);

        val btnLogin = findViewById<Button>(R.id.btn_login);

        btnEsqueceuSenha.setOnClickListener {
            val i = Intent(this, EsqueceuSenhaActivity::class.java);
            startActivity(i);
        }

        btnCriarConta.setOnClickListener {
            val i = Intent(this, CadastroActivity::class.java);
            startActivity(i);
        }

        btnLogin.setOnClickListener {
            val i = Intent(this, MainActivity::class.java);
            startActivity(i);
        }

    }
}

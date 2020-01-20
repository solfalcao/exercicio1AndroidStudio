package com.example.exercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   private EditText inputNome;
   private EditText inputEmail;
   private Button botaoEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    inputNome = findViewById(R.id.nome_id);
    inputEmail = findViewById(R.id.email_id);

    botaoEnviar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String nome = inputNome.getText().toString();
            String email = inputEmail.getText().toString();

            validarCampos(nome, email);
        }
    });

    private void validarCampos(String nome, String email){
        if (nome.isEmpty()  && email.isEmpty()){
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_LONG ).show();
        }else{
            Toast.makeText(this, "Dados estão ok!", Toast.LENGTH_LONG ).show();
        }
    }

}


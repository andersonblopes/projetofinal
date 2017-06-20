package com.example.ander.projetofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ander.projetofinal.util.DBHelper;

public class CadastroActivity extends AppCompatActivity {

    private DBHelper dbHelper;

    private EditText etNome, etCPF, etIdade, etTelefone, etEmail;
    private Button btnListar, btnCadastrarPessoa, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        popularObjetos();

        btnCadastrarPessoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }


    public void limparCampos() {
        etNome.setText("");
        etCPF.setText("");
        etIdade.setText("");
        etTelefone.setText("");
        etEmail.setText("");
    }

    public void popularObjetos() {
        this.dbHelper = new DBHelper(this);

        etNome = (EditText) findViewById(R.id.etNome);
        etCPF = (EditText) findViewById(R.id.etCPF);
        etIdade = (EditText) findViewById(R.id.etIdade);
        etTelefone = (EditText) findViewById(R.id.etTelefone);
        etEmail = (EditText) findViewById(R.id.etEmail);

        btnListar = (Button) findViewById(R.id.btnListar);
        btnCadastrarPessoa = (Button) findViewById(R.id.btnCadastrarPessoa);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);
    }
}

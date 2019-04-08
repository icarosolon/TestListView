package com.sti.testlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalhesAluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_aluno);

        Intent intencaoRecebida = getIntent();

        Aluno alunoEscolhido = (Aluno) intencaoRecebida.getSerializableExtra("aluno");


        TextView nome = findViewById(R.id.nome);
        TextView curso = findViewById(R.id.curso);
        TextView telefone = findViewById(R.id.telefone);
        TextView endereco = findViewById(R.id.endereco);
        TextView matricula = findViewById(R.id.matricula);

        nome.setText(alunoEscolhido.getNome());
        curso.setText(alunoEscolhido.getCurso());
        telefone.setText(alunoEscolhido.getTelefone());
        endereco.setText(alunoEscolhido.getEndereco());
        matricula.setText(alunoEscolhido.getMatricula());




    }
}

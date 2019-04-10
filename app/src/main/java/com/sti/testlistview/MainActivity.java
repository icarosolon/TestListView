package com.sti.testlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //    criando variável lista de alunos
    private List<Aluno> alunos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        instanciando lista de alunos e preenchendo
        alunos = new ArrayList<>();
        alunos.add(new Aluno("Valtency", "ADM", "6500", "Rua B bairro M", "87955846548", "5 periodo"));
        alunos.add(new Aluno("Dante", "Computação", "6500", "Rua G bairro M", "87955846548", "5 periodo"));
        alunos.add(new Aluno("Livia", "GTI", "6500", "Rua A bairro M", "87955846548", "5 periodo"));
        alunos.add(new Aluno("SElton", "Enfermagem", "6500", "Rua H bairro M", "87955846548", "5 periodo"));
        alunos.add(new Aluno("Welson", "Medicina", "6500", "Rua N bairro M", "87955846548", "5 periodo"));
        alunos.add(new Aluno("Anderson", "Computação", "6500", "Rua G bairro M", "87955846548", "5 periodo"));
        alunos.add(new Aluno("Cassio", "Computação", "6500", "Rua G bairro M", "87955846548", "5 periodo"));
        alunos.add(new Aluno("Guga", "direito", "6500", "Rua G bairro M", "87955846548", "5 periodo"));
        alunos.add(new Aluno("Marcelo", "Quimica", "6500", "Rua G bairro M", "87955846548", "5 periodo"));
        alunos.add(new Aluno("Jonildo", "Computação", "6500", "Rua G bairro M", "87955846548", "5 periodo"));


//        Criando adapter passando o contexto e a lista de alunos
        AlunoAdapter adapter = new AlunoAdapter(this, alunos);
//        Recuperando lista do XML
        ListView listView = findViewById(R.id.list_view);
//        definindo o adapter para a listview
        listView.setAdapter(adapter);

//        defindo o item para o clique do item da lista
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Recuperando dados de aluno clicado
                Aluno alunoEscolhido = alunos.get(position);
//                Enviando dados para a tela de detalhes do Aluno
                Intent intencao = new Intent(MainActivity.this, DetalhesAluno.class);
//                atribuindo aluno à intenção que será enviada para Activity DetalhesAluno
                intencao.putExtra("aluno", alunoEscolhido);
                startActivity(intencao);


            }
        });


    }
}

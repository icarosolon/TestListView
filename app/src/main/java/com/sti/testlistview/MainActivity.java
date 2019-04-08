package com.sti.testlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Aluno> alunos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        alunos = new ArrayList<>();
        alunos.add(new Aluno("Valtency", "Computação"));
        alunos.add(new Aluno("Lívia", "Enfermagem"));
        alunos.add(new Aluno("Augusto", "Medicina"));
        alunos.add(new Aluno("Welson", "Gestão de TI"));

        AlunoAdapter adapter = new AlunoAdapter(this, alunos );
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Aluno alunoEscolhido = alunos.get(position);
                Toast.makeText(MainActivity.this, "Nome: " + alunoEscolhido.getNome()
                        + "\nCurso: "+alunoEscolhido.getCurso(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

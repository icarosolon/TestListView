package com.sti.testlistview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import static com.sti.testlistview.R.menu.menu;

public class DetalhesAluno extends AppCompatActivity {



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_share:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"icaro.solon.is@gmail.com"});

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                return true;
            case R.id.menu_call:
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "74988170986"));
                if (intentCall.resolveActivity(getPackageManager()) != null) {
                    startActivity(intentCall);
                }
                return true;
            case R.id.menu_config:
                Intent intentConfig = new Intent(this, Settings.class);
                startActivity(intentConfig);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

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

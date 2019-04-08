package com.sti.testlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class AlunoAdapter extends ArrayAdapter<Aluno> {

    public AlunoAdapter(Context context, List<Aluno> alunos) {
        super(context, 0, alunos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;

        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.item_lista_alunos, parent, false);
        }

        Aluno aluno = getItem(position);

        TextView tvNome = itemView.findViewById(R.id.tv_nome);
        tvNome.setText(aluno.getNome());
        TextView tvCurso = itemView.findViewById(R.id.tv_curso);
        tvCurso.setText(aluno.getCurso());

        return itemView;
    }
}

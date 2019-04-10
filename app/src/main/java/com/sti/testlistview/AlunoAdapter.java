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

    private class AlunoHolder {
        TextView nome,curso;

        public AlunoHolder(View view){
            nome = view.findViewById(R.id.tv_nome);
            curso = view.findViewById(R.id.tv_curso);
        }
    }


    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        View itemView = convertView;
        AlunoHolder holder;

        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.item_lista_alunos, parent, false);
        }

        if (itemView.getTag() == null) {
            holder = new AlunoHolder(itemView);
            itemView.setTag(holder);
        }else{
            holder = (AlunoHolder) itemView.getTag();
        }

        Aluno aluno = getItem(position);
        holder.nome.setText(aluno.getNome());
        holder.curso.setText(aluno.getCurso());

        return itemView;

    }

}
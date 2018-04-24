package br.com.fiap.recyclerview;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by logonrm on 24/04/2018.
 */

public class ContatoAdapter extends RecyclerView.Adapter<ContatoAdapter.ContatoViewHolder> {

    Context context;
    List<Contato> contatos;

    public ContatoAdapter(Context context, List<Contato> contatos) {
        this.context = context;
        this.contatos = contatos;
    }

    @Override
    public ContatoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(this.context).inflate(R.layout.recycleview_contatos, parent,false);

        ContatoViewHolder contatoViewHolder = new ContatoViewHolder(v);

        return contatoViewHolder;

    }

    @Override
    public void onBindViewHolder(ContatoViewHolder holder, int position) {
        final Contato contato = this.contatos.get(position);

        holder.txtNome.setText(contato.getNome());
        holder.imgContato.setImageResource(contato.getImagem());
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,contato.getStatus(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.contatos.size();
    }

    public static class ContatoViewHolder extends RecyclerView.ViewHolder {

        CardView cardview;
        ImageView imgContato;
        TextView txtNome;


        public ContatoViewHolder(View itemView) {
            super(itemView);

            cardview = itemView.findViewById(R.id.cardview);
            imgContato = itemView.findViewById(R.id.imgContato);
            txtNome = itemView.findViewById(R.id.txtNome);
        }
    }
}

package com.example.antonio.projetocarros_antonioneto;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by antonio on 17/03/2016.
 */
public class CarrosAdapter extends RecyclerView.Adapter<CarrosAdapter.CarrosViewHolder> {

    private Context context;
    private List<Carro> carros;
    private CarrosApplication application;

    public CarrosAdapter(Context context){
        this.context = context;
        application = (CarrosApplication) context.getApplicationContext();
        carros = application.getCarros();
    }

    @Override
    public CarrosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflo meu layout e armazeno ele em uma view
        View view = LayoutInflater.from(context).inflate(R.layout.content_list_main, parent, false);
        // Envio meu layout inflado (view) para a classe ViewHolder
        return new CarrosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CarrosViewHolder holder, int position) {
        Carro c = carros.get(position);// Capturo meu carro da posição
        // Mostro a imagem do meu carro
        holder.imgView.setImageDrawable(context.getResources().getDrawable(c.getIdImageCarro()));
        // Exibo o nome do carro
        holder.textView.setText(c.getNomeCarro());

    }

    @Override
    public int getItemCount() {
        return this.carros.size(); // Retorno o tamanho da lista de carros;
    }

    public class CarrosViewHolder extends RecyclerView.ViewHolder {

        private View toqueView;
        private ImageView imgView;
        private TextView textView;

        public CarrosViewHolder(View itemView) {
            super(itemView);
            toqueView = itemView.findViewById(R.id.toque_list);
            imgView = (ImageView)itemView.findViewById(R.id.img_list_main);
            textView = (TextView)itemView.findViewById(R.id.text_list_main);
            toqueView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getPosition();
                    application.removerCarro(position);
                    Toast.makeText(context, "Removeu da posição " + position, Toast.LENGTH_SHORT).show();
                    notifyDataSetChanged();
                }
            });
        }
    }
}

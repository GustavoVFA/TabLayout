package br.com.myskout.tablayoutfragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class HomeFragmentCachorro extends Fragment {
    ListView lstCachorro;

    //Criar os dados

    String nomeCachorro[] = {"Caramal", "Scooby", "pitbrabo", "Adriano"};

    String descricaoCachorro[] = {
            "Quero ser adotado alguém ai se disponibiliza...",
            "Alguém gosta de gato, estou aqui...",
            "Gosto de humano, sou muito carinhoso...",
            "Estou disponível para ser adotado..."

    };
    String numCachorro[] = {"5.0", "8.0", "9.0", "9.5"};
    int imagemCachorro[] = {
            R.drawable.cachorro, R.drawable.caramelo,
            R.drawable.pitbull, R.drawable.preto_branco


    };

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        lstCachorro = view.findViewById(R.id.lstCachorros);

        //Instanciando a classe adaptadora
        AdapterCachorros adapterCachorros = new AdapterCachorros();


        //Carregar a lista com o adaptador
        lstCachorro.setAdapter(adapterCachorros);

        return view;
    }

    //Criando a minha classe adaptadora ou inner class
    public class AdapterCachorros extends BaseAdapter {

        @Override
        public int getCount() {
            return imagemCachorro.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //Declarando as variáveis do modelo
            TextView txtNomeCachorro, txtDescricaoCachorro, txtNumCachorro;
            ImageView imgCachorro;

            //Instanciar a janela do modelo no adapter
            View v = getLayoutInflater().inflate(R.layout.modelo_cachorro,null);

            txtNomeCachorro = v.findViewById(R.id.txtNomeCachorro);
            txtDescricaoCachorro = v.findViewById(R.id.txtDescricaoCachorro);
            txtNumCachorro = v.findViewById(R.id.txtNumCachorro);
            imgCachorro = v.findViewById(R.id.imgModeloCachorro);

            //Inserindo valores nos objetos do modelo
            txtNomeCachorro.setText(nomeCachorro[i]);
            txtDescricaoCachorro.setText(descricaoCachorro[i]);
            txtNumCachorro.setText(numCachorro[i]);
            imgCachorro.setImageResource(imagemCachorro[i]);

            return v;
        }
    }
}
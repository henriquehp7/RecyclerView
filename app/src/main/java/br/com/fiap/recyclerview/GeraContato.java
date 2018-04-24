package br.com.fiap.recyclerview;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.recyclerview.Contato;
import br.com.fiap.recyclerview.R;

/**
 * Created by logonrm on 24/04/2018.
 */

public class GeraContato {

    public static List<Contato> geraContato(){
        List<Contato>contatos = new ArrayList<>();

        Contato contato1 = new Contato("henrique", "1111111111", "qualquer coisa", R.drawable.person);
        Contato contato2 = new Contato("slimshady", "11111117111", "qualquer coisa tb", R.drawable.person2);

        contatos.add(contato1);
        contatos.add(contato2);

        return contatos;
    }


}

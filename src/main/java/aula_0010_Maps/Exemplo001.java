package aula_0010_Maps;

import java.util.HashMap;

public class Exemplo001 {

    public HashMap<String,String> mapaEstados() {
        HashMap<String, String> estados = new HashMap<>();
        estados.put("SP", "São Paulo");
        estados.put("RJ", "Rio de Janeiro");
        return estados;
    }


    public static void main(String[] args) {
        HashMap<String, String> mapaEstados = new Exemplo001().mapaEstados();

        for (String siglaDoEstado: mapaEstados.values()) {
            System.out.println(siglaDoEstado);
        }

    }


    }



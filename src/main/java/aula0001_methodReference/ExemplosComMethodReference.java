package aula0001_methodReference;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.List;

@Log4j2
public class ExemplosComMethodReference {


    // existem alguns tipos de methods reference
    // ao menos 4 os mais importantes

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4,5,6);

        //como eu imprimiria usando lambda?
        lista.stream().forEach((numeros)-> System.out.println(numeros));

        // ja com o method reference
        lista.stream().forEach(System.out::println);

        lista.stream().map((n)-> multipliquePorDois(n)).forEach(System.out::println);


    }


    public static Integer multipliquePorDois(Integer i){
        return i *2;
    }

}

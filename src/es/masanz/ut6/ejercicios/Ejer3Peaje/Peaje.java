package es.masanz.ut6.ejercicios.Ejer3Peaje;

import java.util.ArrayList;
import java.util.HashSet;

public class Peaje {
    private ArrayList<String> matriculas = new ArrayList<>();
    private HashSet<String> matriculasAdmitidas = new HashSet<>();

    public void iniciar(){
        asignarMatriculas();
        pasa(matriculas);
        imprimirLista(matriculasAdmitidas);
    }

    public void asignarMatriculas(){
        matriculas.add("4281 LRP");
        matriculas.add("9032 KSM");
        matriculas.add("1567 GHT");
        matriculas.add("6740 MBD");
        matriculas.add("0319 FKL");
        matriculas.add("8254 JWR");
        matriculas.add("5106 HBV");
        matriculas.add("2983 CXM");
        matriculas.add("7412 PNB");
        matriculas.add("3658 DTY");
    }

    public void pasa(ArrayList lista){
        int n = (int) (Math.random() * 2);

        for (int i = 0; i < lista.size(); i++) {
            String a = lista.get(0).toString();
            if (n == 0){
                matriculasAdmitidas.add(a);
            }
        }
    }

    public void imprimirLista(HashSet lista){
        System.out.println("Matriculas admitidas:");
        for (Object o : lista) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Peaje pj = new Peaje();
        pj.iniciar();
    }
}

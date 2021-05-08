package br.com.alura.java.io.teste;

import java.io.*;

public class TesteInput {

    public static void main(String[] args) throws IOException {
        //Fluxo de Entrada de Arquivos
        InputStream fis = new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();
        System.out.println(linha);

        while (linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }
}

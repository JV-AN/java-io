package br.com.alura.java.io.teste;

import java.io.*;

public class TesteFileWriter {

    public static void main(String[] args) throws IOException {
        //Fluxo de Saida de Arquivos
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osr = new OutputStreamWriter(fos);

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        bw.write(" tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
        bw.newLine();
        bw.newLine();
        bw.write("ASDHJO aosdiaOSIDJ oaisjdao dasdasd");

        bw.close();
    }
}

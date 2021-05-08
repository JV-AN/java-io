package br.com.alura.java.io.teste;

import java.io.*;

public class TestePrintWriterEPS {

    public static void main(String[] args) throws IOException {
        //Fluxo de Saida de Arquivos
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osr = new OutputStreamWriter(fos);

        //BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
       // PrintStream ps = new PrintStream(new File("lorem2.txt"));
        PrintWriter ps = new PrintWriter("lorem2.txt");

        ps.println(" tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
        ps.println();
        ps.println();
        ps.println();
        ps.println();
        ps.println("ASDHJO aosdiaOSIDJ oaisjdao dasdasd");

        ps.close();
    }
}

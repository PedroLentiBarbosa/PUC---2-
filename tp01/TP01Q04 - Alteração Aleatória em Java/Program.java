import java.util.Random;
import java.io.*;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
import java.nio.charset.*;
import java.util.*;


class Program {
    public static String recebeString (String a, Random gerador) {
        char primeira = (char)('a' + Math.abs(gerador.nextInt() % 26));
        char segunda = (char)('a' + Math.abs(gerador.nextInt() % 26));
        
        String b = ""; //Iniciar a string
        for(int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == primeira) {
                b += segunda;
            } else {
                b += a.charAt(i);
            }
        }
    return b;
    }

    public static boolean isFim (String a) {
        return (a.length() == 3 && a.charAt(0) == 'F' && a.charAt(1) == 'I' && a.charAt(2) == 'M');

    }

    public static void main (String[] args) {

        MyIO.setCharset("UTF-8");
        String[] entrada = new String [1000];
        int numero = 0;

        do {
            entrada[numero] = MyIO.readLine();
        } while (isFim(entrada[numero++]) == false);
        numero --; // Desconsiderar FIM

        //Criar o random
        Random gerador = new Random();
        gerador.setSeed(4);

        //Para cada linha de entrada, uma saida com a String modificada
        for(int i = 0; i < numero; i++) {
            System.out.println(recebeString(entrada[i], gerador));
        } 
    }
}
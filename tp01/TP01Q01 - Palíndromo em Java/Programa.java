import java.util.*;

class Programa {
    public static boolean palindromo(String n){
        int tamanho = n.length() - 1; // sem o Enter
        for(int i = 0, j = tamanho; i < j; i++, j--){
           if(n.charAt(i) != n.charAt(j)) {
              return false;
           }
        }
        return true;
    }

    public static void saida(String n){
        if(palindromo(n) == true ){
           System.out.println("SIM");
        } else {
           System.out.println("NAO");
        }
    }

    public static boolean fim(String n) {
        return (n.length() == 3 && n.charAt(0) == 'F' && n.charAt(1) == 'I' && n.charAt(2) == 'M');
    }

    public static void main(String[] args) {
        Scanner nome = new Scanner (System.in);
        String[] entrada = new String[1000];
        int numEntrada = 0;

        //Leitura da entrada padrao
        do {
            entrada[numEntrada] = nome.nextLine();
        } while (fim(entrada[numEntrada++]) == false);
        numEntrada--; // Desconsiderar FIM

        //Gerando uma saida SIM (palindromo) e NAO (não palindromo)
        for(int i = 0; i < numEntrada; i++){
            saida(entrada[i]);
        }
    }
}
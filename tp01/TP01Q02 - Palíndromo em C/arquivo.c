#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

#define string1 1000
#define string2 100

bool palindromo(char palavra[]) {
    int tamanho = strlen(palavra); // desconsiderar o Enter
    for(int i = 0, j = tamanho - 1; i < j; i++, j--){
        if (palavra[i] != palavra[j] )
        return false;
    }
    return true;
}

void saida(char palavra[]) {

    if(palindromo(palavra) == true)
    printf("SIM\n");
    else 
    printf("NAO\n");
}

bool fim (char palavra[]) {
     return (strlen(palavra) == 3 && palavra[0] == 'F' && palavra[1] == 'I' && palavra[2] == 'M');
        return true;
}

int main () {
    
    char pala[string1][string2];
    int x = 0; // tamanho da string
    char palavrao[100];
    
    do{
    fgets(palavrao, string2, stdin); // receber o palindromo
    palavrao[strcspn(palavrao, "\r\n")] = 0;
    strcpy(pala[x], palavrao);
    }while((fim(pala[x++]) == false));
    x--;//desconsiderar a palavra FIM
    for(int i = 0; i < x; i++){
    saida(pala[i]);//aplicar a função do palindromo
    } 
   
}

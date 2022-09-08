#include <stdio.h>
#include <stdlib.h>
#include <string.h>


void combina(char* aux, char* aux2){
    char* aux3;

    aux3 = (char*)malloc((strlen(aux) + strlen(aux2)) * sizeof(char));

    int index = 0;

    for(int i = 0, j = 0; i < strlen(aux) || j < strlen(aux2); i++, j++){
        if(i < strlen(aux)){
            aux3[index] = aux[i];
            index++;
        }
        if (j < strlen(aux2)){
            aux3[index] = aux2[j];
            index++;
        }
    }
    aux3[index] = '\0';
    
    printf("%s\n", aux3);
}

int main (void) {
    char* pala1;
    char* pala2;
    int x;

    pala1 = (char*)malloc(sizeof(char)); 
    pala2 = (char*)malloc(sizeof(char));

    while(scanf("%s %s", pala1, pala2) != EOF){
        
    
        combina(pala1, pala2);
    }
}


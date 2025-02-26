#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#include<string.h>


bool isPalindromo(char* str){

    // Definir dados
    bool resp = true;
    int len = strlen(str);

    if(str[len - 1] == '\n'){
        str[len - 1] = '\0';
        len--;
    }

    // Percorrer string
    for(int i = 0; i < len / 2; i++){

        // Comparar
        if((str[i] != str[len - i - 1])){

            // Tratamento
            resp = false;
            i = len;
        }
    }

    // Retorno
    return resp;
}

int main(){

    // Definir dados
    char str[100];

    fgets(str, 100, stdin);
    str[strcspn(str, "\n")] = '\0';

    while(strcmp(str, "FIM") != 0){

        printf("%s\n", isPalindromo(str) ? "SIM" : "NAO");

        fgets(str, 100, stdin);
        str[strcspn(str, "\n")] = '\0';
    }

    return 0;
}

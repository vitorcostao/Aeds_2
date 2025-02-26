#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#include<string.h>
#include<ctype.h>


bool isPalindromo(char* str, int i, int len){

    if(i == (len / 2)){

        return true;
    } else {

        if(str[i] != str[len - i - 1]){

            return false;
        } else {

            return isPalindromo(str, i + 1, len);
        }
    }
}

int main(){

    // Definir dados
    char str[100];

    // Leitura de dados
    fgets(str, 100, stdin);
    str[strcspn(str, "\n")] = '\0';

    while(strcmp(str, "FIM") != 0){
        
        printf("%s\n", isPalindromo(str, 0, strlen(str)) ? "SIM" : "NAO");

        fgets(str, 100, stdin);
        str[strcspn(str, "\n")] = '\0';
    }

    return 0;
}
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

char* inverter(char* str, int i){

    int len = strlen(str);

    if(i == len / 2){

        return str;
    } else {

        char tmp = str[i];
        str[i] = str[len - i - 1];
        str[len - i - 1] = tmp;

        return inverter(str, i + 1);
    }
}

int main (){

    // Definir dados
    char str[256];

    fgets(str, 256, stdin);
    str[strcspn(str, "\n")] = '\0';

    while(strcmp(str, "FIM") != 0){

        char str2[256];
        strcpy(str2, str);

        inverter(str2, 0);

        printf("%s\n", str2);

        fgets(str, 256, stdin);
        str[strcspn(str, "\n")] = '\0';
    }

    return 0;
}
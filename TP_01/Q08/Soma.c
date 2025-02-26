#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#include<string.h>
#include<ctype.h>


int SomaTermos(char* num, int i, int sum){

    // Definir dados
    int len = strlen(num);

    if(i == len){

        return sum;
    } else {

        sum += (int) num[i] - '0';

        return SomaTermos(num, i + 1, sum);
    }
}

int main(){

    // Definir dados
    int num;
    char str[256];

    fgets(str, 256, stdin);
    str[strcspn(str, "\n")] = '\0';

    while(strcmp(str, "FIM") != 0){

        printf("%d\n", SomaTermos(str, 0, 0));

        fgets(str, 256, stdin);
        str[strcspn(str, "\n")] = '\0';
    }
    

    return 0;
}
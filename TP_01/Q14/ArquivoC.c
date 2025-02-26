#include <stdio.h>

void fprint(char* filename){

    // Definir dados
    FILE* arq = fopen(filename , "wt");
    int n;
    float real;

    scanf("%d", &n);
    getchar();

    for(int i = 0; i < n; i++){

        scanf("%f", &real);
        getchar();
        fprintf(arq, "%f\n", real);
    }

    fclose(arq);
}

void readFile(FILE* arq){

    if(feof(arq)){

        return;
    } else {

        // Definir dados
        float n;

        if(fscanf(arq, "%f", &n) != 1){ return; }

        readFile(arq);

        printf("%f\n", n);
    }
}

int main() {

    // Definir dados
    FILE* arq = fopen("dados.txt" , "rt");
    
    fprint("dados.txt");
    readFile(arq);    
    
    fclose(arq);
    return 0;
}

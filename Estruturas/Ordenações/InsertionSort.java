/* Custo computacional
 
   Comparações: 
   Melhor caso: C(n) = n - 1, pois a operação nunca entra no while(já está ordenado)
                realizando um total de (n - 1) comparações, já que o for vai de 1 até n - 1;

   Pior caso: C(n) = [(n^2 - n) / 2], pois a operação sempre entra no while(ordenado decrescente)
              realizando o um somatório em 1 até (n - 1) de j = (i - 1);

   Movimentações:
   Melhor caso: M(n) = 2(n - 1), pois a operação nunca entra no while(já está ordenado)
                movimentando apenas em tmp e array[j + 1] = tmp;

   Pior caso: M(n) = [(n^2 + n) / 2] - 1, pois a operação sempre entra no while(ordenado decrescente)
              movimentando 2(n - 1) + [(n^2 - n) / 2], registro do for + registro do while


 */

public class InsertionSort {

    public static void Imprimir(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        // Definir dados
        int[] array = { 56, 12, 73, 98, 114 };
        int n = array.length;

        // Insertion
        for (int i = 1; i < n; i++) {

            int tmp = array[i];
            int j = i - 1;

            while (j >= 0 && (array[j] > tmp)) {

                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = tmp;
        }
        Imprimir(array);
    }
}

/* Custo computacional
 
   1) C(n) = [(n^2 - n) / 2] = Número de comparações 
   Somatório em 0 até n - 2 de i;  
      
    
   2) M(n) = 3(n - 1) = Número de movimentações de registro
   A cada iteração do for, que vai de 0 a n - 2, ele realiza
   3 movimentações, ou seja, 3(n - 1); 

 */

public class SelectionSort {

    public static void Imprimir(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        // Definir dados
        int[] array = { 56, 12, 73, 98, 114 };
        int n = array.length;

        // Seleção
        for (int i = 0; i < n - 1; i++) {

            // Menor
            int menor = i;
            for (int j = i + 1; j < n; j++) {

                if (array[j] < array[menor]) {

                    menor = j;
                }
            }

            int tmp = array[i];
            array[i] = array[menor];
            array[menor] = tmp;
        }

        Imprimir(array);
    }
}
public class Pilha {
    
    // Definir Dados
    private int n;
    private int[] array;

    public Pilha() {
    
        this.n =-1;
        this.array = null;
    }

    public Pilha(int capacidade){

        this.n = 0;
        this.array = new int[capacidade];
    }

    // Empilhar
    public void empilhar(int value)throws Exception{

        // Verificações
        if(n >= array.length){

            throw new Exception("ERROR EMPILHA");
        }

        array[n] = value;
        n++;
    }

    public int desempilhar() throws Exception{

        if(n == 0){

            throw new Exception("ERRO D!");
        }

        int resp = array[n - 1];

        n--;

        return resp;
    }

    public void MostrarPilha(){

        if(n == 0){

            System.out.println("Pilha vazia");
            return;
        }

        // Percorrer Lista
        for(int i = 0; i < this.n; i++){

            System.out.println(this.array[i]);
        }
    }

    public static void main(String[] args) throws Exception{
        
        // Definir dados
        Pilha stack = new Pilha(5);

        stack.empilhar(4);
        stack.empilhar(3);
        stack.empilhar(2);
        stack.desempilhar();
        

        stack.MostrarPilha();

    }
    
}

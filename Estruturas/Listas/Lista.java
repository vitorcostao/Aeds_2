
public class Lista {

    // Dados
    private int n;
    private int[] array;

    // Construtor padrão
    public Lista(){
       
        this.n = -1;
        this.array = null;
    }

    // Construtor para inicializar lista de tamanho capacidade
    public Lista(int capacidade) throws Exception{

        if(capacidade <= 0){

            throw new Exception("Erro: Não há dados");
        }

        this.n = 0;
        this.array = new int[capacidade];
    }

    /* Métodos de uma lista
     * Inserir no início
     * Inserir na posição
     * Inserir no fim
     * Remover no início
     * Remover no meio
     * Remover no fim
     * Mostrar dados
    */


    // Lógica -> Deslocar elementos para direita e inserir em [0]
    public void InserirInicio(int value) throws Exception{

        if(n >= array.length){

            throw new Exception("Lista cheia");
        }

        for(int i = n; i > 0; i--){

            array[i] = array[i - 1];
        }

        array[0] = value;
        n++;
    }

    public void InserirFim(int value) throws Exception{

        if(n >= array.length){

            throw new Exception("Lista cheia");
        }

        array[n] = value;
        n++;
    }

    public void InserirPos(int pos, int value) throws Exception{

        if(n >= array.length){

            throw new Exception("Lista cheia");
        }

        for(int i = n; i > pos; i--){

            array[i] = array[i - 1];
        }

        array[pos] = value;
        n++;
    }

    public int RemoverInicio() throws Exception{

        if(n == 0){

            throw new Exception("Lista vazia");
        }

        int resp = array[0];
        n--;

        for(int i = 0; i < n; i++){

            array[i] = array[i + 1];
        }

        return resp;
    }

    public int RemoverFim() throws Exception{

        if(n == 0){

            throw new Exception("Lista vazia");
        }

        return array[--n];
    }

    public int RemoverPos(int pos) throws Exception{

        if(n == 0){

            throw new Exception("Lista vazia");
        }

        int resp = array[pos];
        n--;

        for(int i = pos; i < n; i++){

            array[i] = array[i + 1];
        }

        return resp;
    }

    public void MostrarLista(){

        for(int i = 0; i < n; i++){

            System.out.println(array[i]);
        }
    }
   
    public static void main(String[] args) throws Exception{
        
        // Definir dados
        Lista lista = new Lista(5);

        lista.InserirInicio(1);
        lista.InserirInicio(2);
        lista.InserirFim(3);
        lista.InserirFim(4);
        lista.InserirPos(1, 10);

        System.out.println("Lista inserida");
        lista.MostrarLista();

        System.out.println("\n");

        System.out.println("Lista removida");
        lista.RemoverInicio();
        lista.RemoverFim();
        lista.RemoverPos(1);

        lista.MostrarLista();
    }
}

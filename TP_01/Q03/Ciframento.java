
public class Ciframento {

    public static String CesarCifra(String str){

        // Definir dados
        int len = str.length();
        String cesar = "";

        for(int i = 0; i < len; i++){

            char c = str.charAt(i);
                
            cesar += (char) (c + 3);
        }

        // Retorno
        return cesar;
    }

    public static void main(String[] args){

        // Definir dados
        String str1, str2;

        // Leitura de dados
        str1 = MyIO.readLine();

        while(!str1.equals("FIM")){

            // Aplicando função
            str2 = CesarCifra(str1);

            MyIO.println(str2);

            str1 = MyIO.readLine();
        }
    }
}


public class CiframentoR {

    public static String CesarCifraRecursivo(char[] str) {

        return CesarCifraRecursivo(str, 0);
    }
   
    public static String CesarCifraRecursivo(char[] str, int i){

        if(i == str.length){

            return new String(str);
        } else {


            str[i] = (char)(str[i] + 3);


            return CesarCifraRecursivo(str, i + 1);
        }
    }

    public static void main(String[] args){

        MyIO.setCharset("ISO-8859-1");

        // Definir dados
        String str1;
        char[] str2;
        

        // Leitura de dados
        str1 = MyIO.readLine();

        while(!str1.equals("FIM")){

            // Conversao
            str2 = str1.toCharArray();

            str1 = CesarCifraRecursivo(str2);
    
            MyIO.println(str1);

            str1 = MyIO.readLine();
        }
    }
}
class Matrizes{
    public static int [][] matrizNovaInt (int numero_linhas, int numero_colunas){
        int [][] matriz;
        matriz = new int [numero_linhas][numero_colunas];
        return matriz;
    }
    public static int[][] matrizNovaString (int numero_linhas, int numero_colunas){
        int[][] matriz;
        matriz = new int [numero_linhas][numero_colunas];
        return matriz;
    }
      public static void matrizPrintInt (int[][] matriz){
        int i,j;
       for(i=0;i<matriz.length;i++){
        for(j=0;j<matriz[0].length;i++){
            System.out.printf("%d" , matriz[i][j]);
        }
        System.out.println();
       }
    }
     public static int[] matrizGetLinhaInt(int [][] matriz, int l){
        int [] linha;
        int i;
        
        linha = new int[matriz[0].length];
        for (i=0;i<linha.length;i++){
            linha[i] = matriz[l][i];
        }

        return linha;
     }
     public static boolean vetorValoresIguaisInt(int [] vetor){
        int i;
        for(i=0;i<vetor.length;i++){
            if(!(vetor[i]==vetor[0])){
             return false;
            }
        }
       return true;
     }
    
     public static String [][] matrizPreencheString(String [][] matriz){
         int i,j;
       for(i=0;i<matriz.length;i++){
        for(j=0;j<matriz[0].length;j++){
            matriz[i][j]= "cachorro";
            System.out.printf("%d" , matriz[i][j]);
        }
       
       }
       
       return matriz;
       
    }

    


    public static void main (String[] args) {
      



    }
}
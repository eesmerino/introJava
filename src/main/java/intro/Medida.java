
//1 - Pacote
package intro;

//2 - Referência as Bibliotecas
//3 - Classe
public class Medida {
    //3.1 - Atributos - características da classe
    // 3.2 -Métodos e funções
    public static void main(String [] args){
        System.out.println("Bom dia");
        System.out.println("Calculo de áreas");
        int largura;
        int comprimento;
        int resultado;
        largura = 5;
        comprimento = 6;
        resultado = largura*comprimento;
        System.out.println ( "Para a largura de " + largura +  " E o comprimento de "
                + comprimento + " A area é de: " + resultado +"m2");

    }
    public void calcularAreaModoExtenso(){
        //Calcular área  - Exemplo: O tamanho do tapete ou do Piso
        int largura;
        int comprimento;
        int resultado;
        largura = 5;
        comprimento = 6;
        resultado = largura*comprimento;
        System.out.println ( "Para a largura de " + largura +  " E o comprimento de "
                + comprimento + " A area é de: " + resultado +"m2");

    }
    public void calcularAreaModoCompacto(){
        //Calculo de Area - Reduzida
        int largura = 4;
        int comprimento = 3;
        System.out.println ( "Para a largura de " + largura +  " E o comprimento de "
                + comprimento + " A area é de: " + largura * comprimento +"m2");

    }

}


//1 - Pacote
package intro;

//2 - Referência as Bibliotecas
//3 - Classe
public class Medida {
    //3.1 - Atributos - características da classe
    // 3.2 -Métodos e funções
    public static void main(String [] args) {
        //IF - Estrutura Condicional - Verificar uma condição ELSE senão
        //switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software.
        String opcao ="extenso";
        switch (opcao){
            case "ifSimples":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "curto":
                System.out.println("Você escolheu executar método calcularAreaModoCurto");
                calcularAreaModoCurto();
               break;
            case "extenso":
                System.out.println("Você escolheu executar método extenso");
                calcularAreaModoExtenso();
                break;
            default:
                System.out.println("Você escolheu um outro valor que não tem opão associada");

        }


    }

    private static void ifSimples() {

    }

    public void mifSimples(){
            //IF - Estrutura Condicional - Verificar uma condição
            // ELSE - Senão

            String modo = "curto";
            if(modo =="curto"){
                calcularAreaModoCurto();
            }
            else{
                calcularAreaModoExtenso();
            }

            calcularAreaModoCurto();
            calcularAreaModoExtenso();

        }

    public static void calcularAreaModoCurto(){

        System.out.println("Calculo de áreas Modo Curto");
        int largura;
        int comprimento;
        int resultado;
        largura = 5;
        comprimento = 6;
        resultado = largura*comprimento;
        System.out.println ( "Para a largura de " + largura +  " E o comprimento de "
                + comprimento + " A area é de: " + resultado +"m2");

    }
    public static void calcularAreaModoExtenso(){

        System.out.println("Calculo de áreas Modo Extenso");
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

}

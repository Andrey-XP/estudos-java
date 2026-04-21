import java.util.Scanner;
import java.util.ArrayList;
public class Erprefrigeracao {
    static Scanner leitor = new Scanner(System.in);
    private static ArrayList<String> produtos = new ArrayList<>();
    public static void main(String[] args) {
       while (true) {
           menu();
           System.out.print("Escolha Uma Opcao: ");
           String op = leitor.nextLine();
           if (op.equals("1")) {
               cadastrarProduto();
           } else if (op.equals("2")) {
               listarProduto();
           }else if (op.equals("3")){
               removerProduto();
           }else if (op.equals("4")){
               System.out.println("Saindo do sistema...");
               break;
           }

       }
    }
    static void menu(){
        System.out.println("---BEM VINDO AO ERP---");
        System.out.println("1 - Cadastra Produto");
        System.out.println("2 - Listar Produto");
        System.out.println("3 - Remover Produto");
        System.out.println("4 - Sair");

    }
    static void cadastrarProduto(){
        System.out.print("Qual Produto Quer Adiconar: ");
        String nome = leitor.nextLine();

        produtos.add(nome);
        System.out.println(nome + " Casdastrado Com Sucesso");
    }
    static void listarProduto(){
        if(produtos.isEmpty()){
            System.out.println("A lista esta vazia nao ha o que mostrar");
            return;
        }else{
            System.out.println(produtos);
        }
    }
    static void removerProduto(){
        if(produtos.isEmpty()){
            System.out.println("A lista esta vazia , nao ha o que remover");
            return;
        }else{
            int contador = 0;
            for(String item : produtos){
                System.out.println(contador + ": " + item);
                contador++;
            }

            System.out.print("Qual produto quer remover: ");
            String remove = leitor.nextLine();

            int indice;
            try{
                indice = Integer.parseInt(remove);
            }catch (NumberFormatException e){
                System.out.println("Erro: Digite Um Numero Valido");
                return;
            }
            if(indice < 0 || indice >= produtos.size()){
                System.out.println("Erro; Indice Invalido");
                return;
            }
            produtos.remove(indice);
            System.out.println("Produto Removido Com Sucesso");
        }
    }

}
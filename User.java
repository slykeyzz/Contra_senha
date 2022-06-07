import java.util.Scanner;

public class User {
    public String usuario (){
        Scanner s = new Scanner(System.in);
        String utilizador;
        String utilizador_cliente;

        System.out.println("Escolha um utilizador:");
        utilizador_cliente = s.nextLine();
        String upp_utilizador_cliente = utilizador_cliente.toUpperCase();

        for (int i = 0; true ; i++){
            System.out.println("Utilizador: ");
            utilizador = s.nextLine();
            String upp_utilizador = utilizador.toUpperCase();

            if (upp_utilizador.equals(upp_utilizador_cliente)){
                System.out.println("Acertou");
                break;
            }else if (i == 2){
                System.out.println("acabou as tentativas.");
                break;
            }
        }
        return utilizador;
    }
}

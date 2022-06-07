import java.util.Scanner;

public class AdivinhaPalavra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "";
        String senha_Utilizador;

        System.out.println("Escolha uma senha: ");
        senha_Utilizador = sc.nextLine();

        int erros = 3;

        User m = new User();
        m.usuario();

        //m.usuario(senha_Utilizador);
        for (int i = 0; true; i++) {
            //Obtendo o valor pelo teclado.
            System.out.println("Para aceder a conta tem " + erros + " tentativas:");
            senha = sc.nextLine();

            // Irá verificar se a senha está correta, se estiver irá executar as ações.
            if (senha.equals(senha_Utilizador)){
                System.out.println("Acertou a senha!");
                System.out.println("Bem vindo!");
                break;

                //Na linha (else if) vai ser executado quando as tentativas chegarem ao fim.
            }else if (i == 2){
                System.out.println("Acabou as tentativas.");
                break;
            }
            erros -= 1;
        }
    }
}
import java.util.Scanner;
public class Password {
    static String password;
    static String user;

    static String test_user;
    static String test_password;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o nome do usuario?");
        user = s.nextLine();
        System.out.println("Que senha deseja para o user " + user + "?");
        password = s.nextLine();

        int erros = 3;

        for (int i = 0; i < 3; i++){
            System.out.println("User: ");
            test_user = s.nextLine();
            System.out.println("Password:");
            test_password = s.nextLine();
            erros--;

            if (test_user.equals(user)){
            }else{
                System.out.println("User está errado.");
            }

            if (test_password.equals(password)){
                System.out.println("Bem vindo!");
                break;
            }else{
                System.out.println("Password está errada, Tente novamente!");
                System.out.println("Tentativas restantes: "+ erros);
            }
        }
    }
}
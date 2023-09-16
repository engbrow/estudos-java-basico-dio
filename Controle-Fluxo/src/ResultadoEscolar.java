import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
               
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite sua nota ");
            int nota = scanner.nextInt();

        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Prova de recuperação": "Reprovado";
        
        System.out.println(resultado);

    }
}

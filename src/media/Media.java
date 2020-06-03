package media;
import java.util.Scanner;

public class Media {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        float n1 = entrada.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = entrada.nextFloat();
        float media = (float) (n1+n2)/2;
        
        if (media>=7)
            System.out.println("O aluno foi aprovado com média: "+media);
        else{
            System.out.print("Digite a nota do exame: ");
            float ne = entrada.nextFloat();
            media = (media+ne)/2;
        }
            if (media >= 5)
                System.out.println("O aluno foi aprovado por exame com média: "+media);
            else
                System.out.println("O aluno foi reprovado com média: "+media);
    }
    
}

import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        //arrays de idade de cinco posições.
        int[] ages = new int[6];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i< ages.length; i++){
            System.out.print("Informe a idade do aluno " + i + ": ");
            ages[i] = scanner.nextInt();
        }
        for (int age : ages){
            System.out.println("Idade: " + age);
        } scanner.close();

        System.out.println("Meu array tem: " + ages.length + " elementos");
    }
}

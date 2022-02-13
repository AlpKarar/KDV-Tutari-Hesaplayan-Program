import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        int amount;
        float KDV, KDV_amount;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Amount: ");
        amount = input.nextInt();
        
        KDV = amount > 1000 ? 0.08f : 0.18f;
        
        KDV_amount = amount*KDV;
        
        System.out.printf("%.2f", KDV_amount);
    }
}

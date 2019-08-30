
package loteria;

import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 6 Números");
        for (int i = 0; i < 6; i++) {
           int num = -1;
            while (num == -1) {                
                num = 80
                        capNum(in, i);
            }
        }
    }

    public static int capNum(Scanner in, int i) {
        System.out.println("Digite o " + (i + 1) + "º Número");
        int num = in.nextInt();
        if (num >= 1 && num <= 60) {
            return num;
        } else {
            return -1;
        }

    
    
    }
    
}

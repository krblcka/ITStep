package behavioral.chainOfResponsobility;

import java.util.Scanner;

public class Main {
        private DispenseChain c5;

        public Main(){
            this.c5 = new Dollar50Dispenser();
            DispenseChain c2 = new Dollar20Dispenser();
            DispenseChain c1 = new Dollar10Dispenser();

            c5.setNextChain(c2);
            c2.setNextChain(c1);
        }

    public static void main(String[] args) {
        Main main = new Main();
        while(true){
            System.out.println("Enter amount to dispense: ");
            Scanner scanner = new Scanner(System.in);
            int amount = scanner.nextInt();
            if(amount % 10 != 0){
                System.out.println("Amount should be in multiple of 10s");
                return;
            }
            main.c5.dispense(new Currency(amount));
        }
    }
}

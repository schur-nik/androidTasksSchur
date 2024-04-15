import computerSubModules.HDD;
import computerSubModules.RAM;

public class Main {
    public static void main(String[] args) {
        //task 1
        CreditCard card1 = new CreditCard(880052353, 10000F);
        CreditCard card2 = new CreditCard(880052354, 5000.50F);
        CreditCard card3 = new CreditCard(880052355, 1000.33F);

        card1.incSumCreditCard(200.5F);
        card2.incSumCreditCard(1000.50F);
        card3.decSumCreditCard(650.90F);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

        //task 2
        Computer computer1 = new Computer(2162.20F, "Intel Core i9 13900K");
        RAM ram2 = new RAM("Kingston FURY Beast KF560C36BBEK2-32", 32);
        HDD hdd2 = new HDD("Kingston Fury Renegade SFYRD/2000G", 2048, "Внутренний");
        Computer computer2 = new Computer(773.25F, "Ryzen 5 7600X", ram2, hdd2);

        System.out.println(computer1);
        System.out.println(computer2);
    }
}

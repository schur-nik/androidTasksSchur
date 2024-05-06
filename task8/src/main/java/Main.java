public class Main {
    public static void main(String[] args) {
        Employee worker1 = new Worker("Biba", "Bibovich", 9.5f);
        Employee worker2 = new Worker("Pipa", "Pipovich", 3);
        Employee worker3 = new Worker("Tipa", "Tipovich", 0.8f);
        Employee director1 = new Director("Master", "Top", 14);

        ((Director)director1).addWorker(worker1);
        ((Director)director1).addWorker(worker2);

        //Вся информация по директору1 с 2 работниками
        System.out.println(director1);

        Employee director2 = new Director("Master", "Common", 5);
        ((Director)director2).addWorker(worker3);

        //Вся информация по директору2 с 1 работником
        System.out.println(director2);

        ((Director)director1).addWorker(director2);

        //Вся информация по директору1 с 2 работником и директором1 с 1 работником
        System.out.println(director1);

        //Ищем сотрудника с именем Tipa у директора1 (сотрудник Tipa есть у директора2, который в подчинении у директора1)
        System.out.println(FindEmplService.findEmplWithInfo((Director) director1, "Tipa"));
    }
}

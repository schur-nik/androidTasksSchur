public class FindEmplService {

    public static int findEmpl(Director director, String nameWorker) {
        for (Employee worker : director.getWorkers()) {
            if (worker.getName().equals(nameWorker)) {
                return 1;
            }
            if (worker.getProfessions() == Professions.DIRECTOR) {
                if(findEmpl((Director) worker, nameWorker) == 1) {return 2;};
            }
        }
        return 0;
    }

    public static String findEmplWithInfo(Director director, String nameWorker) {
        String result = "Сотрудник с именем " + nameWorker;
        if (findEmpl(director, nameWorker) == 1) {
            return result + " найден в прямом подчинении у директора " + director.getFullName();
        }
        else if (findEmpl(director, nameWorker) == 2){
            return result + " найден в косвенном подчинении у директора " + director.getFullName();
        }
        else {
            return result + " НЕ найден в подчинении у директора " + director.getFullName();
        }
    }

}

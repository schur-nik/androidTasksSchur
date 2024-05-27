public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        //Task 1
        Thread thread1 = new MyThread();
        Thread thread2 = new Thread(() -> System.out.println("Runnable Thread"));

        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //End

        System.out.println("Task 2");
        //Task 2
        int[] mas = {24, 12, 55, 11, 7, 8, 22, 97, 44};
        MinMaxService minMaxService = new MinMaxService(mas);
        Thread threadMax = new Thread(minMaxService::max);
        Thread threadMin = new Thread(minMaxService::min);
        threadMax.start();
        threadMin.start();
        try {
            threadMax.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            threadMin.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Max: "+minMaxService.getMax());
        System.out.println("Min: "+minMaxService.getMin());
        //End

        System.out.println("Task 3");
        //Task 3
        Thread daemonThread = new Thread(() -> System.out.println("Daemon Thread"));
        daemonThread.setDaemon(true);
        daemonThread.start();
        //End

        System.out.println("Task 4");
        //Task 4
        Marker marker = new Marker();
        Thread threadPrint1 = new Thread(() -> {
            PrintText printOne = new PrintText(marker);
            printOne.print("1");
        });
        Thread threadPrint2 = new Thread(() -> {
            PrintText printOne = new PrintText(marker);
            printOne.print("2");
        });
        threadPrint1.start();
        threadPrint2.start();
        //End

    }
}

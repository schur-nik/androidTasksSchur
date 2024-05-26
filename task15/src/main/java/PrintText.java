public class PrintText {
    private Marker marker;

    PrintText(Marker marker) {
        this.marker = marker;
    }

    public void print(String text) {
        synchronized (marker) {
            try {
                System.out.println(text);
                Thread.sleep(2000);
                System.out.println(text);
                Thread.sleep(2000);
                System.out.println(text);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
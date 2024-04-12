import computerSubModules.HDD;
import computerSubModules.RAM;

public class Computer {
    private float priceComputer;
    private String modelComputer;
    private RAM ramComputer;
    private HDD hddComputer;

    public Computer(float priceComputer, String modelComputer) {
        this.priceComputer = priceComputer;
        this.modelComputer = modelComputer;
        this.ramComputer = new RAM();
        this.hddComputer = new HDD();
    }

    public Computer(float priceComputer, String modelComputer, RAM ramComputer, HDD hddComputer) {
        this.priceComputer = priceComputer;
        this.modelComputer = modelComputer;
        this.ramComputer = ramComputer;
        this.hddComputer = hddComputer;
    }

    public float getPriceComputer() {
        return priceComputer;
    }

    public void setPriceComputer(float priceComputer) {
        this.priceComputer = priceComputer;
    }

    public String getModelComputer() {
        return modelComputer;
    }

    public void setModelComputer(String modelComputer) {
        this.modelComputer = modelComputer;
    }

    public RAM getRamComputer() {
        return ramComputer;
    }

    public void setRamComputer(RAM ramComputer) {
        this.ramComputer = ramComputer;
    }

    public HDD getHddComputer() {
        return hddComputer;
    }

    public void setHddComputer(HDD hddComputer) {
        this.hddComputer = hddComputer;
    }

    @Override
    public String toString() {
        return "Компьютер {" +
                "Стоимость=" + priceComputer +
                ", Модель='" + modelComputer + '\'' +
                ", RAM=" + ramComputer +
                ", HDD=" + hddComputer +
                '}';
    }
}

package computerSubModules;

public class RAM {
    private String nameRam;
    private int sizeRam;

    public RAM() {
        this.nameRam = "Неизвестное наименование RAM";
    }

    public RAM(String nameRam, int sizeRam) {
        this.nameRam = nameRam;
        this.sizeRam = sizeRam;
    }

    public String getNameRam() {
        return nameRam;
    }

    public void setNameRam(String nameRam) {
        this.nameRam = nameRam;
    }

    public int getSizeRam() {
        return sizeRam;
    }

    public void setSizeRam(int sizeRam) {
        this.sizeRam = sizeRam;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "Наименование='" + nameRam + '\'' +
                ", Объем памяти(ГБ)=" + sizeRam +
                '}';
    }
}

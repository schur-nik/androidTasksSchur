package computerSubModules;

public class HDD {
    private String nameHdd;
    private int sizeHdd;
    private String typeHdd;

    public HDD() {
        this.nameHdd = "Неизвестное наименование HDD";
        this.typeHdd = "Неизвестный тип";
    }

    public HDD(String nameHdd, int sizeHdd, String typeHdd) {
        this.nameHdd = nameHdd;
        this.sizeHdd = sizeHdd;
        this.typeHdd = typeHdd;
    }

    public String getNameHdd() {
        return nameHdd;
    }

    public void setNameHdd(String nameHdd) {
        this.nameHdd = nameHdd;
    }

    public int getSizeHdd() {
        return sizeHdd;
    }

    public void setSizeHdd(int sizeHdd) {
        this.sizeHdd = sizeHdd;
    }

    public String getTypeHdd() {
        return typeHdd;
    }

    public void setTypeHdd(String typeHdd) {
        this.typeHdd = typeHdd;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "Наименование='" + nameHdd + '\'' +
                ", Объем памяти(ГБ)=" + sizeHdd +
                ", Тип='" + typeHdd + '\'' +
                '}';
    }
}

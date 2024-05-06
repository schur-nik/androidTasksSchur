public enum Professions {
    DIRECTOR("Директор"),
    WORKER("Работник");

    private final String nameProfessions;

    Professions(String nameProfessions) {
        this.nameProfessions = nameProfessions;
    }

    public String getNameProfessions() {
        return nameProfessions;
    }
}

public enum Profession {
    DIRECTOR(3f),
    WORKER(1f),
    HR(0.8f);

    private float coeff;

    Profession(float coeff) {
        this.coeff = coeff;
    }

    public float getCoeff() {
        return coeff;
    }
}

package tarefa7;

/**
 *
 * @author agonzalezacevedo
 */
public abstract class Barco {

    private String matricula;
    private int dias;
    private float eslora;

    public Barco() {
    }

    public Barco(String matricula, int dias, float eslora) {
        this.matricula = matricula;
        this.dias = dias;
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", dias=" + dias + ", eslora=" + eslora + '}';
    }

    public abstract void calcularPrecio();
}

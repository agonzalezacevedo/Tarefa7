package tarefa7;

/**
 *
 * @author agonzalezacevedo
 */
public class Velero extends Barco {

    private int numMastiles;
    private float precio;

    public Velero() {
    }

    public Velero(int numMastiles, String matricula, int dias, float eslora) {
        super(matricula, dias, eslora);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Velero{" + "numMastiles=" + numMastiles + ", precio=" + precio + '}';
    }

    @Override
    public void calcularPrecio() {
        precio = 8 * numMastiles + 10 * super.getEslora() * super.getDias();
    }

}

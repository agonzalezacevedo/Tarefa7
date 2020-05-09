package tarefa7;

/**
 *
 * @author agonzalezacevedo
 */
public class Deportivo extends Barco {

    private float precio;
    private int cv;

    public Deportivo() {
    }

    public Deportivo(int cv, int dias, float eslora, String matricula) {
        super(matricula, dias, eslora);
        this.cv = cv;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Deportivo{" + "precio=" + precio + ", cv=" + cv + '}';
    }

    @Override
    public void calcularPrecio() {
        precio = 2 * cv + 10 * super.getEslora() * super.getDias();
    }

}

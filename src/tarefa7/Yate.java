package tarefa7;

/**
 *
 * @author agonzalezacevedo
 */
public class Yate extends Barco {

    private int cv;
    private float precio;
    private int numCamarotes;

    public Yate() {
    }

    public Yate(int cv, int numCamarotes, String matricula, int dias, float eslora) {
        super(matricula, dias, eslora);
        this.cv = cv;
        this.numCamarotes = numCamarotes;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "cv=" + cv + ", precio=" + precio + ", numCamarotes=" + numCamarotes + '}';
    }

    @Override
    public void calcularPrecio() {
        precio = 2 * cv + 10 * super.getEslora() * super.getDias() + 25 * numCamarotes;
    }

}

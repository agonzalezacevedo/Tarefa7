package tarefa7;

import java.util.ArrayList;

/**
 *
 * @author agonzalezacevedo
 */
public class Tarefa7 {

    public static void main(String[] args) {
        ArrayList<Barco> listaBarco = new ArrayList<>();
        
        Yate y1 = new Yate(3664,355,"AHRSD",35,96);
        Deportivo d1 = new Deportivo(6300,50, 40, "TSHSH");
        Velero v1 = new Velero(6,"AHYYY",23,85);

        y1.calcularPrecio();
        listaBarco.add(y1);
        d1.calcularPrecio();
        listaBarco.add(d1);
        v1.calcularPrecio();
        listaBarco.add(v1);
        
        
        for (int i = 0; i < listaBarco.size(); i++) {
            System.out.println(listaBarco.get(i).toString());
        }

    }
    
}

import Modelo.Barco;
import Modelo.LanchaAmarilla;
import Modelo.Corbeta;
import Modelo.PuertoMDP;

public class Main {
    public static void main(String[] args) {

        PuertoMDP Fabrica1 = new PuertoMDP();

        Barco corbeta1 = new LanchaAmarilla("xmax1","kawasaki",100,100,323,20,3);
        Barco lanchaA1 = new Corbeta("penetron","honda",150,100,341,10);
        Barco corbeta2 = new LanchaAmarilla("xmax2","kawasaki",130,200,324,20,10);


        System.out.println(Fabrica1.agregarBarco(corbeta1));
        System.out.println(Fabrica1.agregarBarco(lanchaA1));
        System.out.println( Fabrica1.agregarBarco(corbeta2));

        System.out.println("\n--------\n");


        System.out.println( Fabrica1.recaudacionTotal());
        System.out.println("\n--------\n");
        System.out.println(Fabrica1.recaudacionPorTipoBarco(corbeta1));
        System.out.println(Fabrica1.recaudacionPorTipoBarco(lanchaA1));





    }
}
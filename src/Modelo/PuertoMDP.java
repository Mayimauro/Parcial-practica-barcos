package Modelo;

import java.util.ArrayList;

public class PuertoMDP {

    private ArrayList<Barco> barcos;


    public PuertoMDP() {
        barcos = new ArrayList<>();
    }

    ///metodos
    public boolean agregarBarco(Barco b)
    {
        int i=0;
        boolean rta = false;
        if(barcos != null)
        {
            while(i<barcos.size() && !barcos.get(i).equals(b))
            {
                i++;
            }
            if(i>=barcos.size())
            {
              barcos.add(b);
               rta = true;
            }

        }else
        {
            barcos.add(b);
            rta = true;
        }
        return rta;
    }

    public int recaudacionTotal()
    {
        int suma =0;
        for(int i=0;i<barcos.size();i++)
        {
                suma = suma + barcos.get(i).calcularPrecioFinal();
        }
        return suma;
    }

    public int recaudacionPorTipoBarco(Barco b)
    {
        int suma =0;
        for(int i=0;i<barcos.size();i++)
        {
            if(b.getClass().isInstance(barcos.get(i))) //si es del mismo tipo
            {
                suma = suma + barcos.get(i).calcularPrecioFinal();
            }
        }
        return suma;


    }



}

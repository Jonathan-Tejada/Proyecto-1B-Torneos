package ec.edu.epn.g12.Soporte;



import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class CargaDeDatos {

    public static ArrayList extraerContenidoBDD(String consulta)  {
        if (consulta.equals("deportes")) {
            ArrayList<String> Lineas = new ArrayList();
            Lineas.add("1 Futbol M U-20");
            Lineas.add("2 Futbol F U-20");
            Lineas.add("3 Futbol M U-17");
            Lineas.add("4 Futbol F U-17");
            Lineas.add("5 Tenis M U-20");
            Lineas.add("6 Tenis F U-20");
            Lineas.add("7 Tenis M U-16");
            Lineas.add("8 Tenis F U-16");
            Lineas.add("9 Tenis M U-13");
            Lineas.add("10 Tenis F U-13");
            Lineas.add("11 Tenis X U-20");
            Lineas.add("12 Tenis X U-20");
            return Lineas;
        }
        else if (consulta.equals("participantes")) {
            ArrayList<String> Lineas = new ArrayList();
            Lineas.add("true,1,Tornado,-,2020-01-12,M,-");
            Lineas.add("false,1750702068,Jonathan,Tejada,2005-03-09,M,1");
            Lineas.add("true,2,Niupi,-,2019-02-21,F,-");
            Lineas.add("false,1750702088,Maria,Sparrow,1964-05-09,F,0");
            Lineas.add("true,3,Fenix,-,2018-03-21,X,-");
            return Lineas;
        }
        else if (consulta.equals("torneos")) {
            ArrayList<String> Lineas = new ArrayList();
            Lineas.add("1,Copa Piston,2021-01-05,2021-06-05,8,true");
            Lineas.add("4,Liga Mena 2,2021-02-14,2021-07-08,16,true");
            Lineas.add("12,Copa Jr. Magdalena,2021-03-09,2021-12-25,32,false");
            Lineas.add("5,Copa Oro,2021-05-09,2021-08-25,32,false");
            return Lineas;
        }else if (consulta.equals("usuario")) {
            ArrayList<String> Lineas = new ArrayList();
            Lineas.add("Juan123,pasw123");
            Lineas.add("Pedrit0123,pasw0987");
            Lineas.add("Luchoxtu,pasw896");
            return Lineas;
        }

        return null;
    }

}
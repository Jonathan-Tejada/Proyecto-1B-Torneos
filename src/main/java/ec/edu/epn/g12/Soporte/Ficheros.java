package ec.edu.epn.g12.Soporte;



import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Ficheros {
    File fichero;
    public static ArrayList muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String Linea;
        ArrayList <String> Lineas = new ArrayList();
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((Linea = b.readLine())!=null) {
            Lineas.add(Linea);
            //System.out.println(Linea);
        }
        b.close();
        return Lineas;
    }

}
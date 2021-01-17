package ec.edu.epn.g12.Objetos;



import java.util.ArrayList;

import static ec.edu.epn.g12.Soporte.CargaDeDatos.extraerContenidoBDD;

public class Deporte {
    private int codigo ;
    private String nombre;
    private String sexo;
    private String categoria;

    public void imprimirDeporte(){
        System.out.println("\t---Deporte---");
        System.out.println("\tCodigo: "+this.codigo);
        System.out.println("\tNombre: "+this.nombre);
        System.out.println("\tSexo: "+this.sexo);
        System.out.println("\tCategoria: "+this.categoria);

    }


    public ArrayList<Deporte> obtenerDeportesBDD() {

        ArrayList<Deporte> ListaDeporte = new ArrayList<>();
        ArrayList<String> contenido;

            contenido = extraerContenidoBDD("deportes");


        for (String linea:contenido) {
            String[] palabras= linea.split(" ");
            Deporte objDeporte= new Deporte();
            objDeporte.setCodigo(Integer.parseInt(palabras[0]));
            objDeporte.setNombre(palabras[1]);
            objDeporte.setSexo(palabras[2]);
            objDeporte.setCategoria(palabras[3]);
            ListaDeporte.add(objDeporte);
        }
        return ListaDeporte;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

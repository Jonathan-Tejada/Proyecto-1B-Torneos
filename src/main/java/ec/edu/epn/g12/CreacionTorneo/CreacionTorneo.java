package ec.edu.epn.g12.CreacionTorneo;

import ec.edu.epn.g12.Objetos.Deporte;
import ec.edu.epn.g12.Objetos.Torneo;
import ec.edu.epn.g12.Objetos.Tenis;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class CreacionTorneo {

    public ArrayList<Deporte> ListaDeporte= new ArrayList<>();
    public Deporte deporteEscogido = new Deporte();
    public Torneo torneoDescrito = new Torneo();
    public Tenis tenisDescrito = new Tenis();

        public CreacionTorneo() {
            Deporte Dpt = new Deporte();
            ListaDeporte = Dpt.obtenerDeportesBDD();

        }

        public String seleccionarDeporte(int idDeporte) {
            for (Deporte objDeporte: ListaDeporte) {
                if (objDeporte.getCodigo()==idDeporte) {
                    deporteEscogido=objDeporte;
                    objDeporte.imprimirDeporte();
                    return objDeporte.getNombre();
                }
            }
            return null;
        }

    public String definirTorneo(Torneo torneoRecibido) {
         if (validarTorneo(torneoRecibido)) {
             torneoDescrito = torneoRecibido;
             torneoRecibido.imprimirTorneo();
             return torneoDescrito.getNombre();
         }
        return null;
    }

    public String definirReglas(Deporte deporteRecibido,String Opcion) {
        switch (deporteRecibido.getNombre()) {
            case "Tenis":
                if (Opcion.equals("Default")){
                    Tenis auxi = new Tenis();
                    auxi.Tenis("");
                    Tenis objTenis = definirTenis(auxi);
                    objTenis.ImprimirTenis();
                return "OK";
                }
                else if (Opcion.equals("Personalizados")){
                    System.out.println("Ingresar los datos Personalizados");
                    //TODO desarrollar ingreso personalizado de parametros;
                }

            case "Futbol":
                //TODO añadir clase Futbol
            case "Ajedrez":
                //TODO añadir clase Ajedrez
                return null;
        }
            return null;
    }

    public Tenis definirTenis(Tenis tenisRecibido){
            //TODO validar Tenis

            tenisDescrito=tenisRecibido;
            return tenisDescrito;
    }

        public boolean validarTorneo(Torneo objTorneo){
        return objTorneo.getNumeroInscritos() >= 0 && objTorneo.getNumeroContendientes() >= 2 &&
                objTorneo.getNumPartidosPorFecha() >= 1 && objTorneo.getNumFechaPorSemana() >= 1 &&
                objTorneo.getFechaInicio().compareTo(objTorneo.getFechaFin())<0 &&
                objTorneo.getFechaInicio().compareTo(new GregorianCalendar())>0;
    }




}


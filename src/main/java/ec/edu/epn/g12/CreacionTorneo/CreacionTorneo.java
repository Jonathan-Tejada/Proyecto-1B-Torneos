package ec.edu.epn.g12.CreacionTorneo;

import ec.edu.epn.g12.Objetos.Deporte;
import ec.edu.epn.g12.Objetos.Torneo;
import ec.edu.epn.g12.Objetos.Tenis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import static ec.edu.epn.g12.Soporte.Ficheros.extraerContenidoDeFichero;

public class CreacionTorneo {

    ArrayList<Deporte> ListaDeporte= new ArrayList<>();
    Deporte deporteEscogido = new Deporte();
    Torneo torneoDescrito = new Torneo();
    Tenis tenisDescrito = new Tenis();

        public CreacionTorneo() {
            Deporte Dpt = new Deporte();
            ListaDeporte = Dpt.obtenerDeportesBDD();

        }

        public String seleccionarDeporte(int idDeporte) {
            for (Deporte objDeporte: ListaDeporte) {
                if (objDeporte.getCodigo()==idDeporte) {
                    deporteEscogido=objDeporte;
                    return objDeporte.getNombre();
                }
            }
            return null;
        }

    public String definirTorneo(Torneo torneoRecibido) {
         if (validarTorneo(torneoRecibido)) {
             torneoDescrito = torneoRecibido;
             return torneoDescrito.getNombre();
         }
        return null;
    }

    public String definirReglas(Deporte deporteRecibido) {
        switch (deporteRecibido.getNombre()) {
            case "Tenis":
                Tenis auxi = new Tenis();
                auxi.Tenis("");
                Tenis objTenis = definirTenis(auxi);
                return "OK";
            case "Futbol":
                //TODO añadir clase Futbol
            case "Ajedrez":
                //TODO añadir clase Ajedrez
                return null;
        }
            return null;
    }

    public Tenis definirTenis(Tenis tenisRecibido){
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


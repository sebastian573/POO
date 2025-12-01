/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//SEBASTIAN PERALTA//
package GESTION;

import CLASES.Cotizacion;

public class GestionCotizacion {

    private Cotizacion[] cotizaciones;
    private int total;

    public GestionCotizacion() {
        cotizaciones = new Cotizacion[50];
        total = 0;
    }

  
    public boolean registrar(Cotizacion cotizacion) {
        if (total == cotizaciones.length) return false;

        if (buscarPorCodigo(cotizacion.getCodigo()) != null) return false;

        cotizaciones[total] = cotizacion;
        total++;
        return true;
    }

 
    public Cotizacion buscarPorCodigo(String codigo) {
        for (int i = 0; i < total; i++) {
            if (cotizaciones[i].getCodigo().equalsIgnoreCase(codigo)) {
                return cotizaciones[i];
            }
        }
        return null;
    }

   
    public Cotizacion[] obtenerCotizacionesAprobadas() {
        int count = 0;

        for (int i = 0; i < total; i++) {
            if ("APROBADA".equalsIgnoreCase(cotizaciones[i].getEstado())) {
                count++;
            }
        }

        Cotizacion[] aprobadas = new Cotizacion[count];
        int index = 0;

        for (int i = 0; i < total; i++) {
            if ("APROBADA".equalsIgnoreCase(cotizaciones[i].getEstado())) {
                aprobadas[index++] = cotizaciones[i];
            }
        }

        return aprobadas;
    }

   
    public Cotizacion[] obtenerCotizacionesPendientes() {
        int count = 0;

        for (int i = 0; i < total; i++) {
            if ("PENDIENTE".equalsIgnoreCase(cotizaciones[i].getEstado())) {
                count++;
            }
        }

        Cotizacion[] pendientes = new Cotizacion[count];
        int index = 0;

        for (int i = 0; i < total; i++) {
            if ("PENDIENTE".equalsIgnoreCase(cotizaciones[i].getEstado())) {
                pendientes[index++] = cotizaciones[i];
            }
        }

        return pendientes;
    }

    
    public String generarCodigoCotizacion() {
        return "COT" + String.format("%04d", total + 1);
    }
}

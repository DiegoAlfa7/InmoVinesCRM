/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertarTest;

import entities.Caracteristicas;
import entities.Direccion;
import entities.Inmuebles;
import entities.Localizacion;
import org.hibernate.Session;
import hibernateUtil.NewHibernateUtil;
import org.hibernate.Transaction;

/**
 *
 * @author Usuario 2 DAM
 */
public class Insertando {

    public static void main(String[] args) {

        Inmuebles inmuebles = new Inmuebles();

        Direccion direccion = new Direccion();

        direccion.setDireccionCalle("C/DE TU PUTA MADRE");
        direccion.setDireccionEscalera("hehe");

        Caracteristicas caracteristicas = new Caracteristicas();

        caracteristicas.setCarpinteriaExterior("to guapa");
        caracteristicas.setEstadoConservacion("ok");

        Localizacion localizacion = new Localizacion();

        localizacion.setPais("ESPAÑA");

        localizacion.setDireccion(direccion);

        Session session = NewHibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        inmuebles.setCaracteristicas(caracteristicas);
        inmuebles.setLocalizacion(localizacion);
        inmuebles.setTextoReclamo("ME LO QUITAN DE LAS MANOS XD");
        inmuebles.setDescripcion("Gracias a este edificio nos van a dar un 10 jajajajajjj");
        
        session.save(inmuebles);
        
        transaction.commit();

    }

}

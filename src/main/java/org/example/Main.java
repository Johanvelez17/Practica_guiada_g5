package org.example;

import org.example.AYUDAS.Licor;
import org.example.MODELOS.Cliente;

import java.time.LocalDate;

public class Main {
    public static void main (String [] args){

    Licor licorUno = new Licor ();
    Licor licorDos = new Licor ("Aguardiente antioqueño tapa verde", "Aguardiente", "FLA", 30000.0,LocalDate.of(2028,10,12));

    Cliente clienteUno = new Cliente ();
    Cliente clienteDos = new Cliente ("JOHAN", "3005265313", "1011395887", "JOHAN123@gmail.com", 20 );

        //ACCEDIENDO A LOS ATRIBUTOS

        System.out.println(licorUno.getNombre());
        System.out.println(licorDos.getNombre());
    }



}
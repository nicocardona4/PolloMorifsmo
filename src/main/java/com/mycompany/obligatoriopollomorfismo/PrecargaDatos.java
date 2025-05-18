/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obligatoriopollomorfismo;

import dominio.Cliente;
import dominio.Gestor;
import servicios.Fachada;

/**
 *
 * @author maurizio
 */
public class PrecargaDatos {
    public static void cargar() {
        Fachada f = Fachada.getInstancia();

        Cliente juan = new Cliente("Juan Perez", "juan", "123");
        f.agregar(juan);

        Cliente pedro = new Cliente("Pedro Picapiedra", "pedro", "1234");
        f.agregar(pedro);

        Cliente pablo = new Cliente("Pablo Marmol", "pablo", "12345");
        f.agregar(pablo);

        Gestor admin1 = new Gestor("Administrador #1", "admin", "admin");
        f.agregar(admin1);

        Gestor admin2 = new Gestor("Administrador #2", "admin2", "admin");
        f.agregar(admin2);
    }
}

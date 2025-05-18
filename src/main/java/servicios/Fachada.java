/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import dominio.Cliente;
import dominio.Gestor;

/**
 *
 * @author maurizio
 */
public class Fachada {
    private static Fachada instancia = new Fachada();

    private ServicioUsuario servicioUsuario;
    
    public static Fachada getInstancia() {
        return instancia;
    }

    private Fachada() {
        servicioUsuario = new ServicioUsuario();
    }
    
    public Gestor loginGestor(String usuario, String password) {
        return servicioUsuario.login(Gestor.class, usuario, password);
    }

    public Cliente loginCliente(String usuario, String password) {
        return servicioUsuario.login(Cliente.class, usuario, password);
    }

    public void agregar(Cliente cliente) {
        servicioUsuario.agregar(cliente);
    }

    public void agregar(Gestor gestor) {
        servicioUsuario.agregar(gestor);
    }
}

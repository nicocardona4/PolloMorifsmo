/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author maurizio
 */

public abstract class Usuario {

    public Usuario(String nombreCompleto, String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
    }

    private String nombre;
    private String password;
    private String nombreCompleto;

    public String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esValido(String password) {
        return getPassword().equals(password);
    }

    private String getPassword() {
        return password;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }
}

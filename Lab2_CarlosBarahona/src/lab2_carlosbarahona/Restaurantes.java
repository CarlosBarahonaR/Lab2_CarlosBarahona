/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_carlosbarahona;

/**
 *
 * @author Admin
 */
public class Restaurantes {
    private String franquicia;
    private String nombre;
    private String ubicacion;
    private int empleados;
    private boolean parqueo;
    private boolean juegos;
    private int mesas;
    private int cajeros;
    private String gerente;
    private String especialidad;
    private String estado;

    public Restaurantes() {
    }

    public Restaurantes(String franquicia, String nombre, String ubicacion, int empleados, boolean parqueo, boolean juegos, int mesas, int cajeros, String gerente, String especialidad, String estado) {
        this.franquicia = franquicia;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.empleados = empleados;
        this.parqueo = parqueo;
        this.juegos = juegos;
        this.mesas = mesas;
        this.cajeros = cajeros;
        this.gerente = gerente;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public boolean getParqueo() {
        return parqueo;
    }

    public void setParqueo(boolean parqueo) {
        this.parqueo = parqueo;
    }

    public boolean getJuegos() {
        return juegos;
    }

    public void setJuegos(boolean juegos) {
        this.juegos = juegos;
    }

    public int getMesas() {
        return mesas;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    public int getCajeros() {
        return cajeros;
    }

    public void setCajeros(int cajeros) {
        this.cajeros = cajeros;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Restaurantes{" + "franquicia=" + franquicia + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", empleados=" + empleados + ", parqueo=" + parqueo + ", juegos=" + juegos + ", mesas=" + mesas + ", cajeros=" + cajeros + ", gerente=" + gerente + ", especialidad=" + especialidad + ", estado=" + estado + '}';
    }
    
    
    

    
    
    
}

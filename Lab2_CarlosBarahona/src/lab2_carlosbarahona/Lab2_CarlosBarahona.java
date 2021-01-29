/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_carlosbarahona;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Lab2_CarlosBarahona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList Restaurantes = new ArrayList();
        int opcion = 0;
        String usuario = JOptionPane.showInputDialog("Ingrese su usuario");
        String contraseña = JOptionPane.showInputDialog("Ingrese su contraseña");
        if (usuario == "david" && contraseña == "99") {

            while (opcion != 3) {
                opcion = Integer.parseInt(
                        JOptionPane.showInputDialog("1-	Reporte restaurantes\n"
                                + "2-	Manejo de restaurantes\n"
                                + "3-	Salir\n")
                );

                if (opcion == 1) {

                    while (opcion != 4) {
                        opcion = Integer.parseInt(
                                JOptionPane.showInputDialog("1-	Reporte 1\n"
                                        + "2-	Reporte 2\n"
                                        + "3-	Reporte 3\n"
                                )
                        );

                        if (opcion == 1) {

                            String e
                                    = JOptionPane.showInputDialog("Ingrese el estado que desea mirar: (Demolicion, Funcional y Remodelacion)");
                            String salida = "";
                            for (Object d : Restaurantes) {
                                d = (Restaurantes) d;

                            }

                            if (opcion == 2) {

                            }

                            if (opcion == 3) {

                            }

                        }

                        if (opcion == 2) {

                            while (opcion != 5) {
                                opcion = Integer.parseInt(
                                        JOptionPane.showInputDialog("1-	Crear\n"
                                                + "2-	Listar\n"
                                                + "3-	Modificar\n"
                                                + "4-	Eliminar\n"
                                        )
                                );

                                if (opcion == 1) {

                                    String f
                                            = JOptionPane.showInputDialog("Ingrese franquicia");
                                    String n
                                            = JOptionPane.showInputDialog("Ingrese nombre");
                                    String u
                                            = JOptionPane.showInputDialog("Ingrese ubicacion");
                                    int e
                                            = Integer.parseInt(JOptionPane.showInputDialog("Ingrese empleados"));
                                    String p
                                            = JOptionPane.showInputDialog("Parqueo(Si/no)");
                                    boolean resp1;
                                    if (p == "Si" || p == "si") {
                                        resp1 = true;
                                    } else {
                                        resp1 = false;
                                    }
                                    String j
                                            = JOptionPane.showInputDialog("Juegos(Si/no)");
                                    boolean resp2;
                                    if (j == "Si" || j == "si") {
                                        resp2 = true;
                                    } else {
                                        resp2 = false;
                                    }
                                    int m
                                            = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mesas"));
                                    int c
                                            = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cajeros"));
                                    String g
                                            = JOptionPane.showInputDialog("Ingrese gerente");
                                    String ed
                                            = JOptionPane.showInputDialog("Ingrese especialidad");
                                    String eo
                                            = JOptionPane.showInputDialog("Ingrese estado");
                                    Restaurantes.add(new Restaurantes(f, n, u, e, resp1, resp2, m, c, g, ed, eo));
                                }

                                if (opcion == 2) {
                                    String salida = "";
                                    for (Object t : Restaurantes) {
                                        if (t instanceof Restaurantes) {
                                            salida += Restaurantes.indexOf(t) + "- " + t + "\n";
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, salida);
                                }

                                if (opcion == 3) {
                                    int p = Integer.parseInt(
                                            JOptionPane.showInputDialog("Ingrese posicion del "
                                                    + "restaurante a modificar")
                                    );
                                    String mod
                                            = JOptionPane.showInputDialog("Ingrese lo que desea modificar");

                                    if (mod == "franquicia" || mod == "Franquicia") {
                                        if (Restaurantes.get(p) instanceof Restaurantes) {
                                            String f
                                                    = JOptionPane.showInputDialog("Ingrese la nueva franquicia");

                                            ((Restaurantes) Restaurantes.get(p)).setFranquicia(f);

                                        } else {
                                            JOptionPane.showMessageDialog(null, "La posicion no se encuentra");
                                        }

                                    }
                                    if (mod == "nombre" || mod == "Nombre") {
                                        if (Restaurantes.get(p) instanceof Restaurantes) {
                                            String f
                                                    = JOptionPane.showInputDialog("Ingrese la nuevo nombre");

                                            ((Restaurantes) Restaurantes.get(p)).setNombre(f);

                                        } else {
                                            JOptionPane.showMessageDialog(null, "La posicion no se encuentra");
                                        }

                                    }
                                    if (mod == "ubicacion" || mod == "Ubicacion") {
                                        if (Restaurantes.get(p) instanceof Restaurantes) {
                                            String f
                                                    = JOptionPane.showInputDialog("Ingrese la nueva ubicacion");

                                            ((Restaurantes) Restaurantes.get(p)).setUbicacion(f);

                                        } else {
                                            JOptionPane.showMessageDialog(null, "La posicion no se encuentra");
                                        }

                                    }
                                    if (mod == "empleados" || mod == "Empleados") {
                                        if (Restaurantes.get(p) instanceof Restaurantes) {
                                            int f
                                                    = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de empleados"));

                                            ((Restaurantes) Restaurantes.get(p)).setEmpleados(f);

                                        } else {
                                            JOptionPane.showMessageDialog(null, "La posicion no se encuentra");
                                        }

                                    }
                                    if (mod == "parqueo" || mod == "Parqueo") {
                                        if (Restaurantes.get(p) instanceof Restaurantes) {
                                            String f
                                                    = JOptionPane.showInputDialog("Ingrese (Si/No) hay parqueo");
                                            boolean resp1;
                                            if (f == "Si" || f == "si") {
                                                resp1 = true;
                                            } else {
                                                resp1 = false;
                                            }
                                            ((Restaurantes) Restaurantes.get(p)).setParqueo(resp1);

                                        } else {
                                            JOptionPane.showMessageDialog(null, "La posicion no se encuentra");
                                        }

                                    }
                                    if (mod == "juegos" || mod == "Juegos") {
                                        if (Restaurantes.get(p) instanceof Restaurantes) {
                                            String f
                                                    = JOptionPane.showInputDialog("Ingrese (Si/No) hay juegos");
                                            boolean resp1;
                                            if (f == "Si" || f == "si") {
                                                resp1 = true;
                                            } else {
                                                resp1 = false;
                                            }
                                            ((Restaurantes) Restaurantes.get(p)).setParqueo(resp1);

                                        } else {
                                            JOptionPane.showMessageDialog(null, "La posicion no se encuentra");
                                        }

                                    }
                                    if (mod == "mesas" || mod == "Mesas") {
                                        if (Restaurantes.get(p) instanceof Restaurantes) {
                                            int f
                                                    = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de empleados"));
                                            ((Restaurantes) Restaurantes.get(p)).setMesas(f);

                                        } else {
                                            JOptionPane.showMessageDialog(null, "La posicion no se encuentra");
                                        }

                                    }
                                    if (mod == "cajeros" || mod == "Cajeros") {
                                        if (Restaurantes.get(p) instanceof Restaurantes) {
                                            int f
                                                    = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de cajeros"));
                                            ((Restaurantes) Restaurantes.get(p)).setCajeros(f);

                                        } else {
                                            JOptionPane.showMessageDialog(null, "La posicion no se encuentra");
                                        }

                                    }
                                    if (mod == "gerente" || mod == "Gerente") {
                                        if (Restaurantes.get(p) instanceof Restaurantes) {
                                            String f
                                                    = JOptionPane.showInputDialog("Ingrese el nuevo nombre del gerente");
                                            ((Restaurantes) Restaurantes.get(p)).setGerente(f);

                                        } else {
                                            JOptionPane.showMessageDialog(null, "La posicion no se encuentra");
                                        }

                                    }
                                    if (mod == "especialidad" || mod == "Especialidad") {
                                        if (Restaurantes.get(p) instanceof Restaurantes) {
                                            String f
                                                    = JOptionPane.showInputDialog("Ingrese la nueva especialidad");
                                            ((Restaurantes) Restaurantes.get(p)).setEspecialidad(f);

                                        } else {
                                            JOptionPane.showMessageDialog(null, "La posicion no se encuentra");
                                        }
                                    }
                                }

                                if (opcion == 4) {
                                    int p = Integer.parseInt(
                                            JOptionPane.showInputDialog("Ingrese posicion del "
                                                    + "restaurante a eliminar")
                                    );
                                    if (Restaurantes.get(p) instanceof Restaurantes) {
                                        Restaurantes.remove(p);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "La posicion es incorrecta");
                                    }

                                }

                            }
                        }

                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
        }
    }
}

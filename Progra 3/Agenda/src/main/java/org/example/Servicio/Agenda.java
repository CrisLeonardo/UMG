package org.example.Servicio;

import org.example.Modelo.Contacto;
import org.example.Modelo.NodoContacto;

import java.io.*;
import java.time.LocalDate;

public class Agenda {
    private NodoContacto raiz;

    public Agenda() {
        this.raiz = null;
    }

    public void agregarContacto(String nombre, long telefono, String correoElectronico, LocalDate fechaNacimiento) {
        Contacto nuevoContacto = new Contacto(nombre, telefono, correoElectronico, fechaNacimiento);
        if (this.raiz == null) {
            this.raiz = new NodoContacto(nuevoContacto);
        } else {
            this.insertar(this.raiz, nuevoContacto);
        }
    }

    private void insertar(NodoContacto padre, Contacto contacto) {
        if (contacto.getNombre().compareTo(padre.getContacto().getNombre()) < 0) {
            if (padre.getIzdo() == null) {
                padre.setIzdo(new NodoContacto(contacto));
            } else {
                insertar(padre.getIzdo(), contacto);
            }
        } else if (contacto.getNombre().compareTo(padre.getContacto().getNombre()) > 0) {
            if (padre.getDcho() == null) {
                padre.setDcho(new NodoContacto(contacto));
            } else {
                insertar(padre.getDcho(), contacto);
            }
        }
    }

    public Contacto buscarContacto(String criterio) {
        return buscar(this.raiz, criterio);
    }

    private Contacto buscar(NodoContacto nodo, String criterio) {
        if (nodo == null) {
            return null;
        }
        if (criterio.equals(nodo.getContacto().getNombre()) ||
                criterio.equals(String.valueOf(nodo.getContacto().getTelefono())) ||
                criterio.equals(nodo.getContacto().getCorreoElectronico())) {
            return nodo.getContacto();
        }
        Contacto encontrado = buscar(nodo.getIzdo(), criterio);
        if (encontrado != null) {
            return encontrado;
        }
        return buscar(nodo.getDcho(), criterio);
    }

    public Contacto buscar(Contacto contacto) {
        return buscarPorContacto(this.raiz, contacto);
    }

    private Contacto buscarPorContacto(NodoContacto nodo, Contacto contacto) {
        if (nodo == null) {
            return null;
        }
        if ((contacto.getNombre() != null && contacto.getNombre().equals(nodo.getContacto().getNombre())) ||
                (contacto.getTelefono() != 0 && contacto.getTelefono() == nodo.getContacto().getTelefono()) ||
                (contacto.getCorreoElectronico() != null && contacto.getCorreoElectronico().equals(nodo.getContacto().getCorreoElectronico()))) {
            return nodo.getContacto();
        }
        Contacto encontrado = buscarPorContacto(nodo.getIzdo(), contacto);
        if (encontrado != null) {
            return encontrado;
        }
        return buscarPorContacto(nodo.getDcho(), contacto);
    }

    public void eliminarContacto(String nombre) {
        this.raiz = eliminar(this.raiz, nombre);
    }

    private NodoContacto eliminar(NodoContacto nodo, String nombre) {
        if (nodo == null) {
            return null;
        }
        if (nombre.compareTo(nodo.getContacto().getNombre()) < 0) {
            nodo.setIzdo(eliminar(nodo.getIzdo(), nombre));
        } else if (nombre.compareTo(nodo.getContacto().getNombre()) > 0) {
            nodo.setDcho(eliminar(nodo.getDcho(), nombre));
        } else {
            if (nodo.getIzdo() == null) {
                return nodo.getDcho();
            } else if (nodo.getDcho() == null) {
                return nodo.getIzdo();
            }

            NodoContacto temp = minValorNodo(nodo.getDcho());
            nodo.getContacto().setTelefono(temp.getContacto().getTelefono());
            nodo.getContacto().setNombre(temp.getContacto().getNombre());
            nodo.setDcho(eliminar(nodo.getDcho(), temp.getContacto().getNombre()));
        }
        return nodo;
    }

    private NodoContacto minValorNodo(NodoContacto nodo) {
        NodoContacto actual = nodo;
        while (actual.getIzdo() != null) {
            actual = actual.getIzdo();
        }
        return actual;
    }

    public void mostrarContactos() {
        inOrden(this.raiz);
    }

    private void inOrden(NodoContacto nodo) {
        if (nodo != null) {
            inOrden(nodo.getIzdo());
            System.out.println("Nombre: " + nodo.getContacto().getNombre() + ", Teléfono: " + nodo.getContacto().getTelefono() +
                    ", Correo Electrónico: " + nodo.getContacto().getCorreoElectronico() + ", Fecha de Nacimiento: " + nodo.getContacto().getFechaNacimiento());
            inOrden(nodo.getDcho());
        }
    }



    // Método para serializar (guardar) la agenda en un archivo
    public void guardarAgenda(String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(this.raiz); // Serializa el nodo raíz del árbol
            System.out.println("Agenda guardada exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para deserializar (cargar) la agenda desde un archivo
    public void cargarAgenda(String nombreArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            this.raiz = (NodoContacto) ois.readObject(); // Deserializa el nodo raíz del árbol
            System.out.println("Agenda cargada exitosamente desde " + nombreArchivo);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Contacto buscarContactoPorFechaNacimiento(LocalDate fechaNacimiento) {
        return buscarPorFechaNacimiento(this.raiz, fechaNacimiento);
    }
    private Contacto buscarPorFechaNacimiento(NodoContacto nodo, LocalDate fechaNacimiento) {
        if (nodo == null) {
            return null;
        }
        if (fechaNacimiento.equals(nodo.getContacto().getFechaNacimiento())) {
            return nodo.getContacto();
        }
        Contacto encontrado = buscarPorFechaNacimiento(nodo.getIzdo(), fechaNacimiento);
        if (encontrado != null) {
            return encontrado;
        }
        return buscarPorFechaNacimiento(nodo.getDcho(), fechaNacimiento);
    }
}

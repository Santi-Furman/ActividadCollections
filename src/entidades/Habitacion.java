
package entidades;

import java.util.Objects;


public class Habitacion {
    
    //Atributos
    
    private Integer numero;
    private boolean ocupado = false;
    private Integer size;
    
    //Constructores

    public Habitacion() {
    }

    public Habitacion(Integer numero, Integer size) {
        this.numero = numero;
        this.size = size;
    }
    
    //Getters y setters

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.numero);
        hash = 89 * hash + (this.ocupado ? 1 : 0);
        hash = 89 * hash + Objects.hashCode(this.size);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Habitacion other = (Habitacion) obj;
        if (this.ocupado != other.ocupado) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.size, other.size)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numero=" + numero + ", ocupado=" + ocupado + ", size=" + size + '}';
    }
    
    
    
    
}

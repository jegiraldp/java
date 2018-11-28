
package pqtcelular;

import java.io.Serializable;

public class celular implements Serializable {
    
    private int codigo;
    private int numero;
    private int saldo;
    private String marca;
    private persona duenio;

    public celular(int codigo, int numero, int saldo, String marca, persona duenio) {
        this.codigo = codigo;
        this.numero = numero;
        this.saldo = saldo;
        this.marca = marca;
        this.duenio = duenio;
    }//celular

    public int getCodigo() {
        return codigo;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getMarca() {
        return marca;
    }

    public persona getDuenio() {
        return duenio;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
}//clase

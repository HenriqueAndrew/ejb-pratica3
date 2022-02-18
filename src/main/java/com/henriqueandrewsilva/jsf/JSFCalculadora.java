
package com.henriqueandrewsilva.jsf;

import com.henriqueandrewsilva.rems.iCalculadora;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

// @author Henrique Andrew da Silva

@Named(value = "jSFCalculadora")
@RequestScoped
public class JSFCalculadora {

    @EJB
    private iCalculadora eJBCalculadora;

    /**
     * Creates a new instance of JSFCalculadora
     */ 
    
    public JSFCalculadora() {
    }
    
    private int valor;       

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
        
    public void fatorial(){
        this.valor = eJBCalculadora.fatorial(valor);        
    }
    
    
}

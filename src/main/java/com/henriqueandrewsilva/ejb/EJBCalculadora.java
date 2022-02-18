
package com.henriqueandrewsilva.ejb;

import javax.ejb.Stateless;

// @author Henrique Andrew da Silva

@Stateless
public class EJBCalculadora implements com.henriqueandrewsilva.rems.iCalculadora{

    @Override
    public int fatorial(int valor) {
        if(valor==1) return 1;
        return valor*fatorial(valor-1);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}

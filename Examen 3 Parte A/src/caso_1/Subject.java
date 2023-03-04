
package caso_1;

import java.util.ArrayList;
import java.util.List;


public interface Subject {

    
    
    public void registrar_Observadores(Observador o);
    public void remover_Observadores(Observador o);
    public void notificar_Observadores();
    
}

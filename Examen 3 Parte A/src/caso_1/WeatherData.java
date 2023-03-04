
package caso_1;

import java.util.ArrayList;


public class WeatherData implements Subject {
    
    private ArrayList<Observador> observadores;
    
    float presion;
    float temp;
    float humedad;
    
    public WeatherData() {
        
        observadores = new ArrayList<>();
        
    }
    

    @Override
    public void registrar_Observadores(Observador o) {
         observadores.add(o);
    }

    @Override
    public void remover_Observadores(Observador o) {
        
    
        int i = observadores.indexOf(o);
        if (i >= 0) {
            
        observadores.remove(i);
        
        }
    }

    @Override
    public void notificar_Observadores() {
        
        for (int i = 0; i < observadores.size(); i++) {
            Observador observer = (Observador)observadores.get(i);
            observer.actualizar(temp, humedad, presion);
        }
   
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temp = temperature;
        this.humedad = humidity;
        this.presion = pressure;
        notificar_Observadores();
    }
    
    public float getTemp() {
        return temp;
    }
    
    public float getHumedad() {
       return humedad;
    }
 
    public float getPressure() {
       return presion;
    }
}
    
    
    
    
    


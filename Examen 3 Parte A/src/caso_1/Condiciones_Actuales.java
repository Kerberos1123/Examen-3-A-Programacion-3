
package caso_1;

    public class Condiciones_Actuales implements Observador {
    
        private float temperatura;
        
        private float humedad;
        
        private Subject weatherData;
 
    public Condiciones_Actuales(Subject weatherData) {
     
        this.weatherData = weatherData;
        weatherData.registrar_Observadores(this);
    
     }
 
    public void display() {
        
        System.out.println("");
        System.out.println("///////////////////////////////");
        System.out.println("Condiciones Actuales");
        System.out.println("La condicion actual es: " + temperatura + " grados celcius y " + humedad + "% humedad");
  
    }

    @Override
    public void actualizar(float temp, float humedad, float presion) {
        
        this.temperatura = temp;
        
        this.humedad = humedad;
        
        display(); 
        
    }
    
}

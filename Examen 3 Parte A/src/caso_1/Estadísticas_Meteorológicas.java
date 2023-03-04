
package caso_1;


public class Estadísticas_Meteorológicas implements Observador{
    
    private float temperatura_Maxima = 0.0f;
    
    private float temperatura_Minima = 200;
    
    private float temperatura_Promedio = 0.0f;
    
    private int aux;
    
    private WeatherData weatherData;
    
    public Estadísticas_Meteorológicas(WeatherData weatherData) {
        
        this.weatherData = weatherData;
    
        weatherData.registrar_Observadores(this);
    
    }


    public void display() {
       
        System.out.println("");
        System.out.println("///////////////////////////////");
        System.out.println("Estadísticas Meteorológicas");
        System.out.println("Temperatura promedio: " + temperatura_Promedio / aux);
        
        System.out.println("Temperatura Maxima: " + temperatura_Maxima);
        
        System.out.println("Temperatura Minima:" + temperatura_Minima);
    }

    @Override
    public void actualizar(float temp, float humedad, float presion) {
        
        temperatura_Promedio += temp;
        
        aux++;

        if (temp > temperatura_Maxima) {
            
              temperatura_Maxima = temp;
              
        }
 
        if (temp < temperatura_Minima) {
            
            temperatura_Minima = temp;
            
        }

        display();
    
    }
}

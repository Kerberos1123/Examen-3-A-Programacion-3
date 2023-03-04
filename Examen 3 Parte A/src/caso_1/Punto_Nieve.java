
package caso_1;


class Punto_Nieve implements Observador {
    
    private WeatherData weatherData;
    
    private float punto_Nieve = 0.0f;

    Punto_Nieve(WeatherData weatherData) {
        
        this.weatherData = weatherData;
    
        weatherData.registrar_Observadores(this);
       
    }
    
    public void display(int aux) {
        
        if(aux == 1){
            
            
            System.out.println("");
            System.out.println("///////////////////////////////");
            System.out.println("Punto de Nieve");
            System.out.println("Cuando la temperatura es ligeramente superior a los 0°C, "
            + "los copos de nieve se derriten");
        
            System.out.println("No hay probabilidad de nieve");
        
        }else{
            
            System.out.println("");
            System.out.println("Si hay probabilidad de nieve");
        }

     }

    @Override
    public void actualizar(float temp, float humedad, float presion) {
       
        if(temp>punto_Nieve){
            display(1);
        }else{
            display(2);
        
        } 
    }
}

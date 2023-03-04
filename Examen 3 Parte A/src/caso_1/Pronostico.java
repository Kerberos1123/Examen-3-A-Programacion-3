
package caso_1;


public class Pronostico implements Observador{
    
    private float presion_actual = 34.87f;  
    private float ultima_presion;
    private WeatherData weatherData;

    public Pronostico( WeatherData weatherData) {
       
        this.weatherData = weatherData;
        weatherData.registrar_Observadores(this);
    }

    public void display(){
        System.out.println("");
        System.out.println("///////////////////////////////");
        System.out.print("El Pronostico es: ");
        
        if (presion_actual > ultima_presion) {
            
            System.out.println("El clima mejorara pronto!");
            
        } else if (presion_actual == ultima_presion) {
            
            System.out.println("El clima se mantendra igual");
            
        } else if (presion_actual < ultima_presion) {
            
            System.out.println("El clima sera  nublado con fuertes vientos y probable lluvia");
            
        }
    }

    @Override
    public void actualizar(float temp, float humedad, float presion) {
        
        ultima_presion = presion_actual;
        presion_actual = presion;
        display();
    
    }
}

    
    
    

   


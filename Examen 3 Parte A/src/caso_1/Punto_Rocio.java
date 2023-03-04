
package caso_1;


public class Punto_Rocio implements Observador{
    
    private WeatherData weatherData;
    
    private float punto_Rocio = 0.0f;

    public Punto_Rocio(WeatherData weatherData) {
        
        this.weatherData = weatherData;
    
        weatherData.registrar_Observadores(this);
    }
    
    
    public void display() {
        
        System.out.println("");
        System.out.println("///////////////////////////////");
        System.out.println("Punto De Rocio");
        System.out.println("El punto de rocío es la temperatura más alta a la que empieza a condensarse el vapor de agua "
        + "contenido en el aire, produciendo rocío, neblina, cualquier tipo de nube o, en caso de que la temperatura sea lo suficientemente baja, escarcha.");
        
        System.out.println("Nuestro punto de rocio es: " + punto_Rocio);
        
    
    }

    @Override
    public void actualizar(float temp, float humedad, float presion) {
        
        punto_Rocio =  (float) ((float) Math.sqrt(humedad / 100) * (112 +0.9 * temp)- 110);
        
        display();
        
    }
    
}


package caso_1;

import java.util.Scanner;


public class Caso_1 {

    
    public static void main(String[] args) {
        
        WeatherData weatherData = new WeatherData();
        
        Condiciones_Actuales display_Actual =  new Condiciones_Actuales(weatherData);
        
        Estadísticas_Meteorológicas display_Estadísticas = new Estadísticas_Meteorológicas(weatherData);
        
        Pronostico display_Pronostico = new Pronostico(weatherData);
        
        Punto_Rocio  display_Punto_Rocio = new Punto_Rocio(weatherData);
        
        Punto_Nieve display_Punto_Nieve = new Punto_Nieve(weatherData);
        
        Scanner capt = new Scanner(System.in);
        
        System.out.println("-------Weather Monitoring Station-------");
        
        System.out.println("Ingrese Temperatura: ");
        float t = capt.nextFloat();
        
        System.out.println("Ingrese Humedad: ");
        float h = capt.nextFloat();
        
        System.out.println("Ingrese Presion: ");
        float p = capt.nextFloat();
        
        weatherData.setMeasurements(t,h,p);
     
    }
    
}

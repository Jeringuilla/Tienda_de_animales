
package tienda_de_animales;

public class Carrusel_perros {
    public enum lista{perro1,perro2,perro3}
    public lista carrusel;
    public int longitud = lista.values().length;
    
    public String ver_foto(int posicion){
        switch(posicion){
            case 0:{
                return carrusel.perro1.name();
            }
            case 1:{
                return carrusel.perro2.name();
            }            
            case 2:{
                return carrusel.perro3.name();
            }
        }
        return "Error";
    }
}

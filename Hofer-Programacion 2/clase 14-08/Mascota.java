
//crear primera clase: mascota

public class Mascota {
    String nombre;
    //tobi, roco, etc.
    int edad;
    // 10, 5, 3, etc, años.
    String especie;
    //"perro", "gato", etc.
    
    public void habla () {
        if (this.especie.equals("perro")) {
            System.out.println("¡guau, guau!");
        }
            else {
                if (this.especie.equals("gato")) {
                System.out.println("¡miau, miau!");
                }
                else {
                    System.out.println("error");
                }
        }
    }
    public void identificarse() {
        System.out.println("nombre:" + this.nombre);
        System.out.println("especie" + this.especie);
        System.out.println("edad" + this.edad);
        System.out.println("me llamo" +this.nombre + "soy un" + this.especie + "y tengo" + this.edad);
    }
}

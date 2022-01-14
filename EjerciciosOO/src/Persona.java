public class Persona {
    private String nombre,dni;
    private int edad;
    private float peso,altura;
    private Sexo sexo;

    public enum Sexo{
        H,M
    }

    public Persona() {
        nombre = "";
        edad = 0;
        peso = 0;
        altura = 0;
        sexo = Sexo.H;
        generarDNI();

    }

    public Persona(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        peso = 0;
        altura = 0;
        generarDNI();

    }

    public Persona(String nombre, int edad, float peso, float altura, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        generarDNI();

    }

    public int calcularIMC(){
        if ((peso/(altura*altura))<18.5) {
            return -1;
        }else if((peso/(altura*altura))>18.5 && (peso/(altura*altura)<24.99)){
            return 0;
        }else{
            return 1;
        }
    }
    public boolean esMayorDeEdad(){
        return edad<18;
    }
    private void comprobarSexo(Sexo sexo){
        if (sexo!=Sexo.H && sexo!=Sexo.M )
                this.sexo=Sexo.H;
    }
    private String generarDNINumeros(){
        String salida="";
        for(int i = 0; i < 8;i++)
            salida += String.valueOf(Math.random() * 9 + 1);
        return salida;
    }

    @Override
    public String toString() {
        return " Persona{" +
                " nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                ", sexo=" + sexo +
                '}';
    }

    private String generarDNI(){
        String salida = generarDNINumeros();
        switch (Integer.parseInt(salida)%23) {
            case 0:
                salida += "T";
                break;
            case 1:
                salida += "R";
                break;
            case 2:
                salida += "W";
                break;
            case 3:
                salida += "A";
                break;
            case 4:
                salida += "G";
                break;
            case 5:
                salida += "M";
                break;
            case 6:
                salida += "Y";
                break;
            case 7:
                salida += "F";
                break;
            case 8:
                salida += "P";
                break;
            case 9:
                salida += "D";
                break;
            case 10:
                salida += "X";
                break;
            case 11:
                salida += "B";
                break;
            case 12:
                salida += "N";
                break;
            case 13:
                salida += "J";
                break;
            case 14:
                salida += "Z";
                break;
            case 15:
                salida += "S";
                break;
            case 16:
                salida += "Q";
                break;
            case 17:
                salida += "V";
                break;
            case 18:
                salida += "H";
                break;
            case 19:
                salida += "L";
                break;
            case 20:
                salida += "C";
                break;
            case 21:
                salida += "K";
                break;
            case 22:
                salida += "E";
                break;
        }
        return salida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}

public class Main {


    public static boolean comprobarSexo(char v) {
        return v == 'H';
    }

    public static void main(String[] args) {
        int edad;
        String nombre;
        float peso, altura;
        char tipoSexo;

        nombre = Input.getString("Inserta el nombre");
        edad = Input.getInteger("Inserta la edad");
        tipoSexo = Input.getChar("Inserta el sexo (H/M)");
        peso = Input.getFloat("Inserta el peso");
        altura = Input.getFloat("Inserta la altura");

// persona1 todos los parametros dados mediante el contructor, persona2 todos los parametros menos peso y altura, y persona3 todos los parametros puestos mediante getters

        Persona persona1 = (comprobarSexo(tipoSexo)) ? new Persona(nombre, edad, peso, altura, Persona.Sexo.H) : new Persona(nombre, edad, peso, altura, Persona.Sexo.M);

        Persona persona2 = (comprobarSexo(tipoSexo)) ? new Persona(nombre, edad, Persona.Sexo.H) : new Persona(nombre, edad, Persona.Sexo.M);

        Persona persona3 = new Persona();
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setAltura(altura);
        persona3.setPeso(peso);

        if (comprobarSexo(tipoSexo)) {
            persona3.setSexo(Persona.Sexo.H);
        }else{
            persona3.setSexo(Persona.Sexo.M);
        }




    }


}

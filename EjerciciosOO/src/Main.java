public class Main {


    public static boolean comprobarSexo(char v) {
        return v == 'H';
    }

    public static String comprobarPesoIdeal(Persona persona){
        if (persona.calcularIMC() == -1){
            return "Estas por debajo del peso recomendado";
        }else if (persona.calcularIMC() == 0){
            return "Estas en tu peso recomendado";
        }else{
            return "Estas por encima de tu peso recomendado";
        }
    }

    public static String comprobarEdad(Persona persona) {
        if (persona.getEdad()>18) return "Es mayor de 18";
        return "no es mayor de 18";
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

        //Peso ideal
        System.out.println(comprobarPesoIdeal(persona1));

        System.out.println(comprobarPesoIdeal(persona2));

        System.out.println(comprobarPesoIdeal(persona3));

        //Mayor de edad

        System.out.println(comprobarEdad(persona1));

        System.out.println(comprobarEdad(persona2));

        System.out.println(comprobarEdad(persona3));

        //mostrar informacion

        System.out.println(persona1.toString());

        System.out.println(persona2.toString());

        System.out.println(persona3.toString());
    }


}

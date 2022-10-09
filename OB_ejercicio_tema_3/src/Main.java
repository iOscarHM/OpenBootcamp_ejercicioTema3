public class Main {
    public static void main(String[] args) {
        //Parte 1
        suma(10, 5, 20);

        //Parte 2
        coche miCoche;
        miCoche = new coche();
        miCoche.sumarPuertas();
        System.out.println(miCoche.numeroPuertas);
    }

    //Parte 1
    public static void suma(int a, int b, int c){
        int resultado = a + b + c;

        System.out.println(resultado);
    }
    //Parte 2
    public static class coche{
        public int numeroPuertas = 4;

        public void sumarPuertas(){
            this.numeroPuertas++;
        }

    }

}


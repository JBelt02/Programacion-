public class ejercicio40{//ejercicio40
    public static void main(String[] args) {
        int opcion;
        int a=2 ;
        int b=3 ;

        do{
            System.out.println("1.-Suma , 2,-Resta , 3.-Multiplicacion , 4.-Division , 5.-Salir");
            opcion= t.nextint();
            switch(opcion){
                case 1 : system.out.println("La suma es"+(a+b));
                    break;
                case 2 : system.out.println("La resta es"+(a-b));
                    break;
                case 3 : system.out.println("La multiplicacion es"+(a*b));
                    break;
                case 4 : if(b==0){
                    system.out.println("No se puede realizar la division");
                }else{
                    system.out.println("La division es"+(a/b));
                }
                    break;
                default : system.out.println("Error nº incorrecto");
                
            }
        }while(opcion!=5);
        System.out.println("Se ha salido de la calculadora , gracias por su uso <3");
    }
}
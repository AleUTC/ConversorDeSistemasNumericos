import java.util.*;

public class Principal {

    public static void main(String[] args) {
        int opc, numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al programa para convertir un numero a cualquiera de los siguientes Sistemas Numericos: \n\t1) Binario \n\t2) Decimal \n\t3) Octal \n\t4) Hexadecimal");

        do{
            System.out.println("Ingresa un numero entero mayor que 0");
            numero = sc.nextInt();
        }while(numero < 0);

        do {
            System.out.println("Selecciona el Sistema Numerico al que deseas hacer la conversion: \n\t1) Binario \n\t2) Decimal \n\t3) Octal \n\t4) Hexadecimal");
            opc = sc.nextInt();

            switch (opc) {
                case 1://Binario
                    Binarios obj1 = new  Binarios();
                    obj1.convertirBinario(numero);
                    break;

                default:
                    break;
            }
        } while (opc ==  0);
    }
}

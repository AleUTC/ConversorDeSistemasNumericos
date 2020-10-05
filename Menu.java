import java.util.Scanner;

public class Menu {
    int numero, opc, opc2;

    public void MenuDecimal() {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nSelecciona el Sistema Numerico al que deseas hacer la conversion: \n\t1) Binario \n\t2) Octal \n\t3) Hexadecimal");
            opc = sc.nextInt();

            do{
                System.out.println("\nIngresa un numero entero mayor que 0");
                numero = sc.nextInt();
            }while(numero < 0);


            switch (opc) {
                case 1://Binario
                    Binario base_10 = new  Binario();
                    base_10.decimalBinario(numero);
                    break;

                case 2://Octal
                    Octal base_8 = new  Octal();
                    base_8.decimalOctal(numero);
                    break;

                case 3://Hexadecimal
                    
                    break;

                default:
                    break;
            }

            System.out.println("\n\nSi deseas realizar otra conversion de Decimal a Binario, Hexadecimal u Octal presiona 1 \nSi deseas salir presiona cualquier boton");
            opc2 = sc.nextInt();
        } while (opc2 !=  1);
    }


}

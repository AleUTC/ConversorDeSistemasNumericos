import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        int sistema, continuar;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n\nBienvenido al programa para convertir un numero a cualquiera de los siguientes Sistemas Numericos: Binario, Decimal, Octal y Hexadecimal");
            System.out.println("\nSelecciona el Sistema Numerico del numero que vas a ingresar: \n\t1) Decimal \n\t2) Binario  \n\t3) Octal \n\t4) Hexadecimal");
            sistema = sc.nextInt();

            switch (sistema) {
                case 1: //Menu Decimal
                    Menu menu_10 = new Menu();
                    menu_10.menuDecimal();
                    break;

                case 2://Menu Binario
                    Menu menu_2 = new Menu();
                    menu_2.menuBinario();

                case 3://Menu Octal
                    Menu menu_3 = new Menu();
                    menu_3.menuOctal();

                case 4://Menu Hexadecimal
                Menu menu_4 = new Menu();
                menu_4.menuHexadecimal();

                default:
                    System.out.println("Opcion invalida, intenta de nuevo");
                    break;
            }
            System.out.println("\n\nDeseas realizar otra conversion entre Sistemas Numericos \n\nSi presiona (1) || No presiona (0)");
            continuar = sc.nextInt();
        } while (continuar !=  0);

    }
}

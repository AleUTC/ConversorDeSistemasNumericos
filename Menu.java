import java.util.Objects;
import java.util.Scanner;


public class Menu {
    int continuar;
    Scanner sc = new Scanner(System.in);
    int numero;

    public void menuDecimal() {
        double binario, octal;
        String hexadecimal;

        do {
            do{
                System.out.println("\nIngresa un numero entero mayor que 0");
                numero = sc.nextInt();
            }while(numero < 0);

            System.out.println("\nLa conversion del numero "+ numero +" es:\n");
            //Decimal -> Binario
            Binario base_10 = new  Binario();
            binario = base_10.decimalBinario(numero);
            //System.out.printf("Binario: %.0f %n",binario);
            System.out.println("Binario: "+ (int)binario);

            //Decimal -> Octal
            Octal base_8 = new  Octal();
            octal = base_8.decimalOctal(numero);
            System.out.printf("Octal: %.0f %n",octal);

            //Decimal -> Hexadecimal
            Hexadecimal base_16 = new Hexadecimal();
            hexadecimal = base_16.decimalHexadecimal(numero);
            System.out.println("Hexadecimal: "+ hexadecimal);

            System.out.println("\n\nDeseas realizar otra conversion de: \n\tDecimal -> Binario \n\tDecimal -> Octal \n\tDecimal -> Hexadecimal\n\nSi presiona (1) || No presiona (0)");
            continuar = sc.nextInt();
        } while (continuar !=  0);
    }

    public void menuBinario() {

        boolean validacion;
        long numero, aux, digito;
        double decimal;
        int octal;
        String hexadecimal;

        do {
            do {
                System.out.print("Introduce un numero binario: ");
                numero = sc.nextLong();
                validacion = true;
                aux = numero;

                while (aux != 0) {
                    digito = aux % 10;
                    if (digito != 0 && digito != 1) validacion = false;
                    aux = aux / 10;
                }
            } while (!validacion);

            System.out.println("\nLa conversion del numero "+ numero +" es:\n");

            //Binario -> Decimal
            Decimal base_10 = new Decimal();
            decimal = base_10.binarioDecimal(numero);
            System.out.println("Decimal: "+ (int)decimal);

            // //Binario -> Octal
            Octal base_8 = new Octal();
            octal = base_8.decimalOctal((int)decimal);
            System.out.println("Octal: "+ octal);

            // //Binario -> Hexadecimal
            Hexadecimal base_16 = new Hexadecimal();
            hexadecimal = base_16.decimalHexadecimal((int)decimal);
            System.out.println("Hexadecimal: "+ hexadecimal);


            System.out.println("\n\nDeseas realizar otra conversion de: \n\tBinario -> Decimal \n\tBinario -> Hexadecimal \n\tBinario -> Octal \n\nSi presiona (1) || No presiona (0)");
            continuar = sc.nextInt();
        } while (continuar !=  0);
    }

    public void menuOctal() {
        int decimal, binario;
        String hexadecimal;
        Boolean validacion = false;

        do {
            do{
                System.out.println("\nIngresa un numero entero mayor que 0 (no puedes ingresar los numeros 8 o 9)");
                numero = sc.nextInt();

                if (numero>7 && numero<10) {
                    System.out.print("Ese numero no existe en el sistema Octal");
                    validacion = false;
                } else {
                    validacion = true;
                }

            }while(!validacion);

            System.out.println("\nLa conversion del numero "+ numero +" es:\n");

            //Octal -> Decimal
            Decimal base_10 = new Decimal();
            decimal = (int)base_10.octalDecimal(numero+"");
            System.out.println("Decimal: "+ decimal);

            //Octal -> Binario
            Binario base_2 = new Binario();
            binario = (int)base_2.decimalBinario(decimal);
            System.out.println("Binario: "+ binario);

            //Octal -> Hexadecimal
            Hexadecimal base_16 = new Hexadecimal();
            hexadecimal = base_16.decimalHexadecimal(decimal);
            System.out.println("Hexadecimal: "+ hexadecimal);

            System.out.println("\n\nDeseas realizar otra conversion de: \n\tDecimal -> Binario \n\tDecimal -> Octal \n\tDecimal -> Hexadecimal\n\nSi presiona (1) || No presiona (0)");
            continuar = sc.nextInt();
        } while (continuar !=  0);
    }

    public void menuHexadecimal(){
        String numeroHexa;
        int hexadecimal, octal, binario;

        do {

            System.out.println("\nIngresa un numero Hexadecimal");
            numeroHexa = sc.next();

            System.out.println("\nLa conversion del numero "+ numeroHexa +" es:\n");

            //Octal -> Decimal
            Decimal base_10 = new Decimal();
            hexadecimal = base_10.hexadecimalDecimal(numeroHexa);
            System.out.println("Decimal: "+ hexadecimal);

            //Octal -> Binario
            Binario base_2 = new Binario();
            binario = (int)base_2.decimalBinario(hexadecimal);
            System.out.println("Binario: "+ binario);

            //Octal -> Octal
            Octal base_8 = new Octal();
            octal = base_8.decimalOctal(hexadecimal);
            System.out.println("Octal: "+ octal);



            System.out.println("\n\nDeseas realizar otra conversion de: \n\tDecimal -> Binario \n\tDecimal -> Octal \n\tDecimal -> Hexadecimal\n\nSi presiona (1) || No presiona (0)");
            continuar = sc.nextInt();
        } while (continuar !=  0);
    }

}

public class Octal {

    public void decimalOctal(int numeroIni){

        String octal = "";
        String caracteresOctales = "01234567";

        while (numeroIni > 0) {
            int residuo = numeroIni % 8;
            octal = (caracteresOctales.charAt(residuo) + octal);
            numeroIni /= 8;
        }
        System.out.println("\nLa conversión del numero "+ numeroIni +" a Octal es: "+ octal);
    }
}

public class Octal {

    public int decimalOctal(int numeroIni){
        //int numero = num;
        String octal = "";
        String caracteresOctales = "01234567";

        while (numeroIni > 0) {
            int residuo = numeroIni % 8;
            octal = (caracteresOctales.charAt(residuo) + octal);
            numeroIni /= 8;
        }
        //System.out.println("\nLa conversión del numero "+ numeroIni +"Decimal a Octal es: "+ octal);
        //System.out.println("Octal: "+ octal);
        return Integer.parseInt(octal);
    }

}

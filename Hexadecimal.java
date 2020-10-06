public class Hexadecimal {

    public  String decimalHexadecimal(int numeroIni) {
        String hexadecimal = "";
        String caracteresHexadecimales = "0123456789ABCDEF";
        while (numeroIni > 0) {
            int residuo = numeroIni % 16;
            hexadecimal = caracteresHexadecimales.charAt(residuo) + hexadecimal; // Agregar a la izquierda
            numeroIni /= 16;
        }
        //System.out.println("\nLa conversión del numero "+ numero +"Decimal a Hexadecimal es: "+ hexadecimal);

        return hexadecimal;
    }
}

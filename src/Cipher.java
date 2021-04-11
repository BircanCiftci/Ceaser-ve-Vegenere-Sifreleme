import java.util.*;
abstract class Cipher {

    public String islem(String orjinalMetin, String anahtar) {
        StringBuffer result = new StringBuffer("");
        StringTokenizer orjinalMetins = new StringTokenizer("");
        StringTokenizer anahtars = new StringTokenizer("");

        while (orjinalMetins.hasMoreTokens()) {
            result.append(encrypt(orjinalMetins.nextToken(), anahtars.nextToken()) + " ");
        }
        return result.toString();
    }

    public String islem2(String orjinalMetin, String anahtar) {
        StringBuilder result = new StringBuilder("");
        StringTokenizer orjinalMetins = new StringTokenizer("");
        StringTokenizer anahtars = new StringTokenizer("");

        while (orjinalMetins.hasMoreTokens()) {
            result.append(decrypt(orjinalMetins.nextToken(), anahtars.nextToken()) + " ");
        }
        return result.toString();
    }

    abstract String encrypt(String orjinalMetin, String anahtar);
    abstract String decrypt(String sifreliMetin, String anahtar);
}

public class Ceaser extends Cipher {

    @Override
    public String encrypt(String orjinalMetin, String anahtar) {
        StringBuffer result = new StringBuffer();
        for (int k = 0; k < orjinalMetin.length(); k++) {
            char ch = orjinalMetin.charAt(k);
            ch = (char)('a' + (ch -'a'+ anahtar.length()) % 26);
            result.append(ch);
        }
        return result.toString();
    }

    @Override
    public String decrypt(String sifreliMetin, String anahtar) {
        StringBuffer result = new StringBuffer();
        for (int k = 0; k < sifreliMetin.length(); k++) {
            char ch = sifreliMetin.charAt(k);
            ch = (char)('a' + (ch - 'a' + 23) % 26);
            result.append(ch);
        }
        return result.toString();
    }
}


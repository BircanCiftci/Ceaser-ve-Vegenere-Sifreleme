class Vigenere extends Cipher{

    @Override
    String encrypt(String orjinalMetin, String anahtar) {
        StringBuilder result = new StringBuilder(orjinalMetin.length());
        for (int i = 0; i < orjinalMetin.length(); ++i) {
            char p = orjinalMetin.charAt(i);
            int j = p - 'a';
            char k = anahtar.charAt(i % anahtar.length());
            int l = k - 'a';
            char c = (char) ('a' + ((j + l) % 26));
            result.append(c);
        }
        return result.toString();
    }

    @Override
    String decrypt(String sifreliMetin, String anahtar) {
        StringBuilder result = new StringBuilder(sifreliMetin.length());
        for (int i = 0; i < sifreliMetin.length(); ++i) {
            char p = sifreliMetin.charAt(i);
            int j = p - 'a';
            char k = anahtar.charAt(i % anahtar.length());
            int l = k - 'a';
            char c = (char) ((l - anahtar.charAt(j) + 26) % 26 + 'a');
            result.append(c);
        }
        return result.toString();
    }
}

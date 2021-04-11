import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Ceaser ceaser = new Ceaser();
        Vigenere vigenere = new Vigenere();

        Scanner girdi = new Scanner(System.in);
        System.out.print("Orjinal metni giriniz : \n");
        String orjinalMetin = girdi.next();
        System.out.print("Anahtar giriniz : \n");
        String anahtar = girdi.next();

        String secret = ceaser.encrypt(orjinalMetin, anahtar);
        String secret2 = vigenere.encrypt(orjinalMetin, anahtar);

        System.out.println("Ceaser");
        System.out.println("Orjinal metin : "+ orjinalMetin + ", Anahtar : "+ anahtar + ", Şifreli Metin : "+ secret);
        System.out.println("Şifreli metin : "+ secret + ", Anahtar : "+ anahtar + ", Orjinal Metin : "+ orjinalMetin );

        System.out.println("*********************************************************");

        System.out.println("Vigenere");
        System.out.println("Orjinal metin : "+ orjinalMetin + ", Anahtar : "+ anahtar + ", Şifreli Metin : "+ secret2);
        System.out.println("Şifreli metin : "+ secret2 + ", Anahtar : "+ anahtar + ", Orjinal Metin : "+ orjinalMetin );
    }
}

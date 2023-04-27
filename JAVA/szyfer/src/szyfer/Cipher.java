package szyfer;

public class Cipher {
    private int key = 1;
    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int alphalen=alphabet.length();
    public void setKey(int key) {
        this.key = key% alphalen;
    }

    public String encrypter(String text) {

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int idx = alphabet.indexOf(c);
            idx =(idx + key)%alphalen;
            c = alphabet.charAt(idx);
            str.append(c);
        }
        return str.toString();
    }

    public String decrypter(String text) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int idx = alphabet.indexOf(c);
            idx =(idx - key)%alphalen;
            if(idx<0){
                idx =alphalen+idx;
            }
            c = alphabet.charAt(idx);
            str.append(c);
        }
        return str.toString();
    }
}
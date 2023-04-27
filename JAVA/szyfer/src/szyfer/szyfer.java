package szyfer;


public class szyfer {
    public static void main(String[] args) {
        Cipher szyfr = new Cipher();
        System.out.println(szyfr.encrypter("ABC"));


//        long t0 = System.currentTimeMillis();
//        String txt = "abc";
//        int key = 1;
//        String szyfr = "";
//        StringBuilder str = new StringBuilder();
//
//        for (int i=0; i<txt.length(); i++) {
//            int c = txt.charAt(i) + key;
//            //szyfr+=(char)c;
//            str.append((char) c);
//        }
//        /*
//        txt.chars()
//                .mapToObj(c -> (char)c + key)
//                .forEach(c ->
//                {
//                    str.append(c);
//                    System.out.println(c);
//                });
//        */
//
//        /*
//        for (int i=0; i<200000; i++){
//            str.append("*");
//        }
//        System.out.println(str.toString());
//        System.out.println(System.currentTimeMillis()-t0);
//        */
    }
}

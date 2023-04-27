package szyfer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {
    private Cipher cipher;

    @BeforeEach
    public void init(){
        cipher = new Cipher();
    }
    @Test
    public void encryptTest(){
        Assertions.assertEquals("BCD", cipher.encrypter("ABC"));
    }

    @Test
    public void encryptPositiveKey(){
        cipher.setKey(3);
        Assertions.assertEquals("DEF", cipher.encrypter("ABC"));
    }

    @Test
    public void encryptNega(){
        cipher.setKey(3);
        Assertions.assertEquals("ABC", cipher.encrypter("XYZ"));
    }
    @Test
    public void decrypt(){
        cipher.setKey(2);
        Assertions.assertEquals("YZA", cipher.decrypter("ABC"));
    }
}
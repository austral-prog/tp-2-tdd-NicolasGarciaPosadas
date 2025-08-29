package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordValidatorTest {
    private PasswordValidator validator = new PasswordValidator();
    // TODO: Replace these lines with your tests
    @Test
    void Testpasswordlenghtless8(){
        assertFalse(validator.isValid("1Mnas<"));
    }
    @Test
    void Testpasswordlenghtmore8(){
        assertFalse(validator.isValid("anasduwoasbd"));
    }
    @Test
    void Testpasswordupper(){
        assertFalse(validator.isValid("1mnasmnw<"));
    }
    @Test
    void Testpasswordlower(){
        assertFalse(validator.isValid("1MASJDNW<"));
    }
    @Test
    void Testpasswordnumber(){
        assertFalse(validator.isValid("MASJDNW<"));
    }
    @Test
    void Testpasswordspecial(){
        assertFalse(validator.isValid("1MASDDNW"));
    }
    @Test
    void Testpassword(){
        assertTrue(validator.isValid("1MAsJdNW<"));
    }
}

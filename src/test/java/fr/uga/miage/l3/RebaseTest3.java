package fr.uga.miage.l3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RebaseTest3 {

    @Test
    void goodRebase3(){
        Assertions.assertEquals("bravo_à_tous_pour_tous_ces_conflits",(new PackageManager()).name());
    }
}

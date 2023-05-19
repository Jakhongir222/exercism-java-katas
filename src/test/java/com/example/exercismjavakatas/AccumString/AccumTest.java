package com.example.exercismjavakatas.AccumString;
import static org.junit.Assert.*;
import org.junit.Test;


public class AccumTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test() {
        System.out.println("Fixed Tests accum");
        testing(Accum.accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
        testing(Accum.accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
        testing(Accum.accum("MjtkuBovqrU"), "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
        testing(Accum.accum("EvidjUnokmM"), "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
        testing(Accum.accum("HbideVbxncC"), "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
    }
    @Test
    public void sampleTests() {
        assertEquals("taxi", Accum.high("man i need a taxi up to ubud"));
        assertEquals("volcano", Accum.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", Accum.high("take me to semynak"));
    }

    @Test
    public void edgeCaseTests() {
        assertEquals("aa", Accum.high("aa b"));
        assertEquals("b", Accum.high("b aa"));
        assertEquals("bb", Accum.high("bb d"));
        assertEquals("d", Accum.high("d bb"));
        assertEquals("aaa", Accum.high("aaa b"));
    }

    @Test
    public void fixedTests() {
        assertEquals("wide", Accum.mouthSize("toucan"));
        assertEquals("wide",Accum.mouthSize("ant bear"));
        assertEquals("small", Accum.mouthSize("alligator"));
        assertEquals("small", Accum.mouthSize("ALLIGATOR"));
    }
}
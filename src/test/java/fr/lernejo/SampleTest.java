package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    static final Sample s = new Sample();

    @Test
    void Add_1_plus_1() {
        assertEquals(2, s.op(Sample.Operation.ADD, 1,1));
    }

    @Test
    void Add_negative() {
        assertEquals(-20, s.op(Sample.Operation.ADD, 10,-30));
    }

    @Test
    void Mult_5_times_5() {
        assertEquals(25, s.op(Sample.Operation.MULT, 5,5));
    }

    @Test
    void Mult_10_times_10() {
        assertEquals(100, s.op(Sample.Operation.MULT, 10,10));
    }

    @Test
    void Fact_zero() {
        assertEquals(1, new Sample().fact(0));
    }

    @Test
    void Fact_ten() {
        assertEquals(3628800, new Sample().fact(10));
    }

    @Test
    void Fact_negative() {
        assertThrows(IllegalArgumentException.class, () -> new Sample().fact(-10));
    }
}

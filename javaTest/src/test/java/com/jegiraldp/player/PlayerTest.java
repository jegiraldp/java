package com.jegiraldp.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void loose_is_too_low() {
        //Dice dice = new Dice(6);
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(1);
        Player player=  new Player(dice,3);
        assertFalse(player.play());
    }

    @Test
    public void loose_is_too_big() {

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(6);
        Player player=  new Player(dice,3);
        assertTrue(player.play());
    }
}
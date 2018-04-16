package de.sadrab.jacksparrow.endpoint;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class JackSparrowEndPointTest {
    @Autowired
    private JackSparrowEndPoint jackSparrowEndPoint;

    @Test
    void getChest() {
        String expected = "Haha Chest Is Here :D";
        assertEquals(expected, jackSparrowEndPoint.getChest());
    }
}


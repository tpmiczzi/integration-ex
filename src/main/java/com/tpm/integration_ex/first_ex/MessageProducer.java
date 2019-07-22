package com.tpm.integration_ex.first_ex;

import java.util.Random;

public class MessageProducer {

    public String produce() {
        String[] array = {"first line!", "second line!", "third line!"};
        return array[new Random().nextInt(3)];
    }

}

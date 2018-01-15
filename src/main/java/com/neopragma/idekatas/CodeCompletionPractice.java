package com.neopragma.idekatas;

import java.util.ArrayList;
import java.util.List;

public class CodeCompletionPractice {

    public void method1() {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(5);
        if (integers.isEmpty()) {
            throw new RuntimeException("WTF??");
        }
    }
}

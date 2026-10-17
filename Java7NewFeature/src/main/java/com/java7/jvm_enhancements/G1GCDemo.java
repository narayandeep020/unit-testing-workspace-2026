package com.java7.jvm_enhancements;

public class G1GCDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            // बड़ी संख्या में objects बनाना
            String data = new String("Object-" + i);
        }
        System.out.println("Objects created successfully!");
    }
}

package com.company;

class Machine {

    private Machine() {}

    static boolean check(String buffer) {
        int state = 1;
        for (int i = 0; i < buffer.length(); i++) {
            if (state == 1 && (buffer.charAt(i) == '+' || buffer.charAt(i) == '-')) {
                state++;
            } else if (state == 2 && isNumber(buffer.charAt(i))) {
                state++;
            } else if (state == 3 && buffer.charAt(i) == '.') {
                state++;
            } else if (state == 4 && isNumber(buffer.charAt(i))) {
                state++;
            } else if ((state == 3 || state == 5) && isNumber(buffer.charAt(i))) {
            } else {
                return false;
            }
        }

        return state == 5;
    }

    static boolean isNumber(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }

}

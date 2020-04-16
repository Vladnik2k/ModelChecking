package com.company;

class Machine {

    private Machine() {}

    static boolean check(String buffer) {
        int state = 1;
        for (int i = 0; i < buffer.length(); i++) {
            if (state == 1 && (buffer.charAt(i) == '+' || buffer.charAt(i) == '-')) {
                state++;
            } else if (state == 2 && buffer.charAt(i) == '.') {
                state++;
            } else if ((state == 3 || state == 2) && buffer.charAt(i) >= '0' && buffer.charAt(i) <= '9') {
            } else {
                return false;
            }
        }

        return state == 3;
    }

}

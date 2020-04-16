package com.company;

class Machine {

    private Machine() {}

    static boolean check(String buffer) {
        boolean doesFracExist = false;
        boolean doesNumberExist = false;
        char symbol = ' ';
        for (int i = 0; i < buffer.length(); i++) {
            if ((buffer.charAt(i) == '+' || buffer.charAt(i) == '-') && symbol == ' ') {
                symbol = buffer.charAt(i);
            } else if (buffer.charAt(i) >= '0' && buffer.charAt(i) <= '9') {
                doesNumberExist = true;
            } else if (buffer.charAt(i) == '.' && !doesFracExist) {
                doesFracExist = true;
            } else {
                return false;
            }
        }

        return doesNumberExist;
    }

}

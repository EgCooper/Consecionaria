package com.pinto;

import com.pinto.util.ConectorBD;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = ConectorBD.getConnection();

    }
}

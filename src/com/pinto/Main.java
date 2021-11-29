package com.pinto;

import com.pinto.dao.ClienteDao;
import com.pinto.model.Cliente;
import com.pinto.util.ConectorBD;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente= new Cliente("9519261","Victor Pinto", "Cochabamba", "Faustino Suarez",75906306);
        Cliente Nicolas = new Cliente("1329857","Nicolas Quintanilla", "Cochabamba", "circunvalacion",78322334);
        Cliente Milton = new Cliente("6439108","Milton Salazar", "Cochabamba", "Blanco Galindo",67448812);
        Cliente Erick = new Cliente("8273846","Erick", "Cochabamba", "Zona Sud",65784956);
        Cliente Bruce = new Cliente("010304","Bruce Veizaga", "Cochabamba", "Victor Ustariz",75849596);

        ClienteDao clienteDao = new ClienteDao();
        clienteDao.addCliente(cliente);
        clienteDao.addCliente(Nicolas);
        clienteDao.addCliente(Milton);
        clienteDao.addCliente(Erick);
        clienteDao.addCliente(Bruce);
        /*
        clienteDao.addCliente(Victor);
        clienteDao.addCliente(Nicolas);
        clienteDao.addCliente(Milton);
        clienteDao.addCliente(Erick);
        clienteDao.addCliente(Bruce);
        */
        //READ
        /*List<Cliente> clientes= clienteDao.getALLClientes();
        for (int i = 0; i <clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            System.out.println(cliente);
        }*/
    }
}

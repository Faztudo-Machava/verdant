/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;

/**
 *
 * @author FST
 */
public class TesteClie {
    public static void main(String[] args) {
        ClienteDAO cli = new ClienteDAO();
        Cliente cliente = new Cliente();
        cliente.setNome("Fasthy");
        cliente.setTelefone("848709975");
        cli.salvar(cliente);
    }
    
}

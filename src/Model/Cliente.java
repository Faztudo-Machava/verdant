/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author FST
 */
@Entity(name = "Cliente")

public class Cliente {
    @Id
    @Column(name = "id_Cliente")
    @GeneratedValue
    private int Id;
    
    @Column(name = "nome" , nullable = false)
    private String nome;
    
    @Column(name = "telefone" , unique = true)
    private String telefone;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

//    public Cliente( String nome, String telefone) {
//        //this.Id = Id;
//        this.nome = nome;
//        this.telefone = telefone;
//    }

    @Override
    public String toString() {
        return "Cliente{" + "Id=" + Id + ", nome=" + nome + ", telefone=" + telefone + '}';
    }
    
    
    
    
}

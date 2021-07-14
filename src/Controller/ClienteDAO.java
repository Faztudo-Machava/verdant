/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Arquivo.NewHibernateUtil;
import Model.Cliente;
import java.util.Arrays;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author FST
 */
public class ClienteDAO {

    SessionFactory sf = NewHibernateUtil.getSessionFactory();
    Session s = sf.openSession();
    Transaction ts = s.beginTransaction();

    public boolean salvar(Cliente Cli) {

        try {
            s.save(Cli);
            ts.commit();
            return true;
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
            return false;
        } finally {
            s.close();
            sf.close();
        }
    }

}

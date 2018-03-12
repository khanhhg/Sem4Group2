/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import entities.Contacts;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Khanh
 */
@Local
public interface ContactsFacadeLocal {

    void create(Contacts contacts);

    void edit(Contacts contacts);

    void remove(Contacts contacts);

    Contacts find(Object id);

    List<Contacts> findAll();

    List<Contacts> findRange(int[] range);

    int count();
    
}

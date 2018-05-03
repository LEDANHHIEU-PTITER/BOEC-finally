/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Item;
import java.util.List;

/**
 *
 * @author HieuLe
 */
public interface ItemDAO {

    public List<Item> find();
    public List<Item> findById();
    public List<Item> findByName();

    public boolean addItem(Item item);

    public boolean updateItem(Item item);

    public boolean deleteItem(Item item);
}

package com.dxctraining.item.dao;
import com.dxctraining.item.entities.Item;

public interface IItemDao {
	
	 Item addItem(Item item);
	 
	 void remove(int id);
	 
	 Item findItemById(int id);
	 
}

package com.dxctraining.item.services;

import com.dxctraining.item.entities.Item;

public interface IItemService {
	
	 Item addItem(Item item);
	 
	 void remove(int id);
	 
	 Item findItemById(int id);
}

package com.dxctraining.phone.dao;

import com.dxctraining.phone.entities.Phone;

public interface IPhoneDao {
	
	Phone findPhoneById(int id);

	Phone add(Phone phone);

	void remove(int id);

}
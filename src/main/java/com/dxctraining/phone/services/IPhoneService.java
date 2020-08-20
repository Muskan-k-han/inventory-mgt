package com.dxctraining.phone.services;

import com.dxctraining.phone.entities.Phone;

public interface IPhoneService {

	Phone findPhoneById(int id);

	Phone add(Phone phone);

	void remove(int id);

}
  
package com.dxctraining.supplier.services;

import com.dxctraining.supplier.entities.Supplier;

public interface ISupplierService {
	
	Supplier findSupplierById(int id);

    Supplier add(Supplier supplier);

    void remove(int id);

}
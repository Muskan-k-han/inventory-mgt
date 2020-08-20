  
package com.dxctraining.supplier.dao;

import com.dxctraining.supplier.entities.Supplier;

public interface ISupplierDao {
	Supplier findSupplierById(int id);

    Supplier add(Supplier supplier);

    void remove(int id);
	

}
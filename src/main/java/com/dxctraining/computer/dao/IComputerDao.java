package com.dxctraining.computer.dao;

import com.dxctraining.computer.entities.Computer;

public interface IComputerDao {
	
	Computer findComputerById(int id);

	Computer addComputer(Computer computer);

	void remove(int id);
}
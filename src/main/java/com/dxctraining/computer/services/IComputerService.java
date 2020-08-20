package com.dxctraining.computer.services;

import com.dxctraining.computer.entities.Computer;

public interface IComputerService {

	Computer findPhoneById(int id);

	Computer addComputer(Computer computer);

	void remove(int id);
}
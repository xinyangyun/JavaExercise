package com.stx.excs.service;

import java.util.Random;

import com.stx.excs.dao.VirusDao;
import com.stx.excs.entity.Vrius;

public class addVirusService {

	VirusDao virusDao = new VirusDao();

	public int addVirus(Vrius vrius) {
		int result = virusDao.addVrius(vrius);
		return result;
	}
	
}

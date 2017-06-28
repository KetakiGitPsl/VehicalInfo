package com.psl.dao;

import com.psl.model.Info;

public interface IVehicalDao {
	Info getInfo();
	void postInfo(Info info);
}

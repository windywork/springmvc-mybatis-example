package cn.hebei.speed.sgjson.dao;

import cn.hebei.speed.sgjson.model.User;

public interface UserDao {
	User findUserById(Long id);
}

package edu.fa.service;

import java.util.List;

import edu.fa.model.Menu;


public interface MenuService {
	public List<Menu> getAllMenu();

	Menu save(Menu menu);

	public boolean UpdateMenuByMenuId(int menuId);

	public boolean deleteMenuByMenuId(int menuId);

}

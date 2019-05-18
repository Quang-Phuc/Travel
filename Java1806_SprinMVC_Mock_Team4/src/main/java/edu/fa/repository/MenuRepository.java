package edu.fa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fa.model.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {
	/*List<Menu> getAllMenu();*/

}

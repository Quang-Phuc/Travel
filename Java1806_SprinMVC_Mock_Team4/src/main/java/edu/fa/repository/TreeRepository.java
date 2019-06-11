package edu.fa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fa.model.Tree;

@Repository
public interface TreeRepository extends JpaRepository<Tree, Integer> {

	/*
	 * List<Tree> findAllTrees();
	 */
}

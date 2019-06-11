package edu.fa.service;

import java.util.List;

import edu.fa.model.Tree;
import edu.fa.service.impl.Node;

public interface TreeService {

	List<Tree> findAllTrees();

	<T> void printTree(Node<T> node);
}

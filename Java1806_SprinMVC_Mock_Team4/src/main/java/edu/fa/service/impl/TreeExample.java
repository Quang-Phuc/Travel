package edu.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.model.Tree;
import edu.fa.repository.TreeRepository;
import edu.fa.service.TreeService;

@Service
public class TreeExample implements TreeService {
	@Autowired
	private static TreeRepository treeRepository;

	/*
	 * public static void main(String[] args) { Node<String> root = createTree();
	 * printTree(root, " "); }
	 */

	private static Node<String> createTree() {

		Node<String> root = new Node<>("root");
		treeRepository.findAll();

		/*
		 * Node<String> node1 = root.addChild(new Node<String>("node 1"));
		 * 
		 * Node<String> node11 = node1.addChild(new Node<String>("node 11"));
		 * Node<String> node111 = node11.addChild(new Node<String>("node 111"));
		 * Node<String> node112 = node11.addChild(new Node<String>("node 112"));
		 * 
		 * Node<String> node12 = node1.addChild(new Node<String>("node 12"));
		 * 
		 * Node<String> node2 = root.addChild(new Node<String>("node 2"));
		 * 
		 * Node<String> node21 = node2.addChild(new Node<String>("node 21"));
		 * Node<String> node211 = node2.addChild(new Node<String>("node 22"));
		 * Node<String> node311 = node1.addChild(new Node<String>("node 5"));
		 */

		return root;
	}

	@Override
	public List<Tree> findAllTrees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> void printTree(Node<T> node) {
		System.out.println("<ul>");
		System.out.println("<li>");
		System.out.println(node.getData());
		node.getChildren().forEach(each -> printTree(each));
		System.out.println("</li>");
		System.out.println("</ul>");

	}
}
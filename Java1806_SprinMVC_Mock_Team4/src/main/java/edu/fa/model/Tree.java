package edu.fa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Tree")
public class Tree {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(name = "treeId")
	private int treeId;

	@JoinColumn(name = "treeName")
	private String treeName;

	public int getTreeId() {
		return treeId;
	}

	public void setTreeId(int treeId) {
		this.treeId = treeId;
	}

	public String getTreeName() {
		return treeName;
	}

	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

	@Override
	public String toString() {
		return "Tree [treeId=" + treeId + ", treeName=" + treeName + "]";
	}

}

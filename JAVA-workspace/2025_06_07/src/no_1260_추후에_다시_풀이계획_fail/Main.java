package no_1260_추후에_다시_풀이계획_fail;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		int nodeCount = read();
		int edgeCount = read();
		int startNum = read();
		
		Node[] nodes = new Node[nodeCount+1];
		for(int i = 1; i <= nodeCount; i++) {
			nodes[i] = new Node(i, nodeCount);
		}
		for(int i = 0; i < edgeCount; i++) {
			int nodeNum = read();
			int linkNum = read();
			nodes[nodeNum].link(nodes[linkNum]);
		}
		StringBuilder stb = new StringBuilder();
		Set<Integer> nodeSet = new HashSet<Integer>();
		nodeSet.add(startNum);
		dfs(stb, nodes[startNum], nodeSet);
	}
	
	static void dfs(StringBuilder stb, Node node, Set<Integer> nodeSet) {
		Node tempNode = node;
		while(true) {
			stb.append(tempNode.get()).append(" ");
			for(Node linkedNode : tempNode.linkedNode) {
				if(nodeSet.contains(linkedNode.get())) continue;
				else{
					stb.append(linkedNode.get()).append(" ");
					nodeSet.add(linkedNode.get());
				}
			}
			if(nodeSet.size() == )
			for(Node linkedNode : tempNode.linkedNode) {
				
			}
		}
	}
	
	static void bfs(Node[] nodes, int nodeCount, int edgeCount, int startNum) {
		// TODO
	}
	
	static class Node{
		private int nodeNum;
		private int linkCount = 0;
		private Node[] linkedNode;
		
		public Node(int n, int nodeCount) {
			this.nodeNum = n;
			this.linkedNode = new Node[nodeCount];
		}
		
		public void link(Node node) {
			this.linkedNode[linkCount++] = node;
		}
		
		int get() {
			return this.nodeNum;
		}
	}
	
	static int read() {
		int c, n = 0;
		boolean plus = true;
		try {
			while((c = System.in.read()) <= 32);
			if(c == 45) { 
				plus = false;
				c = System.in.read();
			}
			n = c & 15;

			while((c = System.in.read()) > 32) {
				n = (n << 3) + (n << 1) + (c & 15);
			}
		} catch (Exception e){}
		return plus ? n : -n;
	}
}

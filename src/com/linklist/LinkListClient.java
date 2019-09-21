package com.linklist;

public class LinkListClient<T> {

	private Node<T> startNode;
	private Node<T> endNode;
	private int size=0;
	public LinkListClient()
	{
		startNode=null;
		size=0;
		
	}
	public void add(T data)
	{
		Node<T> temp = new Node<>(data);
		temp.setNext(null);
		if(startNode==null)
		{
			startNode = temp;
			endNode = startNode;
		}
		else
		{
			endNode.setNext(temp);
			endNode = temp;
		}
		size++;
		
	}
	public void addAtStart(T data)
	{
		Node<T> temp = new Node<>(data);
		if(startNode==null)
		{
			startNode = temp;
			endNode = startNode;
			startNode.setNext(null);
		}
		else
		{
			temp.setNext(startNode);
			startNode =temp;
		}
		size++;
	}
	
	public void addAtPos(T data , int pos)
	{
		
	}
	public void display()
	{
	  if(startNode!=null)
	  {
		  Node<T> traverseNode = startNode;
		  while(traverseNode!=null)
		  {
			  System.out.print(traverseNode.getValue() + "-> ");
			  traverseNode = traverseNode.getNext();
		  }
	  }
	}
	
	public Node<T> getLastNode(Node<T> node)
	{
		while(node.getNext()!=null)
		{
			node = node.getNext();
		}
		return node;
	}
	
	
	public static void main(String[] args) 
	{
		LinkListClient<String> client = new LinkListClient<>();
		
		client.add("parmeet");
		client.add("parmeet1");
		client.add("parmeet2");
		client.add("parmeet3");
		client.addAtStart("parmeet0");
		client.display();
	}

}

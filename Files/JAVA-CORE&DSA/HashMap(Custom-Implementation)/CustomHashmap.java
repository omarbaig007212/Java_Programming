import java.util.*;
public class CustomHashmap<k,v>{
	private List<Node<k,v>> list;
	private int size; // Size of the Node Added.
	private int capacity; // Size of the list.
	public CustomHashmap()
	{
		list=new LinkedList<>();
		size=0;
		capacity=5;
		for(int i=0;i<capacity;i++)
		{
			list.add(null);
		}
	}

	// Node Class (Private)
	private class Node<k,v>{
		private k key;
		private v value;
		private Node<k,v> next;
		public Node(k key,v value)
		{
			this.key=key;
			this.value=value;
		}
	}

	// getIndex
	public int getIndex(k key){
		int hashCode = key.hashCode();
		return hashCode%capacity;
	}

	// get the value from list
	public v get(k key)
	{
		int containerIndex = getIndex(key);
		Node<k,v> head = list.get(containerIndex);
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				return head.value;
			}
			head = head.next;
		}
		return null;
	}

	// put the value to list
	public void put(k key,v value)
	{
		int containerIndex = getIndex(key);
		Node<k,v> head = list.get(containerIndex);
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				head.value=value;
				return;
			}
			head = head.next;
		}
		//Start of list of Node
		head=list.get(containerIndex);
		Node<k,v> addNode = new Node<>(key,value);
		addNode.next=head;
		list.set(containerIndex,addNode);
		size++;

		double loadFactor = (1.0*size)/(capacity);
		System.out.println(" -------------------- "+"The value : "+value+"   /// Load Factor -> : "+loadFactor);
		if(loadFactor>0.7)
		{
			System.out.println("REHASHING!!!!!!! ");
			rehash();
		}
	}

	// ReHash Method
	public void rehash()
	{
		// Making a copy to add to new double size container.
		List<Node<k,v>> temp=list;
		list = new LinkedList<>();
		capacity=capacity*2;
		
		for(int i=0;i<capacity;i++)
		{
			list.add(null);
		}

		for(int i=0;i<temp.size();i++)
		{
			Node<k,v> head=temp.get(i);
			while(head!=null)
			{
				put(head.key,head.value);
				head=head.next;
			}
		}
	}

	// Remove from list of Node<k,v>
	public void remove(k key)
	{
		int containerIndex = getIndex(key);
		Node<k,v> head = list.get(containerIndex);
		Node<k,v> prev = null;

		v removedValue = null;
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				if(prev == null)
				{
					removedValue = head.value;
					list.set(containerIndex,head.next);
				}
				else
				{
					removedValue = head.value;
					prev.next=head.next;
				}
				head.next=null;
				size--;
				break;
			}
			head = head.next;
			prev = head;
		}
		if(removedValue!=null)
		{
			System.out.println("Removed Node's value: "+removedValue);
		}
		else
		{
			System.out.println("No values found. ");
		}
	}


}
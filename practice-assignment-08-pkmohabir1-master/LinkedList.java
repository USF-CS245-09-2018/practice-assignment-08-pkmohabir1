public class LinkedList implements List {

	private int size;
	private Node head;

  private class Node{

    public Object data;
    public Node next;

    public Node(){
      this.next = null;
      this.data = 0;
    }

    public Node(Object data){
      next = null;
      this.data = data;
    }

    public Node getNext(Node next){
      return this.next;
    }
    public void setNext(Node next){
      next = next;
    }
    public void data(Object data){
      data = data;
    }
  }

	public LinkedList(){
		size = 0;
		head = null;
	}


  public int size(){
    return size;
  }

	public void add(Object obj) throws Exception{
		Node node = new Node(obj);
		node.setNext(head);
		head = node;
		++size;
	}
	public void add(int pos, Object obj) throws Exception{

		if(pos == 0){
			Node node = new Node();
			node.data = obj;
			node.next = head;
			head = node;
			++size;
		}
		else{
			Node previous = getNode(pos-1);
			Node node = new Node();
			node.data = obj;
			node.next = previous.next;
			previous.next = node;
			++size;
		}
	}

  public Object remove(int pos) throws Exception{

		if(pos == 0){
			Node current = head;
			--size;
			return current.data;
		}
		else{
			Node previous = getNode(pos-1);
			Node current = previous.next;
			previous.next = current.next;
			--size;
			return current.data;
		}
	}

	public Object get(int pos) throws Exception{

		Node current = getNode(pos);
		return current.data;

	}
	public Node getNode(int pos){

		Node node = head;
		for(int i = 0; i < pos; i++){
			node = node.getNext(node);
		}
		return node;
	}

}

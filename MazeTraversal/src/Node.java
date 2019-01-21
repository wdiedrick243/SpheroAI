import java.io.Serializable;

public class Node implements Serializable{

	public char info = ' ';
	public Node upptr = null;
	public Node downptr = null;
	public Node leftptr = null;
	public Node rightptr = null;
	
	
	public Node()
	{
	
	}
	public Node(char input)
	{
		info = input;
	}
	public void setUptr(Node next)
	{
		upptr = next; 
	}
	
	public void setDptr(Node next)
	{
		downptr = next; 
	}
	
	public void setLptr(Node next)
	{
		leftptr = next; 
	}
	public void setRptr(Node next)
	{
		rightptr = next; 
	}
}


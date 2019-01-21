import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Random;


public class DepthFirst {
	Stack stk = new Stack();
	Stack dirstk = new Stack();
	Stack tmpstk = new Stack();
	Node root = new Node();
	Node goal = new Node();
	String Directions = "";
	String Directions2 = "";
	int dir = -1;
	
	
	public DepthFirst() {
		
	}
	
	public String findExit(Maze input) {
		
		root = input.maze[0];
		root.info = 'v';
		
		Node y = root;
		Node z = new Node();
		Random rand = new Random();
		
		while (y.upptr != null || y.downptr != null || y.leftptr != null || y.rightptr != null) {
			dir++;
	
			switch(dir) {
			case 0:
				if (y.upptr != null && y.upptr.info != 'v')
				{
					z = y.upptr;
					z.info = 'v';
					stk.push(y);
					dirstk.push("U");
					tmpstk.push("U");
					y = z;
					dir = -1;
				}
				break;
			case 1:
				if (y.downptr != null && y.downptr.info != 'v')
				{
					z = y.downptr;
					z.info = 'v';
					stk.push(y);
					dirstk.push("D");
					tmpstk.push("D");
					y = z;
					dir = -1;
				}
				break;
			case 2:
				if (y.leftptr != null && y.leftptr.info != 'v')
				{
					z = y.leftptr;
					z.info = 'v';
					stk.push(y);
					dirstk.push("L");
					tmpstk.push("L");
					y = z;
					dir = -1;
				}
				break;
			case 3:
				if (y.rightptr != null && y.rightptr.info != 'v')
				{
					z = y.rightptr;
					z.info = 'v';
					stk.push(y);
					dirstk.push("R");
					tmpstk.push("R");
					y = z;
					dir = -1;
				}
				break;
			case 4:
				if (y.upptr != null && y.upptr.info != 'v') {
					break;
				}
				else if (y.downptr != null && y.downptr.info != 'v') {
					break;
				}
				else if (y.leftptr != null && y.leftptr.info != 'v') {
					break;
				}
				else if (y.rightptr != null && y.rightptr.info != 'v') {
					break;
				}
				else {
					y = (Node) stk.pop();
					//dirstk.push("B");
					dirstk.pop();
					dir=-1;
				}
			default:
				break;	
			}
		}
		stk.push(y);
		dirstk.push("E");
		
		while(!dirstk.isEmpty()) {
			String temp = (String) dirstk.pop();
			Directions = temp + " " + Directions;
		}
		String NOR = "";
		while(!tmpstk.isEmpty()) {
			String temp = (String) tmpstk.pop();
			NOR = temp + " " + NOR;
		}
		Directions = Directions + "\n" + NOR;
		System.out.println();
		return Directions;
	}

}

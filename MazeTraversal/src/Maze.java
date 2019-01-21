import java.io.Serializable;
import java.util.Stack;

public class Maze implements Serializable{

	Node maze[] = new Node[49];
	
	public Maze() {
		for(int i = 0; i < 49; i++)
			maze[i] = new Node();		
	}
	
	public void addptrs(int index, int u, int d, int l, int r) {
		if(u == -1) {
			maze[index].upptr = null;
		}
		else {
			maze[index].upptr = maze[u];
		}
		if(d == -1) {
			maze[index].downptr = null;
		}
		else {
			maze[index].downptr = maze[d];
		}
		if(l == -1) {
			maze[index].leftptr = null;
		}
		else {
			maze[index].leftptr = maze[l];
		}
		if(r == -1) {
			maze[index].rightptr = null;
		}
		else {
			maze[index].rightptr = maze[r];
		}
		
	}
	
}

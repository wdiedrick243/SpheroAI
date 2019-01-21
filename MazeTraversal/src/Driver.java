import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Maze maze = new Maze();
		
		FileInputStream inFile = new FileInputStream("Maze.dat");
		ObjectInputStream objIn = new ObjectInputStream(inFile);
		maze = (Maze) objIn.readObject();
		
			int u = -1;
			int d = -1;
			int l = -1;
			int r = -1;
			int i = 41;
			
			String up = JOptionPane.showInputDialog("Node " + i + " Up Pointer");
			if(up.equals("b")) { u = -1;}
			else { u = Integer.parseInt(up);}
			
			String dp = JOptionPane.showInputDialog("Node " + i + " Down Pointer");
			if(dp.equals("b")) { d = -1;}
			else { d = Integer.parseInt(dp);}
			
			String lp = JOptionPane.showInputDialog("Node " + i + " Left Pointer");
			if(lp.equals("b")) { l = -1;}
			else { l = Integer.parseInt(lp);}
			
			String rp = JOptionPane.showInputDialog("Node " + i + " Right Pointer");
			if(rp.equals("b")) { r = -1;}
			else { r = Integer.parseInt(rp);}
			
			maze.addptrs(i, u, d, l, r);
		
		FileOutputStream outputstream = new FileOutputStream("Maze.dat");
		ObjectOutputStream objout = new ObjectOutputStream(outputstream);
		
		objout.writeObject(maze);
		
		

	}
}

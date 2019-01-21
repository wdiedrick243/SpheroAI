import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.IOException;

public class Traversal_Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream inFile = new FileInputStream("Maze.dat");
		ObjectInputStream objIn = new ObjectInputStream(inFile);
		
		Maze inmaze = (Maze) objIn.readObject();
		//DepthFirst trav = new DepthFirst();
		MazeTrav trav = new MazeTrav();
		
		String output = trav.findExit(inmaze);

		PrintWriter writer = new PrintWriter("directions.js", "ascii");
		writer.println(output);
		writer.close();
		
		System.out.println(output);
		
		
	}

}

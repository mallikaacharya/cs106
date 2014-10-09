import java.io.*;

public class TestingOutFileProcessing {
	public static void main(String[] args) {
		File f = new File("Test.txt");
		System.out.println("exists returns " + f.exists());
		System.out.println("canRead returns " + f.canRead());
		System.out.println("length returns " + f.length());
		System.out.println("getAbsolutePath returns " + f.getAbsolutePath());
	}	
}

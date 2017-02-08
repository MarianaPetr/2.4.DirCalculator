import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import com.google.common.base.StandardSystemProperty;

public class DirCalculator {
    

    public static void main(String[] args) {
       DirCalculator app = new DirCalculator();
       System.out.println("Counting directories and files");
       final String pathGivenByUser = app.askUserForAPath();
       if (app.checkIfPathExists(pathGivenByUser))
       {
    	   System.out.println("It exists. The count of files in directory is " + CountFilesInDir(pathGivenByUser));    	   
       }
       else System.out.println("Directory "+ pathGivenByUser + " doesn't exist");
    }

    public static int  CountFilesInDir(String pathGivenByUser) {
		return new File(pathGivenByUser).listFiles().length;
	}

	boolean checkIfPathExists(String path) {
		return Files.exists(Paths.get(path));
	}

	String askUserForAPath() {
		System.out.println("Give me a path");
		Scanner in=new Scanner(System.in);
		return in.nextLine();
	}
}

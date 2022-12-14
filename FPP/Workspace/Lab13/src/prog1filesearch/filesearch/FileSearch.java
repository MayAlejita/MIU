package prog1filesearch.filesearch;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
//PSEUDO-CODE
boolean searchForFile(Object file, Object startDir) {
	Object[] fileSystemObjects =
						startDir.getContents();
	for(Object o: fileSystemObjects) {
		//base case
		if(isFile(o) && isSameFile(o,f)) {
			return true;
		}

		if(isDirectory(o)) {
			searchForFile(file, o);
		}
	}
	//file not found in startDir
	return false;
}
*/
public class FileSearch {
	static boolean found = false;
	//Store the text that is found in the
	//file that is found in this String variable
	static String discoveredText = null;
	
	public static boolean searchForFile(String filename, String startDir) throws IOException {
		//implement
		File file = new File(startDir);	
		File[] fileSystemObjects = file.listFiles();
		
		if(fileSystemObjects != null) {
			for(File o: fileSystemObjects) {
				//base case
				if(o.isFile() &&  o.getName().equals(filename)) {
					discoveredText = Files.readString(Paths.get(o.getAbsolutePath()));
					found = true;
					break;
				}
				
				if(o.isDirectory()) {
					searchForFile(filename, o.getAbsolutePath());
				}
			}
		}
		//file not found in startDir
		return found;	
	}
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class compare {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//boolean areFilesIdentical = true;
	    File file1 = new File("./file1.txt");
	    File file2 = new File("./file2.txt");

	    if (!file1.exists() || !file2.exists()) {
	      System.out.println("One or both files do not exist");
	      System.out.println(false);
	    }

	   
	    if (file1.length() != file2.length()) {
	      System.out.println("lengths not equal");
	      System.out.println("length of file 1 : " + file1.length());
		    System.out.println("length of file 2 : " + file2.length());
	  
	    }
	    
	    if (file1.length() == file2.length()) {
		      System.out.println("Equal lengths");
		      System.out.println("length of files : " + file1.length());
		  
		    }
	    
	    BufferedReader reader1 = new BufferedReader(new FileReader("./file1.txt"));
        
        BufferedReader reader2 = new BufferedReader(new FileReader("./file2.txt"));
         
        String line1 = reader1.readLine();
         
        String line2 = reader2.readLine();
         
        boolean areEqual = true;
         
         
        while (line1 != null || line2 != null)
        {
            if(line1 == null || line2 == null)
            {
                areEqual = false;
                 
                break;
            }
            else if(! line1.equalsIgnoreCase(line2))
            {
                areEqual = false;
                 
                break;
            }
             
            line1 = reader1.readLine();
             
            line2 = reader2.readLine();
            
        }
         
        if(areEqual)
        {
            System.out.println("Two files have same content.");
        }
        else
        {
            System.out.println("Two files have different content. ");
             
          
        }
         
        reader1.close();
         
        reader2.close();
	    
	    
	}

}

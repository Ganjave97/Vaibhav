package mighty;

import java.io.File;
import java.io.IOException;
	import java.util.Arrays;
	import java.util.Scanner;

	public class FileHandle {
		static String fullfile;
		static String filepath="C:\\Users\\vaibhav\\Desktop\\java workplace\\Phase1proj\\";
		static File file;
		static boolean t=false;
		Scanner inputd= new Scanner( System.in );		
		public FileHandle() {
			
			System.out.println("\t******************************************");
			System.out.println("\t\tCreated By:Vaibhav Ganjave");
			System.out.println("\t******************************************");
			System.out.println("\t\t\tMenu");
			System.out.println("\t\t===================");
			System.out.println(" 1. Add a file");
			System.out.println(" 2. Delete a file");
			System.out.println(" 3. Search a file");
			System.out.println(" 4. Close the application\n");	
		}
		
		public static void msg() {
			Scanner inputd= new Scanner( System.in );
			System.out.println("Do you want to navigate to main menu press y (YES)?");
			String s=inputd.nextLine();
			if(s.equals("Y") || s.equals("y")) {
				
				t=true;
			}
			else
			{t=false;}
			
		}
		
			
		public static void CreateFiles() throws IOException  {
			
			boolean result;
			try {
				
				Scanner inputf= new Scanner( System.in );
			System.out.println("\n Please Enter the file name you want to add it in location "+filepath);
		         String s = inputf.nextLine().toLowerCase(); // Takes the filename with extension as the user input
		         fullfile=filepath.concat(s).concat(".txt");
		          file=new File(fullfile);
	        	 result=file.createNewFile();
	 					if(result==true) {
	 					System.out.println("File "+s+" was created in location: "+filepath);
	 					}//end if
	 					else
	 					{ file.exists();
	 						System.out.println("File "+s+" already exist in location "+file.getAbsolutePath());}
	 					msg();
				}//end try
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void DeleteFiles() throws IOException  {
			
			try {
				
				System.out.println("\n Please Enter the file you want to delete from location "+filepath);
			Scanner inputd= new Scanner( System.in );
		    String s =inputd.nextLine(); // Takes the filename with extension as the user input
		    fullfile=(filepath.concat(s).concat(".txt")).toLowerCase();
	       file=new File(fullfile);
	       if(file.exists()) {
	    	   if(file.delete()) {
				System.out.println("successfully to delete File "+s+" from "+filepath);
	    	   }
	    	   else
	    	   {System.out.print("Failed to delete the file "+s+" from "+filepath);}
	       }//end inner if
	       
	       else {
				System.out.print("File "+s+" Not Found in "+filepath);
	       }
	       msg();
			}//end try
			catch(Exception e){
				e.printStackTrace();
			}
		}
	

		
				public static void SearchFile() throws IOException{
			try {
				
				System.out.println("\n Please Enter the  file you want to search in location "+filepath);
				Scanner inputd= new Scanner( System.in );
			    String s =inputd.nextLine(); // Takes the filename with extension as the user input
			    fullfile=(filepath.concat(s).concat(".txt").toLowerCase());
			    file=new File(fullfile);
			    if(file.exists()) {
					System.out.println("File "+s+" is exist in location "+filepath);

			    }
			    else
			    {	System.out.println("File "+s+" does not exist in location "+filepath);}
			    msg();
			}			
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	    public static void operations(String x) throws IOException  {
	    	switch(x) {
	    		
	    	
	    	case "1":{
	    		CreateFiles();
	    		break;	
	    		}
	    	
	    	case "2":{
	    		DeleteFiles();
	    		break;	
	    	}
	    	
	    	case "3":{
	    		SearchFile();
	    	//	SearchFilewithPaternMatech();
	    		break;
	    	}
	   
	    	case "4":{
	    		System.out.print("the application closed");
    			System.exit(0);
	    		break;
	    	}
	    	}
	    	
	    }
		public static void main(String[] args) throws IOException {
			t=true;
			while(t) {
			new FileHandle();
			
			System.out.println("\n Please give your choice from the menu: ");
			Scanner scan=new Scanner(System.in);
			String Choice=scan.next();
			operations(Choice);
			
			/*System.out.println("Do you want to exit from program? ");
			String ex=scan.nextLine();
			if(ex.equalsIgnoreCase("Y")) {
				System.out.println("yes ");}*/
			}
		}
	}
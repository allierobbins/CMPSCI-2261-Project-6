package robbinsProject6;

public class robbinsProject6 {
		
	
		//hardcode of the 2 images 
		static int[][] image1 = {
								{0,1,0,0,0,0,0,0,0},
								{0,1,0,0,0,1,0,0,0},
								{0,1,1,1,0,0,1,0,0},
								{0,0,0,1,1,0,0,1,0},
								{0,0,0,0,1,0,0,1,0},
								{0,0,0,0,0,1,0,0,0},
								{0,0,0,0,0,0,1,0,0},
								{0,0,0,0,0,0,0,0,0}};

		static int[][] image2 = {
								{0,0,0,0,0,0,0,0,0},
								{0,1,1,1,1,0,1,0,0},
								{0,0,0,0,1,0,1,0,0},
								{0,0,1,1,1,0,1,0,0},
								{0,0,1,0,0,0,1,0,0},
								{0,0,1,0,0,0,1,0,0},
								{0,0,0,0,0,0,1,1,0},
								{0,0,0,0,0,0,0,0,0}};

		public static void main(String[] args){   
		    //System.out.println("First Image");
			//print(image1);

		    //System.out.println("Second Image");
		    //print(image2);
		    	
		    //variables to track location
		    int num1 = 0;
		    int num2 = 0;
		    
		    //find first 1 in image1
		    Outer: for (int i = 0; i <image1.length; i++) {
		    	for (int j = 0; j < image1.length; j++) {
		    		if(image1[i][j] == 1) {
		    			num1 = i;
		    			num2 = j;
		    			break Outer;
		    		}
		    	}
		    	}
		    
		    System.out.println("Tracing Image 1");
		    trace(image1, num1, num2);   //trace image 1
		    System.out.println();	//formating
		
		    
		   //find another instance of 1 in image1
		    Outer: for (int i = 0; i <image1.length; i++) {
	    	for (int j = 0; j < image1.length; j++) {
	    		if(image1[i][j] == 1) {
	    			num1 = i;
	    			num2 = j;
	    			break Outer;
	    			}
	    		}
		    	}
		    
		    trace(image1, num1, num2);	//retrace from 2nd 1 of image1
		
		    System.out.println();	//formating
		    System.out.println();
		    
		    
		    
		  //find first 1 on image2
		    Outer: for (int i = 0; i <image2.length; i++) {
		    	for (int j = 0; j < image2.length; j++) {
		    		if(image2[i][j] == 1) {
		    			num1 = i;
		    			num2 = j;
		    			break Outer;
		    		}
		    	}
		    	}
		    
		    System.out.println("Tracing Image 2");
		    trace(image2, num1, num2); //trace image 2
		    System.out.println();	//formating
		
		    
		   //find another instance of 1 in image 2
		    Outer: for (int i = 0; i <image2.length; i++) {
	    	for (int j = 0; j < image2.length; j++) {
	    		if(image2[i][j] == 1) {
	    			num1 = i;
	    			num2 = j;
	    			break Outer;
	    			}
	    		}
		    	}
		    
		    trace(image2, num1, num2);  //retrace from 2nd 1 in image 2
		
		    System.out.println();
		    System.out.println();
		    

		}
		public static void trace(int[][] array, int num1, int num2) {
			
			//beginning from inital point - search for '1' in order
			//print corresponding position 
			//set location to '0' to avoid backward tracing
			//recursive tracing from current location
			
			
			if (array[num1][num2+1] == 1) {			
				System.out.print(" 0 ");
				array[num1][num2] = 0;
				trace(array, num1, (num2+1));}
			
			else if (array[num1+1][num2] == 1) {
				System.out.print(" 6 ");
				array[num1][num2] = 0;
				trace(array, (num1+1), num2);}
			
			else if (array[num1-1][num2] == 1) {
				System.out.print(" 2 ");
				array[num1][num2] = 0;
				trace(array, (num1-1), num2);}
			
			else if (array[num1][num2-1] == 1) {
				System.out.print(" 4 ");
				array[num1][num2] = 0;
				trace(array, (num1), (num2-1));}
			
			else if (array[num1+1][num2+1] == 1) {
				System.out.print(" 7 ");
				array[num1][num2] = 0;
				trace(array, (num1+1), (num2+1));}
			
			else if (array[num1-1][num2-1] == 1) {
				System.out.print(" 5 ");
				array[num1][num2] = 0;
				trace(array, (num1-1), (num2-1));}
			
			else if (array[num1-1][num2-1] == 1) {
				System.out.print(" 3 ");
				array[num1][num2] = 0;
				trace(array, (num1-1), (num2-1));}
			
			else if (array[num1-1][num2+1] == 1) {
				System.out.print(" 1 ");
				array[num1][num2] = 0;
				trace(array, (num1-1), (num2+1));}

			else 
				array[num1][num2] = 0;
			};



		public static void print(int[][] array) {	//function to print array 
		    for(int i = 0; i < array.length; i++){
		        System.out.print("\n");
		            for(int k = 0; k < array.length; k++)
		                    System.out.print(array[i][k] + "   ");
		    }
		        System.out.println();
		}   
		
}

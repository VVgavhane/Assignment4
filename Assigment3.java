import java.util.Arrays;
import java.util.Scanner;


public class Assigment3{
	public static void main(String[] args) {
		Array1.methodOne();
		Array2.methodOne();
		Array3.methodOne();
		Array4.methodOne();
		Array5.methodOne();
		Array6.methodOne();
		Array7.methodOne();
		Array8.methodOne();
		Array9.methodOne();
		Array10.methodOne();
		Array11.methodOne();
		Array12.methodOne();
		Array13.methodOne();
		Array14.methodOne();
		
	}

}
 class Array1{
	 static void methodOne(){
		 int n;  
			Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements you want to store: ");   
			n=sc.nextInt();   
			int[] array = new int[n];  
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<n; i++)  
			{   
			array[i]=sc.nextInt();  
			} 
			int sum=0;
			for (int i = 0; i < array.length; i++) {
				sum=sum+array[i];
			}
			System.out.println("the sum is"+sum);
	 }
 }
 
 class Array2{
	 static void methodOne(){
		 int n;  
			Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements you want to store: ");   
			n=sc.nextInt();   
			int[] array = new int[n];  
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<array.length; i++)  
			{   
			array[i]=sc.nextInt();  
			} 
			System.out.println("Enter the target Integer");
			
			int target=sc.nextInt();
			int index=-1;
			for (int i = 0; i < array.length; i++) {
				if(array[i]==target){
					index=i;
					break;
				}
			}
			if (index == -1) {
			      System.out.println("Your target integer does not exist in the array");
			    } else {
			      System.out.println("Your target integer is in index " + index + " of the array");
			    }
	 }
 }
 
 class Array3{
	 static void methodOne(){
		 Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements you want to store: ");   
			int n=sc.nextInt();   
		 String[] strArray = new String[n];
		 System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<strArray.length; i++)  
			{   
				strArray[i]=sc.nextLine(); 
			    System.out.println("enter the next string element");
			} 
         boolean x = false;  
         int in = -1;
         System.out.println("enter the target");
         String s = sc.nextLine();   
        
         for (int i = 0; i < strArray.length; i++) {  
             if(s.equals(strArray[i])) {  
                 in = i; x = true; break;  
             }  
         }  
         if(x)  
             System.out.println(s +" String is found at index "+in);  
         else  
             System.out.println(s +" String is not found in the array");
	 }
 }
 
 class Array4{
	 static void methodOne(){
		 int n;  
			Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements you want to store: ");   
			n=sc.nextInt();   
			int[] array = new int[n];  
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<array.length; i++)  
			{   
			array[i]=sc.nextInt();  
			}
		 System.out.println("Array elements after sorting:");  
		 for (int i = 0; i < array.length; i++)   
		 {  
		 for (int j = i + 1; j < array.length; j++)   
		 {  
		 int tmp = 0;  
		 if (array[i] > array[j])   
		 {  
		 tmp = array[i];  
		 array[i] = array[j];  
		 array[j] = tmp;  
		 }  
		 }  
		 System.out.println(array[i]);  
		 }
		 System.out.println("Enter the target");
		 int value=sc.nextInt();
		 int l=0, r=array.length-1, index=-1;
		 while(l<=r){
			 int mid = l + (r - l) / 2;
	            if (array[mid] == value){
	                index=mid;
	            break;
	            }
	            
	            if (array[mid] < value)
	                l = mid + 1;
	            else
	                r = mid - 1;
		 }
		 if (index == -1) {
		      System.out.println("Your target integer does not exist in the array");
		    } else {
		      System.out.println("Your target integer is in index " + index + " of the array");
		    }
	 }
 }
 
 class Array5{
	 static void methodOne(){
		 int n;  
			Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements you want to store: ");   
			n=sc.nextInt();   
			int[] array = new int[n];  
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<array.length; i++)  
			{   
			array[i]=sc.nextInt();  
			}
		 for(int i=0;i<array.length - 1; i+=2){
		        int temp = array[i];
		        array[i] = array[i+1];
		        array[i+1] = temp;
		    }
		
	 }
 }
 
 class Array6{
	 static void methodOne(){
		 int n;  
			Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements you want to store: ");   
			n=sc.nextInt();   
			int[] array = new int[n];  
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<array.length; i++)  
			{   
			array[i]=sc.nextInt();  
			}
			int[] rev= new int[n];
			 for (int i =array.length-1, j=0; i < rev.length; i--,j++) {
				rev[j]=array[i];
			}
			 System.out.println(" the reversed array is ");
			 for (int i = 0; i < rev.length; i++) {
				System.out.print(rev[i]+"  ");
			}
	 }
 }
 
 class Array7{
	 static void methodOne(){
		 int n;  
			Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements you want to store: ");   
			n=sc.nextInt();   
			int[] array = new int[n];  
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<array.length; i++)  
			{   
			array[i]=sc.nextInt();  
			}
			int start=0 , end=array.length-1;
			int temp;
	          
	        while (start < end)
	        {
	            temp = array[start];
	            array[start] = array[end];
	            array[end] = temp;
	            start++;
	            end--;
	        } 
	        System.out.println("the reversed array is");
            for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+ "   ");
			}	        
	 }
 }
 
 class Array8{
	 static void methodOne(){
		 int n, count = 0;
		 Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements you want to store: ");   
			n=sc.nextInt();   
			int[] array = new int[n];
			int[] temp= new int[n];
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<array.length; i++)  
			{   
			array[i]=sc.nextInt();  
			}
		  System.out.print(" Array Before Removing Duplicates: ");
		  for (int i = 0; i < array.length; i++)
		    System.out.println(array[i]);

		  for (int i = 0; i < n; i++)
		  {
		    int j;
		    for (j = 0; j < count; j++)
		    {
		      if (array[i] == temp[j])
		        break;
		    }
		    if (j == count)
		    {
		      temp[count] = array[i];
		      count++;
		    }
		  }

		  System.out.println(" Array After  Removing Duplicates: ");
		  for (int i = 0; i < count; i++)
		   System.out.println(temp[i]);
	 }
 }
 
 class Array9{
	 static void methodOne(){
		 int n;
		 Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements you want to store: ");   
			n=sc.nextInt();   
			int[] array = new int[n];
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<array.length; i++)  
			{   
			array[i]=sc.nextInt();  
			}
			int j = 0;
	        for (int i=0; i < n-1; i++){  
	            if (array[i] != array[i+1]){  
	                array[j++] = array[i];  
	            }  
	        }  
	        array[j++] = array[n-1];  
	        System.out.println("the Array after the removal of duplicates");
	        for (int i = 0; i < j; i++) {
				System.out.println(array[i]);
			}
	        
	 }
 }
 
 class Array10{
	 static void methodOne(){
		 int n;
		 Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements in Array1 you want to store: ");   
			n=sc.nextInt();   
			int[] array1 = new int[n];
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<array1.length; i++)  
			{   
			array1[i]=sc.nextInt();  
			}
			System.out.print("Enter the number of elements in Array2 you want to store: ");   
			n=sc.nextInt();   
			int[] array2 = new int[n];
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<array2.length; i++)  
			{   
			array2[i]=sc.nextInt();  
			}
			int[] mergeArray= new int[array1.length+array2.length];
			for (int i = 0; i < array1.length; i++) {
				mergeArray[i]=array1[i];
			}
			for (int i = array1.length; i < mergeArray.length; i++) {
				mergeArray[i]=array2[i];
			}
			Arrays.sort(mergeArray);
			 System.out.println("the new array is");
			System.out.println(Arrays.toString(mergeArray));
			
	 }
 }
 class Array11{
	 static void methodOne(){
		 int n;
		 Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements you want to store: ");   
			n=sc.nextInt();   
			int[] array = new int[n];
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<array.length; i++)  
			{   
			array[i]=sc.nextInt();  
			}
			for (int i = 0; i < array.length-1; i++) {
				for (int j = i+1; j < array.length; j++) {
					if(array[i]>array[j]){
						int temp= array[i];
						array[i]=array[j];
						array[j]=temp;
					}
					
				}
				
			}
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]+"this is bubble sort");
				
			}
		 
	 }
 }
 
 class Array12{
	 static void methodOne(){
		 int L;
		 Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements you want to store: ");   
			L=sc.nextInt();   
			int[] array = new int[L];
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<array.length; i++)  
			{   
			array[i]=sc.nextInt();  
			}
			int n = array.length;
			  
	       
	        for (int i = 0; i < n-1; i++)
	        {
	           
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (array[j] < array[min_idx])
	                    min_idx = j;
	  
	            
	            int temp = array[min_idx];
	            array[min_idx] = array[i];
	            array[i] = temp;
	        }
	        for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]+"this is selection sort");
				
			}
		 
	 }
 }
 
 class Array13{
	 static void methodOne(){
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter 1st array size : ");
	       System.out.println("enter the no of rows");
	       int rows1=sc.nextInt();
	       System.out.println("enter the no of columns");
	       int columns1=sc.nextInt();
	       
	       System.out.println("Enter array elements : ");    
	        
	       int array1[][]=new int[rows1][columns1];
	        
	          
	        for(int i=0; i<rows1;i++)
	         {            
	            for(int j=0; j<columns1;j++)
	            {
	                array1[i][j]=sc.nextInt();
	            }
	         }
	        
	        
	        System.out.print("Enter 2nd array size : ");
		       System.out.println("enter the no of rows");
		       int rows2=sc.nextInt();
		       System.out.println("enter the no of columns");
		       int columns2=sc.nextInt();
		       
		       System.out.println("Enter array elements : ");    
		        
		       int array2[][]=new int[rows2][columns2];
		        
		          
		        for(int i=0; i<rows2;i++)
		         {            
		            for(int j=0; j<columns2;j++)
		            {
		                array2[i][j]=sc.nextInt();
		            }
		         }
	         
		        
		        if (rows2 != columns1) {
		        	  
		            System.out.println(
		                "\nMultiplication Not Possible");
		            return;
		        }
		        
		        int C[][] = new int[rows1][columns2];
		        
		    
		        for (int i = 0; i < rows1; i++) {
		            for (int j = 0; j < columns2; j++) {
		                for (int k = 0; k < rows2; k++)
		                    C[i][j] += array1[i][k] * array2[k][j];
		            }
		        }
		        
		        for (int i = 0; i < rows1; i++) {
		            for (int j = 0; j < columns2; j++)
		                System.out.print(C[i][j] + " ");
		  
		            System.out.println();
		        }
	 
	 }
 }
 
 class Array14{
	 static void methodOne(){
		 Scanner scanner= new Scanner(System.in);
		 System.out.println("Enter the string");
		 String str= scanner.nextLine();
		
	        int n = str.length();
	        Array14 permutation = new Array14();
	        permutation.permute(str, 0, n-1);
	 }
		 private void permute(String str, int l, int r)
		    {
		        if (l == r)
		            System.out.println(str);
		        else
		        {
		            for (int i = l; i <= r; i++)
		            {
		                str = swap(str,l,i);
		                permute(str, l+1, r);
		                str = swap(str,l,i);
		            }
		        }
		    }
		 public String swap(String a, int i, int j)
		    {
		        char temp;
		        char[] charArray = a.toCharArray();
		        temp = charArray[i] ;
		        charArray[i] = charArray[j];
		        charArray[j] = temp;
		        return String.valueOf(charArray);
		    }
 }
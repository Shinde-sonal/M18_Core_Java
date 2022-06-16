package array;

public class CGF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declares an Array of Integers.
		 Student1[] arr;
		 
		 //allocating memory for 5 objects of type Student.
		 arr= new Student1[5];
		 
		 //initialize the first elements of the array.
		 arr[0] = new Student1(1,"Sonal");
		 
		 //initialize the second elements of the array.
		 arr[1] = new Student1(2,"Sonam");
		 
		 //So on...
		 arr[2] = new Student1(3,"Ashwin");
		 arr[3] = new Student1(4,"Netra");
		 arr[4] = new Student1(5,"Narendra");
		 
		 //accessing the elements of the specified array.
		 
		 for(int i = 0; i<arr.length; i++)
			 System.out.println("Element at" +i +" : " + arr[i].roll_no +" " + arr[i].name);
	}

}

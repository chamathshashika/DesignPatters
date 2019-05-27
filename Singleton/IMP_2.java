/**
In this approch we will make createInstance method sencronized so only one thread  is allowed in that class and only one object will becreated insted of two.
**/

class IMP_2{

	private static IMP_2 instance = null;


	private IMP_2(){

	}

	/*
	* Now method is marked as synchronized hence only one threa will be allowed
	* to enter in this method hence only one object will be created.
	*/
	static synchronized IMP_2 createInstance(){
		if (instance == null) {
			instance = new IMP_2();
			System.out.println("create");
			return instance;
		}else{
			System.out.println("exist");
			return instance;
		}
	}


	public static void main(String[] args) {
		
		for (int i = 0; i < 10 ; i++ ) {
			
			System.out.println(createInstance());

		}

	}


}

/**
***Problem***
*The moment we use synchronized keyword it will create a problem for our multi-threaded 
*application in terms of performance. So on one side, we are resolving the problem on another side 
*we are creating one more problem. 
*In the next approach, we will solve both this problem.
**/


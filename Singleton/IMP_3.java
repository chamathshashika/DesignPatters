class IMP_3{

	/*
	 * This variable will be used to hold reference of IMP_3 class.
	 * 
	 * Here we are creating the instance of IMP_3 class and assigning the
	 * reference of that object to instance.
	 */

	private static IMP_3 instance = new IMP_3();


	private IMP_3(){

	}

	/*
	 * This method will be used to get instance of IMP_3 class. This method will
	 * check if there is already an object of class create or not if not then it
	 * will create an Object of IMP_3 class and return the same else it will
	 * return the existing Object.
	 * 
	 * synchronized keyword is not required here.
	 */

	static IMP_3 createInstance(){

		/*
		 *  As instance is already create and class loading time hence we can
		 *  directly return the same without creating any object.
		 */

		return instance;
	}


		public static void main(String[] args) {
		
		for (int i = 0; i < 10 ; i++ ) {
			
			System.out.println(createInstance());

		}

	}


}

/*** Problem
*Here we are creating the object of IMP_3 when class gets loaded. 
*The object gets created even when it is not required. 
*The object should be created only when it is required(Lazy Loading).  
*In the next approach, we will try to resolve this problem by using Double checking locking.
***/

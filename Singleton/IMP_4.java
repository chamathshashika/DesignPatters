class SingletonExample{

}


class IMP_4{


	private static IMP_4 instance = null;

	private IMP_4(){

	}

	/*
	 * This method will be used to get instance of IMP_4 class. This method will
	 * check if there is already an object of class create or not if not then it
	 * will create an Object of IMP_4 class and return the same else it will return
	 * the existing Object.
	 * 
	 * Now block is marked as synchronized instead of whole method. So synchronized
	 * part will be used only once and that is when object is null. 
	 */

	static IMP_4 createInstance(){

		if (instance == null) {
		
			synchronized(IMP_4.class){

				if (instance == null) {
					
					instance = new IMP_4();

					return instance;

				}

			}

		}

		return instance;


	}


		public static void main(String[] args) {
		
		for (int i = 0; i < 10 ; i++ ) {
			
			System.out.println(createInstance());

		}

	}


}

/**
****Problem****
*All problem has been solved in this approach still synchronized keyword is used(Once) and that should be avoided.
**/
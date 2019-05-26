class IMP_1{

	private static IMP_1 instance = null;
	//this variable will be hold the reference of IMP_1 class

	private IMP_1(){
		//As a private constructor is used, so cannot create object of this class derectly.
		//Except by using static method of same class.
	}

	//this method will be used to get instance of IMP_1 class.
	//this methos will check if there is already an object of class create or not then it will create an object of
	// IMP_1 class and return the same else it will return the existing object.

	static IMP_1  createInstance(){
		if (instance == null) {
			instance = new IMP_1();
			return instance;
		}else{
			return instance;
		}
	}


	// public static void main(String[] args) {
		

	// 	for (int i = 0; i < 10 ; i++ ) {
			

	// 		if (instance == null) {
	// 			System.out.println(IMP_1.createInstance() + " create");
	// 		}else{
	// 			System.out.println(createInstance() + " exist");
	// 		}


	// 	}


	// }


}
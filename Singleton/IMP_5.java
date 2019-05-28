/**
Initialization on Demond
**/
class IMP_5{

	private IMP_5(){

	}

	/*
	 * Here static inner class is used instead of Static variable. It means
	 * Object will be lazy initialized.
	 */

	private static class LazyInit{
		private static final IMP_5 instance = new IMP_5();
	}

	/*
	 * Whenever object IMP_5 is required this method will be invoked and it will
	 * return the instance of IMP_5.
	 */

	static IMP_5 createInstance(){
		return LazyInit.instance;
	}



	public static void main(String[] args) {
		
		for (int i = 0; i < 10 ; i++ ) {
			
			System.out.println(createInstance());

		}

	}


}
/**
*******Problem********
*What about Object creation using Clone and Serialization?? Next approach will handle that problem.
**/
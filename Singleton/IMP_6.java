/**
*To stop cloning of Object we will implement the Cloneable interface and throw CloneNotSupportedException. 
*Also Serialized interface will be implemented and readObject will be used to return only one object at all time.
**/

import java.io.Serializable;


class IMP_6 implements Cloneable, Serializable{

	@Override
	protected Object clone() throws CloneNotSupportedException{
		return new CloneNotSupportedException();
	}

	protected Object readResolve(){
		return createInstance();
	}

	private IMP_6(){

	}

	
	/*
	 * Here static inner class is used instead of Static variable. It means
	 * Object will be lazy initialized.
	 */
	private static class LazyInit{
		private static final IMP_6 instance = new IMP_6();
	}

	/*
	 * Whenever object IMP_6 is required this method will be invoked and it will
	 * return the instance of IMP_6.
	 */

	static IMP_6 createInstance(){
		return LazyInit.instance;
	}





	public static void main(String[] args) {
			
		for (int i = 0; i < 10 ; i++ ) {
				
			System.out.println(createInstance());

		}

	}



}
package mypackage;

class Exp {
	  int[] arr = new int[10];

	   void write() {

	    try {
	      arr[10] = 11;
	    }
	    
	    catch (NumberFormatException e1) {
	      System.out.println("NumberFormatException");
	    }
	    
	    catch (IndexOutOfBoundsException e2) {
	      System.out.println("IndexOutOfBoundsException ");
	    }

	  }
	}

	class Exception2 {
	  public static void main(String[] args) {
	    Exp e = new Exp();
	    e.write();
	  }
	}

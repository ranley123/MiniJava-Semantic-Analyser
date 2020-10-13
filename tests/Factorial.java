class Factorial{
    public static void main(String[] a){
    	System.out.println(1);
    }

}

class Fac{
    public int ComputeFac(int num, boolean yes){
	int num_aux ;
	if (num < 1) {
		num_aux = 1;
	}
	else{
		num_aux = num * (this.ComputeFac(1, true)) ;
	}
	return 1 ;
    }

}

class Factorial{
    public static void main(String[] a){
    	System.out.println(new Fac().ComputeFac(1, true));
    }

}

class Fac{
    public int ComputeFac(int num, boolean yes){
	int num_aux ;
	float er;
	if (num < 1) {
		num_aux = 1;
	}
	else{
		num_aux = num * (this.ComputeFac(1, true)) ;
	}
	er = df;
	return 1 ;
    }

}

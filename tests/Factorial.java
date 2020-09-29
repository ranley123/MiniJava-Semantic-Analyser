class Factorial{
    public static void main(String[] a){
    	System.out.println(new Fac().ComputeFac(10));
    }

}

class Fac{
	Fac i;
    public int ComputeFac(int num){
	int num_aux ;
	if (num < 1) {
		num_aux = 5 * 6;
	}
	else{
		num_aux = num * (this.ComputeFac(num-1)) ;
	}
	return 1 ;
    }



}
//class Temp{
//
//}

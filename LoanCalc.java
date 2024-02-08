 public static double bisectionSolver(double loan, double rate, int n, double epsilon) {  
    	// Replace the following statement with your code
		double eachyearpayment=-1;
		double h=loan/4,l=loan/n,g=(h+l)/2;
		double temploan=loan;
      while(Math.abs(eachyearpayment)>epsilon)
	  {
		for(int i=0;i<n;i++)// eachyear iteratetion
		{
          eachyearpayment=(temploan-g)*rate;
		   temploan=eachyearpayment;
		}
		if(eachyearpayment>0)//we should increase g
		{
            l=g;
			g=(l+h)/2;
		}
		else
		{
          h=g;
		  g=(l+h)/2;
		}
		temploan=loan;
		iterationCounter++;
		
		}
		
		return g;
    }

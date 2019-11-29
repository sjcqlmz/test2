package com.yu.test2;

import org.apache.commons.math3.stat.descriptive.moment.GeometricMean; 
import org.apache.commons.math3.stat.descriptive.moment.Mean; 
import org.apache.commons.math3.stat.descriptive.moment.Variance; 
import org.apache.commons.math3.stat.descriptive.summary.Product; 
import org.apache.commons.math3.stat.descriptive.summary.SumOfSquares;

	public class Mathtest {
		 double[] numbers = new double[5]; 
		 
	     public  void  setnum(double a,double b,double c,double d,double e) 
	     { 
	        numbers[0]=a;
	        numbers[1]=b;
	        numbers[2]=c;
	        numbers[3]=d;
	        numbers[4]=e;
	     }
	       
	       public void count1()
	       {
	    	    Mean mean = new Mean(); // 算术平均值 
		        
		        SumOfSquares sumOfSquares = new SumOfSquares(); // 平方和 
		        Product product = new Product();//乘积 
		        Variance variance = new Variance();//方差 
		        System.out.println("mean: " +mean.evaluate(numbers)); 
		        if(numbers[0]>0)
		        {
		        	 System.out.println("Product: " +product.evaluate(numbers)); 
		        }
		        else if(numbers[1]>0)
		             {
		        	System.out.println("Variance: " +variance.evaluate(numbers)); 
		              }
		             else
		             {
		            	 System.out.println("SumOfSquares: " +sumOfSquares.evaluate(numbers)); 	 
		             }
	       }
	       
	       public void count2()
	       {   
	    	   count1();
	    	   GeometricMean geoMean = new GeometricMean();//几何平均数
	    	   if(numbers[0]>0&&numbers[1]>0&&numbers[2]>0&&numbers[3]>0)
	    		   System.out.println("GeometricMean: " +geoMean.evaluate(numbers));
	    	   else
	    		   System.out.println("false");
	       }   
	       
	}

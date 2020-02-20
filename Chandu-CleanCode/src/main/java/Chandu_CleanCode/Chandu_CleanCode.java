package Chandu_CleanCode.Chandu_CleanCode;


import java.io.*;
import java.io.IOException;

public class Chandu_CleanCode  {
	public static void main(String[] args) throws IOException
	{
		SimpleAndCompoundInterest interest_obj = new SimpleAndCompoundInterest();
		interest_obj.calculateInterest();
		HouseConstructionCostEstimation house_obj= new HouseConstructionCostEstimation();
		house_obj.costCalculation();
	}
}

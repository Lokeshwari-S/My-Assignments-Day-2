package week1.day2;

public class FindIntersection {

	
	public static void main(String[]args) {
		
	int[]age= {3,2,11,4,6,7};
	int agelength= age.length;
	int[]score= {1,2,8,4,9,7};
	int scorelength=score.length;
	
	for(int i=0;i<agelength;i++) {
		System.out.println(age[i]);
	}
	for(int i=0;i<scorelength;i++) {
		System.out.println(score[i]);
	}
	if(agelength==scorelength)
		System.out.println("both the length are equal");
	else
		System.out.println("length are not equal");
}
}
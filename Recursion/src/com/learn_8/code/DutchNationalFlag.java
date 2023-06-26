package com.learn_8.code;


public class DutchNationalFlag {
	public void sortColors(int[] nums) {
        int count=0;
        int count_2=0;
        for(int num : nums){
            if(num==0){
                count++;
            }
            else if(num==1){
                count_2++;
            }
        }
        for(int i=0;i<count;i++){
            nums[i]=0;
            System.out.print(nums[i]+" ");
        }
         for(int i=count;i<count+count_2;i++){
            nums[i]=1;
            System.out.print(nums[i]+" ");
        }
         for(int i=count+count_2;i<nums.length;i++){
            nums[i]=2;
            System.out.print(nums[i]+" ");
        }
         
         
    }
	public static void main(String[] args) {
		int [] nums= {2,1,1,0,2,0};
		new DutchNationalFlag().sortColors(nums);
	}
}

import java.util.Arrays;

public class ArrayPrograms {
    public static void main(String[] args) {
        sumOfArrayElemenats(new int[]{10,2,30,4,5});
        searchElementInArray(new int[]{12,65,47,8,23}, 0);
        searchElementInArray(new int[]{12,65,47,8,23}, 8);
        findLargestInArray(new int[]{10,43,2,35,8});
        findSecondLargestInArray(new int[]{34,12,67,54,32});
        findLargestInArray(new int[]{-11,-56,-34,-2,0});
        findSecondLargestInArray(new int[]{-11,-56,-34,-2,0});
        rotateArrayToLeft(new int[]{1,2,3,4,5,6,7,8,9,0});
        rotateArrayToRight(new int[]{1,2,3,4,5,6,7,8,9,0});

    }

    public static void sumOfArrayElemenats(int[] nums){
        int sum = 0;
        for(int x : nums){
            sum = sum + x;
        }
        System.out.println("Sum of "+Arrays.toString(nums)+" : "+sum);
    }

    public static void searchElementInArray(int[] nums,int key){
        int i = 0;
        boolean flag = false;
        for(int x : nums){
            if(x == key){
                i++;
                flag = true;
                break;
            }else{
                i++;
                
            }
        }
        if(flag){
            System.out.println(key+" is in "+Arrays.toString(nums)+" at "+(i-1)+" index.");
        }else{
            System.out.println(key+" is not in "+Arrays.toString(nums));
        }
    }

    public static void findLargestInArray(int[] nums){
        int max = Integer.MIN_VALUE;
        int i = 0, index = 0;
        for(int x : nums){
            if(x > max){
                max = x;
                index = i;
            }
            i++;
        }
        System.out.println("Largest Number in "+Arrays.toString(nums)+" is : "+max+" at "+index+" index.");
    }

    public static void findSecondLargestInArray(int[] nums){
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for(int x : nums){
            if(x > max){
                secondMax = max;
                max = x;
            }
            if(x > secondMax && x < max){
                secondMax = x;
            }
        }
        System.out.println("Second Largest Number in "+Arrays.toString(nums)+" is : "+secondMax); 
    }

    public static void rotateArrayToLeft(int[] nums){
        System.out.println("Before Rotate To Left : "+Arrays.toString(nums));
        int temp = nums[0];
        for(int i=0 ; i<nums.length-1 ; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = temp;
        System.out.println("After Rotate To Left : "+Arrays.toString(nums));
    }

    public static void rotateArrayToRight(int[] nums){
        System.out.println("Before Rotate To Right : "+Arrays.toString(nums));
        int temp = nums[nums.length-1];
        for(int i=nums.length-1 ; i>0 ; i--){
            nums[i] = nums[i-1];
        }
        nums[0] = temp;
        System.out.println("After Rotate To Right : "+Arrays.toString(nums));
    }
}

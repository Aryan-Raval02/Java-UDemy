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
        copyArray(new int[]{23,34,45,5,6,6,7,7,8,8});
        copyReverseArray(new int[]{23,34,45,5,6,6,7,7,8,8});
        addMatrix();
        multiplyMatrix();
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

    public static void copyArray(int[] nums){
        int[] b = new int[nums.length];

        for(int i=0 ; i<nums.length ; i++){
            b[i] = nums[i];
        }

        System.out.println("Copied Array : "+Arrays.toString(b));
    }

    public static void copyReverseArray(int[] nums){
        int[] b = new int[nums.length];
        int counter=0;

        for(int i=nums.length-1 ; i>=0 ; i--){     // for(int i=nums.length-1,j=0 ; i>=0 ; i--,j++){
            b[counter] = nums[i];                  //     b[j] = nums[i];
            if(i == 0) continue;                   // }
            else counter++;
        }

        System.out.println("Copied Reverse Array : "+Arrays.toString(b));
    }

    public static void addMatrix(){
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{9,8,7},{6,5,4},{3,2,1}};

        int[][] ans = new int[3][3];

        for(int i=0 ; i<arr1.length ; i++){
            for(int j=0 ; j<arr2.length ; j++){
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        printMatrix(arr1);
        printMatrix(arr2);
        printMatrix(ans);

    }

    public static void printMatrix(int[][] matrix){
        for(int[] x : matrix){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }

    public static void multiplyMatrix(){
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{1,0,0},{0,1,0},{0,0,1}};

        int[][] ans = new int[3][3];

        for(int i=0 ; i<arr1.length ; i++){
            for(int j=0 ; j<arr2.length ; j++){
                for(int k=0 ; k<arr2.length ; k++){
                    ans[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }

        printMatrix(arr1);
        printMatrix(arr2);
        printMatrix(ans);
    }
}

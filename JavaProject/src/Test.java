public class Test {

    public static void main(String[] args) {
        int[] nums = {2,1,4,5,3,1,1,3};
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            if (i % 2 == 0){
                System.out.println(nums[i]);
                result += nums[i];
            }
        }
        System.out.println("result:"+result);
    }
}

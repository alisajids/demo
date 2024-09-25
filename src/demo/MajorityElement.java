package demo;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Phase 1: Find a candidate for the majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify if the candidate is the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Majority element is guaranteed to exist, so no need to check if count > 0
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2, 3, 3};

        int result = majorityElement(nums);

        System.out.println("The majority element is: " + result);
    }
}

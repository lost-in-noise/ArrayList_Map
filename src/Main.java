import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[10];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        System.out.println(nums[3]);


        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Sara");
        names.add("Jenny");
        names.add("Matius");

        System.out.println(names.get(0));

        System.out.println(names.size());
        names.remove("Jenny");
        System.out.println(names.size());


    }
}



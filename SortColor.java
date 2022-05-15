package Arrays;

public class SortColor {
    public static void main(String[] args) {
        int[]nums={2,0,2,1,1,0};
        sortColors(nums);
    }
    //counting sort
    public static void sortColors(int[]nums)
    {
        int red=0,white =0,black=0;
        for(int i:nums)
        {
            if(i==0)
            {
                red++;
            }
            else if(i==1)
            {
                white++;
            }
            else
            {
                black++;
            }

        }
        int i=0;
        while(red!=0)
        {
            nums[i++]=0;
            red--;
        }
        while(white!=0)
        {
            nums[i++]=1;
            white--;
        }
        while(black!=0)
        {
            nums[i++]=2;
            black--;
        }
    }
}

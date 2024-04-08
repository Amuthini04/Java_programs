class next{
    public static void main(String a[]){

        int sum = 0;
        int sum2=0;
        int n = 6;
        for(int i =0 ; i<=n;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
            else if(i%2!=0)
            {
                sum2+=i;

            }
             

        }
        System.out.printf("the even sum is %d\n",sum);
        System.out.printf("the odd sum is %d",sum2);
    }
}

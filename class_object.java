class greatest
{
    public int add(int n1,int n2,int n3)
    {
        if (n1>n2 && n1>n3)
        {
            return n1;
        }
        else if (n2>n1 && n2>n3)
        {
            return n2;
        }
        else
        {
            return n3;
        }
    }
}



public class class_object 
{
    public static void main(String a[])
    {
        greatest great = new greatest();

        int result = great.add(4,5,8);

        System.out.println(result);
    }

}

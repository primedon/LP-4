class FibbonacciSeries
{
    static int stepsCount=0;
    public static void main(String args[])
    {
        // fibbonacciSeries(5);
        int n=5;
        for(int i=0;i<5;i++)
        {
            System.out.println(recuursiveFibbonacciSeries(i));
        }
    }
    public static void fibbonacciSeries(int n){
        int a=0;
        int b=1;
        int stepcount=2;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n-2;i++)
        {
            int sum=a+b;
           
            a=b;
            b=sum;
            stepcount=stepcount+3;
            System.out.println(sum);
        }
        System.out.println(stepcount);
    }
    public static int recuursiveFibbonacciSeries(int n)
    {
        stepsCount++;
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return recuursiveFibbonacciSeries(n-1)+recuursiveFibbonacciSeries(n-2);
    }
}
class dectobin{
    public static void convert(int n)
    {
        int Arr[] = new int[40];
        int i=0;
        while(n>0){
            Arr[i]=n%2;
            n=n/2;
            i++;
        }
        for(int x=i-1;x>=0;x--)
        {
            System.out.println(Arr[x]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        convert(n:10);
    }
}
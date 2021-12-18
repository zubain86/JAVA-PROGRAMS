/*WAP TO PRINT A GIVEN PATTERN 1 
                               2 4
                               3 5 7
                               8 16 32 64
                               9 11 13 15 17*/ 
 class sixty
 {
     public static void main(String args[])
     {
         int i,j;int t=1,m=1;
         for(i=1;i<=5;i++)
         {
             if(i%2==0)
             {   
                 for(j=1;j<=i;j++)
       {         t = t*2;    
           System.out.print(t+"\t");
        }
    }
    else
    {
for(j=1;j<=i;j++)
{
System.out.print(m+"\t");
m = m+2;
}
}
System.out.println(" ");
}}}
             
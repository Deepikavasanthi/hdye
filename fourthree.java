Scanner sc=new Scanner(System.in);
        String s=sc.next(); int l=s.length(); int[] n=new int[ln];
        char[] c=new char[l];
        c=s.toCharArray();
        for(int i=0;i<l;i++)
         int i,j,n1;
        String sum="";
        for(i=0;i<l;i=i+2)
        {
            for(j=i+1;j<l;j=j+2)
            {
                n[i]=c[j];
                n1=n[i]-48;
                 for(int k=n1;k>0;k--){
                   sum=sum+c[i];
               }
               break;
            }
        }
         System.out.println("4 "+sum);
    }
}
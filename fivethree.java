Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=sc.nextInt();
        char[] c=s.toCharArray();
        int l1=s.length();
        int count=l;
        char c1=c[0];
        int i=1,j;
        for(i=1;i<l1;i++)
        {
            String s1="";
            s1=s1+c1+s.substring(i, (i+(l-1)));
            System.out.println(" "+s1);
        }
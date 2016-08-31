 int[] n=new int[50];
        int i,a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=0;i<a;i++){
            n[i]=sc.nextInt();
        }
        b=sc.nextInt();
       for(i=b;i<a;i++){
             System.out.println(""+n[i]);
         }
          for(i=0;i<b;i++){
            System.out.println(""+n[i]);
        }

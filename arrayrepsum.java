 int[] a={1,2,3,4};int[] c=new int[4];
       int[] b={3,4,5,6};int sum=0;
       for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
               if(a[i]==b[j]){
                c[i]= a[i];  
               }}}for(int i=0;i<4;i++){
           if(c[i]!=0){
               sum=sum+c[i];
           }}System.out.println(sum);
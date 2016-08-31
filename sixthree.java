for(i=0;i<a.length-1;i++)
        {int m=0;
            for(j=i+1;j<a.length;j++)
            {
             if(m<a[j])
                    m=a[j];
            }
            a[i]=m;
            System.out.println(""+a[i]);
        }if(i==a.length-1){
            a[i]=0;
        System.out.println(""+a[i]);}
    
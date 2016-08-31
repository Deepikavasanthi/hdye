Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();int l=s.length();
      char[] a=new char[l]; 
      a=s.toCharArray();
      for(int i=0;i<l;i++){
         for(int j=i+1;j<l;j++){
             if(a[i]!='\0'&&a[j]!='\0')
        if(a[i]==a[j]){
            a[i]='\0';
            a[j]='\0';
        }}}for(int i=0;i<l;i++){
            if(a[i]!='\0'){
                System.out.print(a[i]);
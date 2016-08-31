 Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();int l=s.length();
         char[] c=s.toCharArray();int count=0;
    for(int i=0;i<l;i++){
 if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
count++;     
 } }System.out.println(count);
 Scanner sc=new Scanner(System.in);
 String s=sc.nextLine();
  String s1=new StringBuffer(s).reverse().toString();int l=s1.length();
  char[] c=new char[l]; 
  c=s1.toCharArray();
  for(int i=0;i<l;i++){
      System.out.print(c[i]);
if(i<l){
    System.out.print("-");
}
  }
String[] sortByLength(String[] a) {
    int b[]=new int[a.length];
    for(int i=0;i<a.length;i++) b[i]=i;
    for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
            if(a[i].length()>a[j].length()){
                String t=a[i];
                a[i]=a[j];
                a[j]=t;
                int c=b[i];
                b[i]=b[j];
                b[j]=c;
            }else if(a[i].length()==a[j].length()){
                if(b[i]>b[j]){
                    String t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                    int c=b[i];
                    b[i]=b[j];
                    b[j]=c;
                }
            }
        }
    }
    return a;
}

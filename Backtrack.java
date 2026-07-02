class Backtrack{
     static void cnt( int i,int n){
        if(i<n){
            return;
        }
        cnt(i-1,n);
        System.out.println(i);
     }
    public static void main(String args[]){
     cnt(100,1);
    }
}




class Quicksor{

  static  int part(int arr[],int st,int end){
        int idx=st-1;
        int pvt=arr[end];
        for(int j=st;j<end;j++){
            if(arr[j]<=pvt){
                idx++;
                int temp=arr[j];
                arr[j]=arr[idx];
                arr[idx]=temp;
            }
        }
                idx++;
                int temp=arr[end];
                arr[end]=arr[idx];
                arr[idx]=temp;

                return idx;
    }
static void quick(int arr[],int st,int end){
    if(st<end){
        int pvtidx=part(arr,st,end);
        quick(arr,st,pvtidx-1);
        quick(arr,pvtidx+1,end);

    }
}

    public static void main(String arrr[]){
        int arr []={9,8,7,6,5,4};
        quick(arr,0,arr.length-1);

        for( int i : arr){
            System.out.print(i+" ");
        }
    }
}
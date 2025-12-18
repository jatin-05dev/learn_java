//largest elemet 
//bruteforce//
// import java .util.*;
// class arrayq{
    // public static void main(String args[]){
    //    int arr[]={5,65,54,856};
        // Arrays.sort(arr);
        // System.out.print(arr[arr.length-1]);
    // }
// }
//smallest

// import java .util.*;
// class arrayq{
    // public static void main(String args[]){
    //    int arr[]={5,65,54,856};
        // Arrays.sort(arr);
        // System.out.print(arr[0]);
    // }
// }
// 
//optimal
// import java .util.*;
// class arrayq{
//     public static void main(String args[]){
//        int arr[]={5,65,54,856};
//        int lar=arr[0];
//        for(int i=0;i<arr.length;i++){
//         if(arr[i]>lar){
//             lar=arr[i];
           
//         }
          

//        }
//        System.out.print(lar);
       
//     }

// 
//second  largest
//brute


// import java.util.*;
// class arrayq{
    // public static void main(String args[]){
        // int[] arr={6,6456,6456,65,6,65,6};
        // galt// Arrays.sort(arr);
        // System.out.print(arr[arr.length-2]);
        // int lar=arr.length-1;
        // for(int i= arr.length-2;i>0;i--){
            // if(arr[i]!=lar){
                // lar=arr[i];
                // break;
            // }
// 
        // }
        // System.out.print (lar);
    // }
// }
//second smllaset
//brute

// import java.util.*;
// class arrayq{
    // public static void main(String args[]){
        // int[] arr={1,5,7,9,6,3,1};
        //  Arrays.sort(arr);
        // int sml=arr[0];
        // for(int i= arr[1];i<arr.length;i++){
            // if(arr[i]!=sml){
                // sml=arr[i];
                // break;
            // }
// 
        // }
        // System.out.print (sml);
    // }
// }

 
//better
// import java.util.*;
// class arrayq{
    // public static void main(String args[]){
        // int[] arr={6,6456,6456,65,6,65,6};
        // int lar=arr[0];
        // for(int i=0;i<arr.length;i++){
            // if(arr[i]>lar){
                // lar =arr[i];
// 
            // }
// 
        // }
        // int sl=-1;
        // for(int i=0;i<arr.length;i++){
            // if(arr[i]>sl && arr[i] !=lar){
                // sl=arr[i];
            // }
        // }
        // System.out.print(sl);
    // }
// }
//better second smllest 
// import java.util.*;
// class arrayq{
    //  public static void main(String args[]){
        // int arr[]={1,1,5,4,8,7,2,3,4};
        // int sml=arr[0];
        // for(int i=1;i<arr.length;i++){
            // if(arr[i]<sml){
                // sml=arr[i];
            // }
// 
        // }
        // int ss=Integer.MAX_VALUE;
        // for(int i=0;i<arr.length;i++){
            // if(arr[i]<ss && arr[i] != sml){
                // ss=arr[i];
            // }
        // }
        // System.out.print(ss);
    //  }
// }
//optimal

// import java.util.*;
// class arrayq{
    // public static void main(String args[]){
        // int[] arr={1,5,8,9,6,4,3,1,5};
        // int lar=arr[0];
        // int sl=-1;
        // for(int i=1;i<arr.length;i++){
            // if(arr[i]>lar){
            //    sl= lar;
            //    lar=arr[i];
// 
            // }
            // else if(arr[i]<lar && arr[i]>sl)
            // {
            //    sl=arr[i];
            // }
// 
        // }
        // System.out.print(sl);
    // }
// }
//optimal app smllast
// import java.util.*;
// class arrayq{
    // public static void main(String args[]){
        // int[] arr={1,5,8,9,6,4,3,1,5,2,56,-58,-20};
        // int sml=arr[0];
        // int ss=Integer.MAX_VALUE;
        // for(int i=1;i<arr.length;i++){
            // if(arr[i]<sml){
            //    ss=sml;
            //    sml=arr[i];
// 
            // }
            // else if(arr[i]<ss && arr[i]>sml)
            // {
            //    ss=arr[i];
            // }
// 
        // }
        // System.out.print(ss);
    // }
// }

//s/heck id=f array is sorted
// class arrayq{
//     public static void main(String args[]){
//      int arr []={ 1,2,3,4,6,7,8};
//      for(int i=1;i<arr.length;i++){
//         if(arr[i]>=arr[i-1]){
        
             
//         }
//         else{
//             System.out.print("arr is not");
//             return ;
//         }
//      }
//      System.out.print("YES");
//     }
// }
//removw duplicate from arr
// import java.util.*;
// class arrayq{
//     public static void main(String args[]){
//      int arr []={ 1,2,2,3,3,4,8};
//      LinkedHashSet<Integer>set=new  LinkedHashSet<>();
//      for(int num : arr){
//         set.add(num);
//      }
//      for(int num :set){
//         System.out.print(num);
//      }
//     }
// }
// ..arr ke andr hi over wri
// te
// import java.util.*;
// class arrayq{
    // public static void main(String args[]){
    //  int arr []={ 1,2,2,9,3,8,8};
    //  LinkedHashSet<Integer>set=new  LinkedHashSet<>();
    //  for(int num : arr){
        // set.add(num);
    //  }
    //  int idx=0;
// 
    //  for(int x :set){
        // arr[idx]=x;
        // idx++;
    //  }
    //  System.out.print(idx);
    //  for(int i=0;i<idx;i++){
        // System.out.print(arr[i]);
    //  }
    // }
// }

 //optimal 
//  import java.util.*;
// class arrayq{
    // public static void main(String args[]){
    //  int arr []={1,2,2,3,4,5,5,7,7,9,10,11,25,48,48,60};
// 
    //  int i=0;
    //  for(int j=1;j<arr.length;j++){
        // if(arr[i] !=arr[j]){
            // arr[i+1]=arr[j];
            // i++;
        // }
    //  }
    //  System.out.print(i+1);
    //  for(int k=0;k<i+1;k++){
        // System.out.print(arr[k]);
    //  }
// 
// 
// 
// 
        //  }
// }
//missing number brute
//  class arrayq {
//     public static void main(String args[]) {
//         int arr[] = {1, 2, 4,7,9};
//         for(int i = 1; i <=  arr.length + 1; i++) {  // check numbers 1 to max possible
//             int flag = 0;
//             for(int j = 0; j < arr.length; j++) {   // check all array elements
//                 if(arr[j] == i) {
//                     flag = 1;
//                     break;
//                 }
//             }
//             if(flag == 0) {
//                 System.out.print(i + " ");  // print the missing number
//             }
//         }
//     }
// }

//better
//missing number
// class arrayq {
    // public static void main(String args[]) {
        // int arr[] = {1, 2, 3, 5};
        // int hasharr[] = new int[arr.length + 2]; // +2 to handle max number safely
// 
        // Mark existing numbers in hash array
        // for(int i = 0; i < arr.length; i++){
            // hasharr[arr[i]] = 1;
        // }
// 
        // Find missing numbers
        // for(int i = 1; i < hasharr.length; i++){
            // if(hasharr[i] == 0){
                // System.out.println("Missing number: " + i);
            // }
        // }
    // }
// }

//optimal of missing number 
// class arrayq {
    // public static void main(String args[]) {
        // int arr[] = {1, 2, 3, 5,7};
        // int n = arr.length + 1; // because one number is missing

        // XOR of all numbers from 1 to n
        // int xor1 = 0;
        // for(int i = 1; i <= n; i++){
            // xor1 ^= i;
        // }

        // XOR of all elements in the array
        // int xor2 = 0;
        // for(int i = 0; i < arr.length; i++){
            // xor2 ^= arr[i];
        // }

        // XOR of xor1 and xor2 gives the missing number
        // int missing = xor1 ^ xor2;
        // System.out.println("Missing number: " + missing);
    // }
// }
//optimal of maximu cosecutive ones 
// class arrayq{
//   public static void main(String args[]){
    // int max=0;
    // int cnt=0;
    // int arr[]={1,1,1,1,0,0,0,1,1,0,0,1,1,1,1,1};
    // for(int i=0;i<arr.length;i++){
        // if(arr[i]==1){
            // cnt++;
            // max=Math.max(max,cnt);  
        // }
        // else{
            // cnt=0;
        // }
    // }
    // System.out.print(max);
//   }
// }

//find the numbrer that appears ones 
// class arrayq{
    // public static void main(String args[]){
        //   int arr[]={1,2,2,3,3,4,4,5,5,6,6};
        //   
        //   for(int i=0;i<arr.length;i++){
            // int num=arr[i];
            //  int cnt =0;
            // for(int j=0;j<arr.length;j++){
            // 
                // if(arr[j]==num){
                    // cnt++;
                // }
                // 
            // }
            //  if(cnt==1){ System.out.print(num);}
        //   }
    // }
// }
//better
  
  
    //   
        //   class arrayq {
    // public static void main(String args[]) {
        // int arr[] = {2, 3, 5, 4, 5, 3, 4}; // 2 non-repeating hai
        // int max = 0;

        // find maximum number to size hash array
        // for (int num : arr) {
            // if (num > max) max = num;
        // }

        // int hashArr[] = new int[max + 1]; // frequency array

        // count frequency
        // for (int num : arr) {
            // hashArr[num]++;
        // }

        // find non-repeating number
        // for (int i = 0; i < hashArr.length; i++) {
            // if (hashArr[i] == 1) {
                // System.out.println("Non-repeating number is: " + i);
            // }
        // }
    // }


// import java.util.*;
// class arrayq {
    // public static void main(String args[]) {
        // int arr[] = {2, 3, 5, 4, 5, 3, 4}; // 2 non-repeating hai
// 
        // HashMap<Integer, Integer> map = new HashMap<>();
// 
        // frequency count
        // for (int num : arr) {
            // map.put(num, map.getOrDefault(num, 0) + 1);
        // }
// 
        // find non-repeating numbers
        // for (int key : map.keySet()) {
            // if (map.get(key) == 1) {
                // System.out.println("Non-repeating number is: " + key);
            // }
        // }
    // }
// }


// class arrayq {
    // public static void main(String args[]) {
        // int arr[] = {2, 3, 5, 4, 5, 3, 4}; // 2 non-repeating hai


//   int xor1=0;
//   for(int i=0;i<arr.length;i++){
    // xor1^=arr[i];
//   }
//   System.out.print(xor1);
    //    }
//    }

//move the arr by one place

//optimal
// class arrayq{
//     public static void main(String args[]){
//         int arr[]={1,2,5,4,3};
//         int temp=arr[0];
//         for(int i=1;i<arr.length;i++){
//             arr[i-1]=arr[i];
//         }
//         arr[arr.length-1]=temp;
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]);
//         }
//     }

// }

// /class arrayq{
// /    public static void main(String args[]){
// /        int arr[]={1,2,5,4,3};
// /        int temp=arr[0];
// /        for(int i=1;i<arr.length;i++){
// /            arr[i-1]=arr[i];
// /        }
// /        arr[arr.length-1]=temp;
// /        for(int i=0;i<arr.length;i++){
// /            System.out.print(arr[i]);
// /        }
// // /    }/

// // /}/
// /
//move zero to end 
// class arrayq{
    // public static void main(String args[]){
        // int arr[]={1,0,2,0,5,0,4,3,5,0};
        // int  temp[]=new int[arr.length];
        // int j=0;
        // for(int i=0; i<arr.length;i++){
            // if(arr[i]!=0){
                // temp[j]=arr[i];
                // j++;
            // }
        // }
        // for(int k=0;k<temp.length;k++){
            // arr[k]=temp[k];
        // }
        // for(int p=temp.length;p<arr.length;p++){
            // arr[p]=0;
        // }
        // for(int h=0;h<arr.length;h++){
            // System.out.print(arr[h]);
        // }
// 
    // }
// 
// }

// class arrayq{
    // public static void main(String args[]){
        // int arr[]={1,0,2,0,5,0,4,3,5,0};
        // int  temp[]=new int[arr.length];
        // int j=0;
        // for(int i=0; i<arr.length;i++){
            // if(arr[i]!=0){
                // temp[j]=arr[i];
                // j++;
            // }
        // }
        // for(int k=0;k<temp.length;k++){
            // arr[k]=temp[k];
        // }
        // for(int p=temp.length;p<arr.length;p++){
            // arr[p]=0;
        // }
        // for(int h=0;h<arr.length;h++){
            // System.out.print(arr[h]);
        // }
// 
    // }
// 
// }

// class  arrayq {
//     public static void main(String[] args) {
//         int arr[] = {1, 0, 2, 0, 5, 0, 4, 3, 5, 0};

//         int n = arr.length;
//         int left = 0;  // slow pointer
//         for (int right = 0; right < n; right++) {
//             if (arr[right] != 0) {
//                 // swap arr[left] and arr[right]
//                 int temp = arr[left];
//                 arr[left] = arr[right];
//                 arr[right] = temp;
//                 left++;
//             }
//         }

//         // print result
//         for (int x : arr) {
//             System.out.print(x + " ");
//         }
//     }
// }

// import java.util.*;
// 
// class UnionArray {
    // public static void main(String[] args) {
        // int arr1[] = {1, 2, 3, 4, 5};
        // int arr2[] = {3, 4, 5, 6, 7};

        // Set banate hai
        // Set<Integer> set = new HashSet<>();
// 
        // arr1 ke elements add karo
        // for (int num : arr1) {
            // set.add(num);
        // }
// 
        // arr2 ke elements add karo
        // for (int num : arr2) {
            // set.add(num);
        // }
// 
        // Print union
        // System.out.println("Union of arrays: " + set);
    // }
// }
// 

// class UnionTwoPointer {
    // public static void main(String[] args) {
        // int arr1[] = {1, 2, 3, 4, 5};
        // int arr2[] = {3, 4, 5, 6, 7};
// 
        // int i = 0, j = 0;
        // int n1 = arr1.length, n2 = arr2.length;
// 
        // System.out.print("Union: ");
        // while (i < n1 && j < n2) {
            // agar dono equal hain, ek hi baar print karo
            // if (arr1[i] == arr2[j]) {
                // System.out.print(arr1[i] + " ");
                // i++;
                // j++;
            // }
            // chhota element print karo aur aage badho
            // else if (arr1[i] < arr2[j]) {
                // System.out.print(arr1[i] + " ");
                // i++;
            // } else {
                // System.out.print(arr2[j] + " ");
                // j++;
            // }
        // }
// 
        // bache hue elements
        // while (i < n1) {
            // System.out.print(arr1[i] + " ");
            // i++;
        // }
        // while (j < n2) {
            // System.out.print(arr2[j] + " ");
            // j++;
        // }
    // }
// }



class IntersectionTwoPointer {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};

        int i = 0, j = 0;
        int n1 = arr1.length, n2 = arr2.length;

        System.out.print("Intersection: ");
        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}




 
 
 
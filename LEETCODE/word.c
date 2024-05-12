#include<stdio.h>
void quickSort(int arr[],int si,int ei){
    if (si>=ei)
    {
        return;
    }
    
    int mid=(si+ei)/2; //pivot
    int left=si;
    int right=ei;

    while (left<=right)
    {
      while (arr[left]<arr[mid])
      {
        left++;
      }
      while (arr[right]>arr[mid])
      {
        right--;
      }
      if (left<=right)
      {
        int tem=arr[left];
        arr[left]=arr[right];
        arr[right]=tem;
        left++;
        right--;
      }
    }
    quickSort(arr,si,right);
    quickSort(arr,left,ei);
    
}
int max(int arr[],int si,int ei){
  if (si>=ei)
  {
    return arr[si];
  }
  int mid=si+(ei-si)/2;
  int a=max(arr,si,mid);
  int b=max(arr,mid+1,ei);
  return (a>b)?a:b;
}
int min(int arr[],int si,int ei){
  if (si>=ei)
  {
    return arr[si];
  }
  int mid=si+(ei-si)/2;
  int a=min(arr,si,mid);
  int b=min(arr,mid+1,ei);
  return (a<b)?a:b;
}
int main(){
    int arr[]={5,2,10,1,0,-8,45,1};
    int i;
    int ei=sizeof(arr)/sizeof(arr[0])-1;
    // quickSort(arr,0,ei);
    // for ( i = 0; i <= ei; i++)
    // {
    //    printf("%d  ",arr[i]);
   // }
   printf("MAX = %d \nMIN = %d ",max(arr,0,ei),min(arr,0,ei));
    

    return 0;
}
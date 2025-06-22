#include<iostream>
using namespace std;
void sumofArray(int arr[],int size){
  int sum=0;
  for(int i=0;i<size;i++){
    sum+=arr[i];
  }
  cout<<"Sum of the elements of the array is:"<<sum<<" ";
}
int main(){
  cout<<"Enter the size of the array:"<<endl;
  int size;
  cin>>size;
  int arr[100];
  cout<<"Enter the elements of the array:"<<endl;
  for(int i=0;i<size;i++){
    cin>>arr[i];
  }
  sumofArray(arr,size);
  return 0;
}

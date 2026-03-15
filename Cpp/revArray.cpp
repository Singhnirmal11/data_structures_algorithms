#include<iostream>
using namespace std;
void reverseArray(int arr[],int size){
  int rev=0;
  for(int i=0;i<size;i++){
    rev=arr[i];
    arr[i]=arr[size-1];
    arr[size-1]=rev;
    size--;
  }
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
  reverseArray(arr,size);
  cout<<"Reversed array is:"<<endl;
  for(int i=0;i<size;i++){
    cout<<arr[i]<<" ";
  }
  return 0;
}
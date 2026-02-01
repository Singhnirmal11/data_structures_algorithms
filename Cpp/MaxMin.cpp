#include<iostream>
using namespace std;

void getMin(int arr[],int size){
  int min=INT_MAX;
  for(int i=0;i<size;i++){
    if(arr[i]<min){
      min=arr[i];
    }
  }
  cout<<"Minimum element is:"<<min<<endl;
}

void getMax(int arr[],int size){
  int max=INT_MIN;
  for(int i=0;i<size;i++){
    if(arr[i]>max){
      max=arr[i];
    }
  }
  cout<<"Maximum element is:"<<max<<endl;
}

int main(){
 int arr[100];
 int size;
 cout<<"Enter the size of the array:"<<endl;
  cin>>size;
  cout<<"Enter the elements of the array:"<<endl;
  for(int i=0;i<size;i++){
    cin>>arr[i];
  }
  getMin(arr,size);
  getMax(arr,size);
  return 0;
}
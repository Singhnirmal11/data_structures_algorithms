#include<iostream>
using namespace std;
bool search(int arr[],int size,int key){
  for(int i=0;i<size;i++){
    if(arr[i]==key){
      return true;
    }
  }
  return false;
}

int main(){
  cout<<"Enter the size of the array:"<<endl;
  int size;
  cin>>size;
  cout<<"Enter the value of the key"<<endl;
  int key;
  cin>>key;
  int arr[100];
  cout<<"Enter the elements of the array:"<<endl;
  for(int i=0;i<size;i++){
    cin>>arr[i];
  }
  search(arr,size,key);
  if(search(arr,size,key)==true){
    cout<<"Element found"<<endl;
  }
  else{
    cout<<"Element not found"<<endl;
  }
  return 0;
  }
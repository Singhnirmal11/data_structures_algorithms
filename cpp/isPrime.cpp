#include<iostream>
#include<cmath>
using namespace std;
int main(){
  int n;
  cin>>n;
  bool isPrime=1;
  for(int i=2;i<=sqrt(n);i++){
    if(n%i==0){
      isPrime=0;
      break;
    }
  }
  if (isPrime==0){
    cout<<"Not a Prime Number"<<endl;
  }
  else{
    cout<<"Prime Number"<<endl;
  }
}
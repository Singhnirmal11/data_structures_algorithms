// 1 21 321 4321 Pattern
#include<iostream>
using namespace std;
int main(){
  int count=0;
  int n;
  cin>>n;
  for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
      cout<<(i-j+1)<<" ";
    }
    cout<<endl;
  }
} 
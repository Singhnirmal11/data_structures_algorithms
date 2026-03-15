// A BC DEF GHIJ Pattern
#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int count=0;
  char ch;
  for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
      ch='A'+count;
      cout<<ch<<" ";
      count++;
    }
    cout<<endl;
  }
}
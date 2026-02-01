// ABC DEF GHI Pattern
#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  char ch;
  int count=0;
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
      ch='A'+count;
      cout<<ch<<" ";
      count++;
    }
    cout<<endl;
  }
}
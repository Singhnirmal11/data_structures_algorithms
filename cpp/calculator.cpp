#include<iostream>
using namespace std;
int main(){
  int a,b;
  cout<<"Enter two numbers"<<endl;
  cin>>a>>b;
  char choice;
  cout<<"Enter + for addition, - for subtraction, * for multiplication and / for division"<<endl;
  cin>>choice;
  switch (choice)
  {
  case '+':
    cout<<a+b;
    break;
  
  case '-':
    cout<<a-b;
    break;
  
  case '*':
    cout<<a*b;
    break;
  
  case '/':
    cout<<a/b;
    break;
  
  default:
  cout<<"Invalid Choice";
    break;
  } 
}
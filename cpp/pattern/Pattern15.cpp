/*

   *
  **
 ***
****

*/  
 
#include<iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    for(int i = 1; i <= n; i++) {
        // Print spaces
        for(int space = 0; space < n - i; space++) {
            cout << " ";
        }
        // Print stars
        for(int j = 1; j <= i; j++) {
            cout << "*";
        }
        cout << endl;
    }
}

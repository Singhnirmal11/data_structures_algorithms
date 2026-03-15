/*
   1
  121
 12321
1234321
*/

#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    for (int i = 1; i <= n; i++) {
        // Print spaces
        for (int space = 0; space < n - i; space++) {
            cout << " ";
        }
        // Print 1st triangle
        for (int j = 1; j <= i; j++) {
            cout << j;
        }
        // Print 2nd triangle in reverse order
        for (int start = i - 1; start >= 1; start--) {
            cout << start;
        }
        cout << endl;
    }
    return 0;
}


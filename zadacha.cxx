//Напрягай мозги чаще чтобы быть лучше:)

#include<iostream>

using namespace std;

int foo(int n) {
	int result = 1;
	for (int i = 2; i <= n; i++) {
		result *= i;
	}
	return result;
}

int main() {
	cout << foo(3) << endl;
}

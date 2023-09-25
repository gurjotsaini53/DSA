
#include <iostream > 
using namespace std;


int main()
{
	int n ; 
    cin >> n ; 
    int arr[n] ; 
    for(int  i=  0; i< n;i++)
    {
        cin >> arr[i];
    }

    int flag = 0 

    for (int i = 1; i < n; i++) {
		int Sum1 = 0;
		for (int j = i - 1; j >= 0; j--) {
			Sum1 += arr[j];
		}

		int Sum2 = 0;
		for (int k = i + 1; k < n; k++) {
			Sum2 += arr[k];
		}

		if (Sum1 == Sum2) {
			cout<<  arr[i];
            flag = 1 ;
		}


	}
    if (flag==0)
    {
        cout<<"not exist" ;
    }
}

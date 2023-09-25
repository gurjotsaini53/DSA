#include <iostream>
using namespace std ;

void printarray(int arr[],int size)
{
    for (int i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
     }
     cout<<"printingDone"<<endl;
}
int main(){
    // array declaration  ;

    int integer[100];
    char character[20];
    double doublenumber[2];
    
   // declaration by size
    int arr1[10]={0};
    printarray(arr1,10);

    int arr2[]={10,20,30,40};
    printarray(arr2,4);

    int arr3[4-1]={20,20,20};
    printarray(arr3,3);

    int arr4[10]={1,2,31,2100,300};
    printarray(arr4,10);

    int arr5[3]={};
    printarray(arr5,3);

  //   int arr6[4] ={[0...2]=100};  invalid in c++
    printarray(arr5,4);
    /// accessing element (random acess)

    cout<<"element at 1 index "<<arr4[1]<<endl;
    cout<<"element at 4 index "<<arr4[4]<<endl;
    cout<<"element at 6 index "<<arr4[6]<<endl;
    cout<<"element at 7 index "<<arr4[7]<<endl;

    // 

    
    cout<<"element at 3 index "<<*(arr4+1)<<endl;
    cout<<"element at 4 index "<<*(arr4+4)<<endl;
    cout<<"element at 6 index "<<*(arr4+6)<<endl;
    cout<<"element at 7 index "<<*(arr4+7)<<endl;
   //


      cout<<"element at 1 index "<<1[arr4]<<endl;
    cout<<"element at 4 index "<<4[arr4]<<endl;
    cout<<"element at 6 index "<<6[arr4]<<endl;
    cout<<"element at 7 index "<<7[arr4]<<endl; 


   // size
   cout<<"size of arr4 in bytes =  "<<sizeof(arr4)<<endl;
   cout<<"size of arr4 (or length of arr4 )= "<<sizeof(arr4)/sizeof(int)<<endl;

  // no index out of bound checking in cpp
  // if used it may produce the unexpected output 
   int arr6[2] ={100,200}; 

   cout<<arr6[6]<<endl;
   cout<<arr6[-2]<<endl;


}
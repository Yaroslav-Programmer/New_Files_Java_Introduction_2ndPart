package com.company;
import java.lang.String;
public class NewArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int len = arr.length - 1;
        isArrayIncreasing(arr, len);
    }

    public static boolean isArrayIncreasing(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            if (i + 1 >= len) {
                System.out.println("some text");
                return true;
            } else
                System.out.println("No text False");

        }
        return false;
    }
}
/*Дана последовательность целых чисел. Узнать является ли она строго возрастающей.
Строго возрастающая последовательность означает, что каждое следующее число больше предыдущего.


#include <iostream>

int main()
{
    setlocale(LC_ALL,"Russian");
    const int SZ=8;
    int SSZ=SZ-1;
    int arr[SZ]={1,2,3,4,5,6,7,8};
    int cnt=0;

    for (int i=0;i<SZ;i++)
    std :: cout<<arr[i]<<" ";
    for (int i=0;i<SZ;i++){
    if (arr[i]>arr[i+1])
    cnt--;
    else
    if(arr[i]<arr[i+1])
    cnt++;
    else
    cnt-=cnt;
    if (cnt==SSZ)
    std :: cout<<"\nМассив возрастающий";
    if (cnt==-SSZ)
    std ::cout<<"\nМассив убывающий";
    if (cnt==0)
    std ::cout<<"\nНе отсортированный массив";}

    std ::cout<<std ::endl;
    system("pause");
    return 0;
}
 */
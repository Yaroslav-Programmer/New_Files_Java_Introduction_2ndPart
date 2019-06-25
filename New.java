package com.company;
import java.lang.String;
public class New {
    public static void main(String[] args) {
        int[] sequence_of_numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sequenceOfNumbers(sequence_of_numbers);
    }

    public static Boolean sequenceOfNumbers(int[] sequence_of_numbers) {
        int counter = 0;
        for (int i = 0; i < sequence_of_numbers.length; i++) {
            if (sequence_of_numbers[i] > sequence_of_numbers[i + 1]) {
                counter--;
            } else if (sequence_of_numbers[i] < sequence_of_numbers[i + 1]) {
                counter++;
            } else
                counter -= counter;

            if (counter == sequence_of_numbers[i]){
                System.out.println(" qwerty");
            }if(counter ==- sequence_of_numbers[i]){
                System.out.println("not ^^^");
            }else
                System.out.println("not sorted array");

        }
        System.out.println();
        return null;
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
/*for(int i : sequence_of_numbers){
            if(sequence_of_numbers[i] < index){
                index = sequence_of_numbers[i];
                continue;
            }else
                break;
        }
         */
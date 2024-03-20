#include<stdio.h>
#include<limits.h>

int setmin(int arr[], int n)
{
    int min = arr[0]; // Initialize min to the first element
    for(int i = 1; i < n; i++) // Start the loop from the second element
    {
        if(arr[i] < min)
            min = arr[i];
    }    
    return min;
}

int setmax(int arr[], int n)
{
    int max = arr[0]; // Initialize max to the first element
    for(int i = 1; i < n; i++) // Start the loop from the second element
    {
        if(arr[i] > max)
            max = arr[i];
    }  
    return max;
}

int main()
{
    int n, arr[20];
    printf("Enter the number of array elements: ");
    scanf("%d", &n);
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Minimum element is: %d\n", setmin(arr, n));
    printf("Maximum element is: %d\n", setmax(arr, n));
    return 0;
}

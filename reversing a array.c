#include<stdio.h>

void rev(int a[],int n)
{
    int start=0, end=n-1;
    while(start<end)
    {
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;

        start++;
        end--;
    }
}

int main()
{
    int n;
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);

    int a[n];
    printf("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    printf("original array is: ");
    for(int i=0;i<n;i++){
        printf("%d\t",a[i]);
    }
    
    rev(a,n);

    printf("array reversed: ");
    for(int i=0;i<n;i++){
        printf("%d\t",a[i]);
    }
    
    return 0;
}
#i0nclude <stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    int arr[n+1];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int new_element;
    scanf("%d",&new_element);
    for(int i=n;i>0;i--){
        arr[i]=arr[i-1];
    }
    arr[0]=new_element;
    n++;
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
}

import java.util.Arrays;

public class java{
// Approach : 1 (Sorting)

    static int secondLargest1(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=n-2; i>=0; i--){
            if(arr[i] != arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }

// Approach : 2 (One Pass Search)

static int secondLargest2(int[] arr){
    int n = arr.length;
    int l = -1;
    int sl = -1;

    for(int i=0; i<n-1;i++){
        if(arr[i] > l){
            sl = l;
            l = arr[i];
        }
        else if(arr[i]<l && arr[i]>sl){
            sl = arr[i];
        }
    }
    return sl;

    }

}

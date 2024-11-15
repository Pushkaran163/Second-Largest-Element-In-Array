# Approach : 1 (Sorting)
def second_largest(arr):
    arr.sort()
    n = len(arr)
    
    for i in range(n-2, -1, -1):
        if(arr[i] != arr[n-1]):
            return arr[i]
    
    return -1

# Approach : 2 (One Pass Search)

def second_largest(arr):
    n = len(arr)
    l = -1
    sl = -1
    
    for i in range(n):
        if(arr[i]> l):
            sl = l
            l = arr[i]
        elif(arr[i] > sl and arr[i] < l):
            sl = arr[i]
    
    return sl

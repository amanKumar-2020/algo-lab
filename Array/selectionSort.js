let array= [3,24,6,24,5]

function selectionSort(arr) {
    let n = arr.length;

    for(let i = 0; i < n-1 ; i++){
        let minIndex = i ;
        
    for (let j = i+1 ; j < n ; j++){
        if (arr[i] > arr[j]){
            minIndex = j ;
        }
    }
    if(minIndex !== i){
        let temp = arr[i]
         arr[i] = arr[minIndex]
         arr[minIndex] = temp
    }
   
    }
     return arr;
}


// Test the function
const unsortedArray = array
console.log("Unsorted Array:", unsortedArray);

const sortedArray = selectionSort(unsortedArray);
console.log("Sorted Array:", sortedArray);
# Dequeue-Element-Inside-Array
This repo contains a logic to dequeued the element inside the array given

Logic:

Start

    Init arraySize = 0,queue[] = {}, temp = null, inputList[] = {}; (Initialize variables for dequeuing)
    Init beginningChar = 'a', beginningNumber = '1'; (Initialize variables for set the elements of array)
    Init counterForAlphabet = 0, counterForNumber = 0; (Initialize variables for counting the amount of alphabet, and number)
    
    Input arraySize
    
    Loop until less than arraySize
       
        If arraySize % 2 equals to 0, THEN (Only if the number of array is EVEN)
        
        //This validation is for splitting the initialization between Alphabet, and number into half based on numberArray
            If counterAlphabet Is NOT EQUALS THAN half of the numberArray 
                Add beginningCharacter   
        
    EndLoop
       
    //to dequeued the elements
    
    Init currentIndex = 0;
    Loop currentIndex until the end of size of inputList
        Init temp = "", nextIndexString = ""
        
        Set temp equals to inputList[beginning_of_the_index]
        If currentIndex is not equals than end_of_index, THEN
            SET nextIndexString to indexList[currentIndex + 1] (next index)
            Move nextIndexString to indexList[currentIndex]
            
        EndIf
        
        If nextIndexString equals to "" OR nextIndexString equals to null, THEN
            SET indexList[end_of_index] to temp
            
        EndIf
    EndLoop
    
End

Test Case 1:

6

[a, b, c, 1, 2, 3]

Result:

[b, c, 1, 2, 3, a]

Test Case 2:

5

[2, 3, 4, 1, 5]

Result:

[3, 4, 1, 5, 2]
 
            
        
    
    
        
        

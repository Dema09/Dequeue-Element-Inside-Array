# Dequeue-Element-Inside-Array
This repo contains a logic to dequeued the element inside the array given

Logic:

Start

    Init arraySize = 0,queue[] = {}, temp = null, inputList[] = {};
    
    Input arraySize
    
    Loop until less than arraySize
       
        Input queue[arraySize]
        SET inputList equals to queue[arraySize]
        
    EndLoop
    
    If arraySize % 2 equals to 0, THEN
        Loop inputList until the end of index
            If inputList isn't contains alpha-numeric, THEN
                print "Input must be an alpha-numeric!"
            EndIf
        EndLoop
    EndIf 
    
    If arraySize % 2 isn't equals to 0, THEN
        Loop inputList until the end of index
            If inputList isn't contains numeric, THEN
                print "Input must be a numeric!"
            EndIf
        EndLoop
    EndIf
    
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
 
            
        
    
    
        
        

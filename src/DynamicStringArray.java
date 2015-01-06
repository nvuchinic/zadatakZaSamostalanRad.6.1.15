/**
 * class for creating dynamic arrays of String(array that can change its size if needed)
 */
public class DynamicStringArray {
String[] array;
private int count;
final int INIT_SIZE=5;

/**
 * constructor method for  creating objects of type DynamicArray with one parameter, size of array
 * @param parameter which refers to size of array
 */
public DynamicStringArray(int size){
	this.array=new String[size];
	count=0;
}

/**
 * constructor method for  creating objects of type DynamicArray without parameters(default constructor). 
 * It creates the array with default size(value of INIT_SIZE constant)
 */
public DynamicStringArray(){
	this.array=new String[INIT_SIZE];
	count=0;
}

/**
 * method that returns the number of elements in array
 * @return value of count variable
 */
public int getSize(){
	return count;
}

/**
 * method for adding the new element in array. First it checks if array is already full, 
 * and if that's true, it calls method for resizing array, so it can take new element.
 * @param new String that will be added to array
 */
public void add(String newString){
	if(count==array.length){
		resize();
		}
	array[count]=newString;
			count++;
		
	}

/**
 * method for resizing the array(it doubles the size of original array). 
 * It creates new array, copies the elements from original array to this new one,
 *  and then sets the reference from an original array to point to the newly created array.
 */
private void resize(){
	String[] arr2=new String[array.length*2];
	for(int i=0;i<array.length;i++){
		arr2[i]=array[i];
	}
	array=arr2;
}

/**
 * returns the array element with index passed as the parameter
 * @param integer that refers to index of element in array that will be returned
 * @return array element(String) whose index is passed as parameter
 */
public String getAt(int index){
	if(index<0 || index>=count){
		throw new IndexOutOfBoundsException();
	}
	else
	return array[index];
}

/**
 * method for removing array element with index passed as the parameter
 * (moves all the elements that are on the right side from element with given index for one place to the left).
 * @param index of array element that will be removed from array
 */
public void removeAt(int index){
	if(index<0 || index>=count){
		throw new IndexOutOfBoundsException();
	}
	else{
		for(int i=index;i<=count;i++){
			array[i]=array[i+1];
		}
		count--;
	}
}

/**
 
 * method that creates and returns new array (of strings) which is populated only with those elements of initial array 
 * that are added after inicialization
 * @return array of strings
 */
public String[] toArray(){
	String[] newArray=new String[count];
	for (int i=0;i<count;i++){
		newArray[i]=array[i];
	}
	return newArray;
}

}


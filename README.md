# Array Data Structure in Java

This repository contains a Java implementation of an array-based data structure. It provides functionality for adding, deleting, and managing elements in an array, including operations like inserting at a specific index, deleting by index or value, and checking for element availability.

## Features

- **Array Initialization**: Dynamically initializes an array with a user-defined size.
- **Set Array Elements**: Prompts the user to input values for the array.
- **Add Element**: Allows inserting an element at a specific index, shifting the rest of the elements.
- **Delete by Index**: Removes an element at a specified index, adjusting the array.
- **Delete by Value**: Searches for and removes the first occurrence of a specified value.
- **Check Availability**: Verifies if a specific value exists in the array.
- **Retrieve Index**: Returns the index of a specified value.

## Usage

### 1. Create an Array
Instantiate the `Arrays` class with the desired size:
```java
Arrays arr = new Arrays(5);
```
### 2. Set Array Elements
Use the `setArray()` method to input values into the array:
```java
arr.setArray();
```
### 3. Display Array Elements
View the current array values:
```java
arr.displayArray();
```
### 4. Add an Element
Insert a value at a specific index:
```java
arr.addValue(index, value);
```
### 5. Delete an Element by Index
Remove a value at a given index:
```java
arr.deleteValueByIndex(index);
```
### 6. Delete an Element by Value
Search for and delete the first occurrence of a value:
```java
arr.deleteValue(value);
```
### 7. Check Element Availability
Verify if a value exists in the array:
```java
boolean exists = arr.isAvailable(value);
```
### 8. Get Index of a Value
Retrieve the index of a specific value:
```java
int index = arr.getIndex(value);
```
### Example Execution
Refer to the testArray class in the code to see how to use the Arrays class interactively with user input.

### How to Run
1. Clone the repository:
bash
```java
git clone https://github.com/RDariju/array-data-structure.git
```  
2. Open the project in your Java IDE (e.g., NetBeans, IntelliJ IDEA, Eclipse).
3. Run the testArray class to interact with the array.
   
### Author
Ravindu Dariju

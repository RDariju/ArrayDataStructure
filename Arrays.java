/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresandalgorithems;

import java.util.Scanner;

/**
 *
 * @author Ravindu Dariju
 */
public class Arrays {
    int arr[];
    int size;
        
    public Arrays(int size) {
        this.size = size;
        arr = new int[size+5];
    }
    public void setArray(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value at index :"+i);
            arr[i]=sc.nextInt();
        }
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void displayArray(){
        System.out.println("Array values are :");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
    public void addValue(int index,int value){
        setSize(getSize()+1);
        for(int i = getSize(); i>=index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
    }
    public void deleteValueByIndex(int index){
        for(int i = index; i<getSize();i++){
            arr[i] = arr[i+1];
        }
       setSize(getSize()-1);
    }
    public void deleteValue(int element){
        int index = getIndex(element);
        deleteValueByIndex(index);
    }
    
    boolean isAvailable(int value){
        boolean available = false;
        for (int i = 0; i < size; i++) {
            if(arr[i] == value){
                available = true;
            }else{
                available = false;
            }
        }
        return available;
    }
    int getIndex(int value){
        int index = -1;
        for (int i = 0; i < size; i++) {
            if(arr[i] == value){
                index = i;
            }
        }
        return index;
    }
}
class testArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index;
        int element;
        Arrays arr = new Arrays(5);
        arr.setArray();
        arr.displayArray();
        System.out.println("Add another value :");
        System.out.println("Enter Index :");
        index = sc.nextInt();
        System.out.println("Enter value :");
        element = sc.nextInt();
        arr.addValue(index, element);
        arr.displayArray();
        System.out.println("Delete a value using index");
        System.out.println("Enter Index :");
        index = sc.nextInt();
        arr.deleteValueByIndex(index);
        arr.displayArray();
        System.out.println("Delete a value using value");
        System.out.println("Enter value :");
        element = sc.nextInt();
        arr.deleteValue(element);
        arr.displayArray();
    }
}

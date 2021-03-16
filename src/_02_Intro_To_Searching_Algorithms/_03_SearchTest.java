package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String one[] = {"Banana", "Pear", "Apple", "Orange", "Passionfruit", "Avacado", "Strawberry", "Blueberry", "Kiwi"};
    	String two[] = {"Tiger", "Lion", "Dolphin", "Shark", "Monkey", "Elephant", "Cheetah", "Giraffe", "Hippopotamus"};
    	String three[] = {"Java", "C++", "Python", "C#", "C", "Javascript", "Typescript", "Ruby", "HTML"};
        assertEquals(LinearSearch.search(one, "Orange"), 3);
        assertEquals(LinearSearch.search(two, "Monkey"), 4);
        assertEquals(LinearSearch.search(three, "HTML"), three.length - 1);
        assertEquals(LinearSearch.search(three, "Something Random"), -1);
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int one[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    	int two[] = {5, 7, 9, 10, 14, 15, 16, 19, 26, 29};
    	int three[] = {1, 3, 35, 67, 89, 90, 145, 4624, 24677};
    	assertEquals(8, BinarySearch.search(one, 0, one.length - 1, 9));
    	assertEquals(5, BinarySearch.search(two, 0, two.length - 1, 15));
    	assertEquals(three.length - 1, BinarySearch.search(three, 0, three.length - 1, 24677));
    	assertEquals(-1, BinarySearch.search(three, 0, three.length - 1, 10592935));
    }
}
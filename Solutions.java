import java.util.*;
import java.io.*;

public class Solutions {

      public static int minimum_index(int[] seq) {
            if (seq.length == 0) {
                  throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
            }
            int min_idx = 0;
            for (int i = 1; i < seq.length; ++i) {
                  if (seq[i] < seq[min_idx]) {
                        min_idx = i;
                  }
            }
            return min_idx;
      }

      static class TestDataEmptyArray{
            public static int[] get_array(){
                  int arr[] = {} ; 
                  return arr ; 
            }
      }

      static class TestDataUniqueValues{
            public static int[] get_array(){
                  int[] arr = {1,2,3,4,5} ; 
                  return arr ;  
            }

            public static int get_expected_result() {
                  // complete this function
                  return 0;
            }
      }

      static class TestDataExactlyTwoDifferentMinimums{
            //where minimum value occurs at two indices . 
            public static int[] get_array() {
                  int arr[] = { 1, 3, 1 };
                  return arr;
            }

            public static int get_expected_result(){
                  return 0 ; 
            }
      }

      public static void TestWithEmptyArray() {
            try {
                  int[] seq = TestDataEmptyArray.get_array();
                  int result = minimum_index(seq);
            } catch (IllegalArgumentException e) {
                  return;
            }
            throw new AssertionError("Exception wasn't thrown as expected");
      }

      public static void TestWithUniqueValues() {
            //This is to get the array ;
            int[] seq = TestDataUniqueValues.get_array();
            if (seq.length < 2) {
                  throw new AssertionError("less than 2 elements in the array");
            }
            //creating a new array
            Integer[] tmp = new Integer[seq.length];
            for (int i = 0; i < seq.length; ++i) {
                  tmp[i] = Integer.valueOf(seq[i]);
            }
            //Creating a set from newly formed list and checking the length to original array ; 

            if (!((new LinkedHashSet<Integer>(Arrays.asList(tmp))).size() == seq.length)) {
                  throw new AssertionError("not all values are unique");
            }

            //2 method checking here  . 

            int expected_result = TestDataUniqueValues.get_expected_result();
            int result = minimum_index(seq);
            if (result != expected_result) {
                  throw new AssertionError("result is different than the expected result");
            }
      }

      //Last method for checking minimums
      public static void TestWithExactlyTwoDifferentMinimums() {
            int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
            //first checking the length of array .
            if (seq.length < 2) {
                  throw new AssertionError("less than 2 elements in the array");
            }
            //cloning the original array 
            int[] temp = seq.clone() ; 
            Arrays.sort(temp);
            if(!(temp[0]==temp[1])&& (temp.length == 2 || temp[1] < temp[2])){
                  throw new AssertionError("there are not exactly two minimums in the array");
            }
            //For checking the second method ; 
            int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
            int result = minimum_index(seq);
            if (result != expected_result) {
                  throw new AssertionError("result is different than the expected result");
            }
       }
      public static void main(String[] args) {
            TestWithEmptyArray();
            TestWithUniqueValues();
            TestWithExactlyTwoDifferentMinimums();
            System.out.println("OK");
      }
}

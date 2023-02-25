# string_equals_permutations_test_natwest_bristol

Task 1 

1.Compare given two strings (String 1 and String 2 ) values 
  * return true if the values of two strings are equal 
  * return false if the value of two strings are unequal
  
2. Permutation
Write a function to check whether two given strings are Permutation of each other or not. 
A Permutation of a string is another string that contains same characters, only the order of characters can be different.
For example, “abcd” and “dabc” are Permutation of each other.


Tested in Postman :

Get Mapping for string value comparision
NOTE: port no can be change depends on your local port number 
URL : http://localhost:8090/validator/equals?string1=aa&string2=aa
Inputs :
operation = "equals"
string 1 = "aa"
string 2 = "aa"
Result = true 
HttpStatus = 200 OK

operation = "equals"
string 1 = "aa"
string 2 = "AA"
Result = false 
HttpStatus = 200 OK

Get Mapping for string value permutation
NOTE: port no can be change depends on your local port number 
URL : http://localhost:8090/validator/permutation?string1=abc&string2=bca
Inputs :
operation = "permutation"
string 1 = "abc"
string 2 = "bca"
Result = true
HttpStatus = 200 OK

operation = "permutation"
string 1 = "abc"
string 2 = "aaa"
Result = false
HttpStatus = 200 OK



# Middle Item
![Github license](https://img.shields.io/badge/mit-blue.svg)
 
 Licensing: [mit](https://choosealicense.com/licenses/mit/)

## Table of Contents
- [Description](#description)
- [Installation Requirements](#installation-requirements)
- [Application Usage](#application-usage)
- [License](#licensing-information)
- [Contributions](#contributions)
- [Tests Commands](#tests-commands)
- [Questions](#questions)
## Description
The MiddleItem program reads a sequence of up to 9 positive integers from user input, terminated by a negative number or until the array is filled. The program then outputs either the middle item if the number of inputs is odd, or the two middle items if the number of inputs is even. If more than 9 numbers are entered, the program outputs an error message.

## Installation Requirements
Ensure you have Java Development Kit (JDK) installed on your system. You can download it from [Oracle](https://www.oracle.com/java/technologies/downloads/) or use a package manager like Homebrew for macOS or apt-get for Linux. 

- Clone or download the repository: 
```Java 
- git clone https://github.com/EMK2473/MiddleItem.git 
```

- Navigate to the project directory: 
```Java
- cd MiddleItem 
```
- Compile the MiddleItem.java file: 
```Java
- javac MiddleItem.java 
```
- Run the program: 
```Java
- java MiddleItem
```

## Application Usage
The program accepts up to 9 positive integers as input.
Input is terminated when either a negative number is entered or the list reaches 9 numbers.
The program outputs the middle item if the count of inputs is odd, or the two middle items if the count is even.
If more than 9 numbers are provided, the program outputs "Too many numbers" and exits. Example: 

Input (Odd Count):
```Java
12 45 67 89 23 56 78 91 34 
```
Output:
```Java
Middle item: 56 
```
Input (Even Count):
```Java
12 45 67 89 23 56 
```
Output:
```Java
Two middle items: 67 89 
```
Example Input with Early Termination: 
```Java
12 45 67 89 -1 
```
Output: 
```Java
Middle item: 67
```
Example Input with too many numbers:
```Java
10 20 30 40 50 60 70 80 90 100 110 -1
```
Output:
```Java
Too many numbers
```
## Contributions
Eric Keeton

## Test Commands
To test the program, provide a range of inputs (less than, equal to, or more than 9 numbers) and check that the middle item is correctly displayed.

## Questions
For Questions, contact me at emk2473@gmail.com or visit My Github: [EMK2473](https://github.com/EMK2473)
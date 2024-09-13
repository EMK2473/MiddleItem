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
The MiddleItem program reads a sequence of up to 9 positive integers from user input. It outputs the middle value of the input list. The input ends when a negative number is entered or after 9 integers. If more than 9 integers are input, the program will display an error message.

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
The program accepts a sequence of up to 9 positive integers as input. Input ends when a negative number is entered, or when 9 integers are provided. The program outputs the middle item in the list of input numbers. If the number of inputs exceeds 9, the program displays a message saying "Too many numbers" and exits. Example: 

Input:
```Java
12 45 67 89 23 56 78 91 34 
```
Output:
```Java
Middle item: 56 
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
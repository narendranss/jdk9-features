# jdk9-features [![Build Status](https://travis-ci.org/Wildcraft/jdk9-features.svg?branch=master)](https://travis-ci.org/Wildcraft/jdk9-features)

This project mainly focuses on testing features of JDK 9.
The Main objective of the project is to add test cases for all possible use cases of Java 9 features. 

Before using any new feature, many used to write a simple ad-hoc proof of concept program in a main method. This small ad-hoc program does not always remain managable, to refer it at a later point of time. Having it as test cases should help anyone to refer them back again and again. And if anything is missed out, one can add a new test case and enrich the resource. This forms the idea behind this project.

Similar to <a href="http://www.oracle.com/technetwork/java/javase/tech/index.html">Technology Classification</a> this projects classifies various features of JDK 9 into categories and separate them into maven modules.

The following modules are currently present in jdk9-features project.
1. <B>api:</B> 
Test cases for any JDK 9 general API other than core language API can be added in this module.
2. <B>concepts:</B>
Test cases for programming concepts like functional programming or reactive programming etc., can be added with appropriate use cases & iwiki page in this module.
3. <B>lang:</B>
Test cases for core language constructs and API can be added in this module.
4. <B>tooling:</B>
Test cases for tools such as java, javac, jshell can be added in this module.

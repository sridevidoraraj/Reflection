## Reflection In Java

### Reflection 


#### Structure

This project structured using intellij platform and maven as build system.

#### About Project

#### Reflection For Class

-> In this project, how reflection in java is used for class, method, and constructor are explained.

-> In Class Example, ReflectionClass is defined with three fields.

-> Also getter and setter function are declared.

-> In ReflectionDemo class file, ReflectionClass is called, and all fields, methods, modifiers, superClass, package name of that class are called in main application.

-> The output of the program will be as :

className : com.gcit.classexample.ReflectionClass

getModifiers : 1

getSuperclass : class java.lang.Object

getPackage : package com.gcit.classexample

only the public fieldNames : deptName

only the public fieldNames : empID

all the fieldNames in the class : age

all the fieldNames in the class : name

all the fieldNames in the class : deptName

all the fieldNames in the class : empID

methods : getAge
methods : setAge
methods : getDeptName
methods : setDeptName
methods : getName
methods : setName

#### Reflection For Methods

-> For methods, two class file is used. one for methods to be declared and another main class to call the methods.

-> In demo class, four methods are declared(add, sub,mul,div).

-> In main class, demo class is called by object creation.

-> Due to that we get the method name, modifiers, return type of demo class.

-> The output of program will be :

Method Name : add
Modifier : public  Return Type : void

Method Name : sub
Modifier : protected  Return Type : void

Method Name : mul
Modifier : protected  Return Type : void

Method Name : div
Modifier : private  Return Type : void

#### Reflection for Constructor

-> For Constructor, two class file is used. one for constructor definition and another for main class.

-> In demo class, constructor is defined with default, and parameterized constructor.

-> In main class, demo class is called as object creation.

-> we can get constructor name, modifier, parameters etc.

-> The output of the program will be :

Constructors for Person Class :
Constructor Name : com.gcit.methodexample.constructorexample.Demo
Modifier : public  Parameters : 0


Constructor Name : com.gcit.methodexample.constructorexample.Demo
Modifier : public  Parameters : 1
Constructor parameter types : java.lang.String

Constructor Name : com.gcit.methodexample.constructorexample.Demo
Modifier : private  Parameters : 2
Constructor parameter types : java.lang.String  int

### Reference Link
[LINK](https://www.geeksforgeeks.org/reflection-in-java/)

### To Run The Program
for maven, to build the project use
```
mvn clean install
```
to run the program, in ReflectionDemo class by clicking the run button icon where the java class file is created.

```bash
public class ReflectionDemo {
```

## JSON Parser

-> Json parser is used to convert string into object value.

-> Json parser can be done in many ways, one of which is by using "JSONObject obj = new JSONObject(jsonString);".

-> Another ways as

JSONParser parser = new JSONParser();

JSONObject obj = new JSONObject();

try {

obj = (JSONObject) parser.parse(jsonString);

} catch (ParseException e) {

e.printStackTrace();

}

-> Object Mapper is used for JSON parser for string to object type.

ObjectMapper mapper = new ObjectMapper();

-> The output of the program will be :

{
"id" : 115,

"firstName" : "Raja",

"lastName" : "Ramesh",

"technologies" : [ "Java", "Selenium", "C" ]

}

Deserializing JSON to Object:
115 Raja Ramesh [Java, Selenium, C]

### Reference Link
[LINK](https://www.geeksforgeeks.org/parse-json-java/)





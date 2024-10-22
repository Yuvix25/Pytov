# Pytov
The idea was to take all well known syntaxes, and combine them into one programming language with many posabilities.

## Installation
Install using `pip install pytov`, or via git: `git clone https://github.com/Yuvix25/Pytov.git`.

## Usage

### If was installed via pip:
```sh
$ pytov [path_to_your_pytov_file]
```
### If was installed via git:  

Run using Python:
```sh
$ cd [folder_of_installation]
$ cd pytov
$ python pytov.py [path_to_your_pytov_file]
```

Run using pre-built executables:
```sh
$ cd [folder_of_installation]
$ cd exe
$ pytov [path_to_your_pytov_file]
```

## Syntax

### Comments:
```cs
# this is a comment
// this is also a comment
/*
and this is a
multi
line
comment
*/
```

### Variables:
```cs
x = 5 // let or var or type is not required
print(x)
```

### If:
```python
if 5 > 1{
    print("5 is greater than 1")
}
elif 1 > 5{ # else if 1 > 5 will work too!
    print("1 is greater than 5")
}
else {
    print("1 is equal to 5")
}
```

### Loops:
#### For:
```cs
for i in range(10){
    print(i)
}
a = [1, 4, 7, 8]
for x in a{
    print(x)
    if x == 4{
        break // loop will stop when x == 4
    }
}

for (i = 5; i<10; i++){
    print(i)
}
// output: 5, 6, 7, 8, 9
```
#### While:
```cs
// loop the the block as long as x < 5
x = 0
while x < 5{
    print(x)
    x += 2
    // (break will work just the same here)
}
```

### Switch:
```js
// for more info about switch take a look at switch in js, it is exactly the same...
a = "hi"
switch a{
    case "hello":
        print("a=='hello'")
        break
    case "hi":
    case "hihi"
        print("a=='hi' or a=='hihi'")
        break
    default:
        print("a!='hi' and a!='hihi' and a!='hello'")
}
```

### Functions:
```cs
(func or function or def) func_name(required_params, not_required_params){
    your_code_here
    // and if you want you can return like this: return value
}
```

```cs
function print_hi(times){ // required parameter
    for i in range(times){
        print("hi")
    }
}

def print_hi_default(times=3){ // not required parameter with default value of 3
    for i in range(times){
        print("hi")
    }
}

func mult(x, y){
    return x*y
}

print_hi(5) // output: hihihihihi
print_hi_default() // output: hihihi
print(mult(5, 2)) // output: 10
```


### Imports:
#### test2.pv:
```java
if __name__ == "main"{ // will be true when file will be runned directly
    x = 5
}
else if __name__ == "imported" { // will be true when file is imported
    x = 7
}
```

#### test1.pv:
```js
x = 6
import test2 // you can also import like this: import "test2.pv"
print(x) // output will be 7
```

---
See [Examples](https://github.com/Yuvix25/Pytov/tree/main/Examples)
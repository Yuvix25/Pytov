# Pytov
The idea was to take all well known syntaxes, and combine them into one programming language with many posabilities.

## Usage

Run using python (requires libraries: run `$ pip install -r requirements.txt`):
```sh
$ cd [folder_of_installation]
$ python pytov.py [path_to_your_pytov_code]
```
Run using executables:
```sh
$ cd [folder_of_installation]
$ cd exe
$ pytov [path_to_your_pytov_code]
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

### loop:
```python
for i in range(10){
    print(i)
}
a= [1, 4, 7, 8]
for x in a{
    print(x)
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

---
See [Examples](https://github.com/Yuvix25/Pytov/tree/main/Examples)
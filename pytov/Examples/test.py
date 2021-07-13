if 1==2{
    x = 5-3
    if (1==1){
        y = "nooooo"
    }
    z = 8-x
}

// elif 1==1{
//     print("hihihi")
// }

if 1==2{
    print("not cool")
}
else if 1==3{
    print("very cool")
}
else{
    print("cooool")
}


function x(y,z, w=15){
    test = y+z+w
    print(test)
    return test
}

def func_test(){
    x(1, 2)
    print("fixed")
}

a = [1, 2, 3]
for i in range(1, 5){
    print(i)
    if i == 3{
        break
    }
}

z = x
print(z(1, 5, w=20))
func_test()

switch a{
    case [1, 2, 3]:
        print("hi0") // no break so will move on to case [1, 2, 3, 4] even though it is not equal to it.
    case [1, 2, 3, 4]:
        print("hi1")
        break
    default:
        print("hi2")
        break
    
}

#test

for (i = 5; i<10; i++){
    print(i)
}

x = 6
import "test2.py"
print(x)
name = ""

try:
    f = open("input.txt", "r") #use RELATIVE paths!
    for line in f:
        name = line.rstrip()
except:
    print("bad things happened")





print(name)
# 2nd time pushing

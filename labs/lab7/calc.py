# Copyright 2014 -- Levi Starrett
# for educational purposes only
#
# Calculator -- a four function calculator commandline tool

import sys

# -------------------------------------------------------- #
# -- CALCULATOR FUNCTIONS -------------------------------- #
# -------------------------------------------------------- #

# Add function
# a -- addend
# b -- augend
def add(a, b):
    return a + b

# Subtract function
# a -- minuend
# b -- subtrahend
def sub(a, b):
    return a - b

# Multiply function
# a -- multiplicand
# b -- multiplier
def mult(a, b):
    return a * b

# Divide function
# a -- dividend
# b -- divisor
def div(a, b):
    return a / b


# -------------------------------------------------------- #


# -------------------------------------------------------- #
# -- MAIN FUNCTIONAILTY -- DO NOT EDIT ------------------- #
# -------------------------------------------------------- #

a = None
b = None
op = None

while (True):
    # get input values
    a = raw_input("Enter the first argument: ")
    op = raw_input("Enter the operation: ")
    b = raw_input("Enter the second argument: ")
    try:
        a = int(a)
        b = int(b)
    except ValueError:
        print "Invalid number argument..."
        op = None

    # decide function
    if (op != None):
        if (op == "+"):
            print "Sum: ", add(a, b)
        elif (op == "-"):
            print "Difference: ", sub(a, b)
        elif (op == "*"):
            print "Product: ", mult(a, b)
        elif (op == "/"):
            print "Quotient: ", div(a, b)
        else:
            print "Invalid operation..."

    q = raw_input("Quit? [y/n] ")
    if (q == "y" or q == "Y"):
        break

# -------------------------------------------------------- #

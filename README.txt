Author: #### ###
#####
Date: 20231207

This program utilizes a Linear Probing Hash class. It will take an array of Strings,
hash them, then place them on a table.

As a whole, this program is designed to take the String array after reading from the 
"input.txt" file. These words are fed to the LPHash class and automatically placed into
an array of Node class (nodes[]), which contain a respective key and value. These index
that each instance of a node is placed is equivalent to its hash value.

Compilation of code simply requires all files being present in the same folder and running
the main execute from the WordCounter.java file

References:
    Sedgewick, R., Wayne, K. (2011). Algorithms, 4th Edition.. Addison-Wesley. ISBN: 978-0-321-57351-3
        This link is used, it is from the authors above
        https://github.com/kevin-wayne/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/LinearProbingHashST.java
package dsa.dsa.contents;

public class Subjects {

    private String arraysAndHashing;
    private String twoPointers;
    private String stack;
    private String binarySearch;
    private String slidingWindow;
    private String linkedList;
    private String trees;
    private String tries;
    private String backTracking;
    private String heapPriorityQueue;
    private String graphs;
    private String oneDimensionalDynamicProgramming;
    private String twoDimensionalDynamicProgramming;
    private String bitManipulation;
    private String intervals;
    private String greedy;
    private String advancedGraphs;

/*

Summary

LinkedList

Singly linkedList

        Location first
             node.next = head;
             head = node;

        Location last
             node.next = null;
             last.next = node;
             tail = node;

        Somewhere in linkedList not first not last
             Find location with loop
             current.next = node;
             node.next = nextNode;

        Time and Space Complexity

                        Time     Space
             Creation   O(1)      O(1)
             Insertion  O(n)      O(1)
             Searching  O(n)      O(1)
             Traversing O(n)      O(1)
             Delete 1   O(n)      O(1)
             Delete all O(1)      O(1)

Circular Singly LinkedList
Doubly LinkedList
Circular Doubly LinkedList

--------------------------------------------------------------

Stack (LIFO)

    Can use with Array and LinkedList

    Methods = createStack , Push , Pop , Peek , isEmpty , isFull , deleteStack
        Use = Lifo functionality , The chance of data corruption is minimum
        Avoid = Random access is not possible


--------------------------------------------------------------

Queue (FIFO)

    Can use with Array (Linear Queue , Circular Queue) and LinkedList

    Methods = createQueue , Enqueue , Dequeue , Peek , isEmpty , isFull , deleteQueue
        Use = Fifo functionality , The chance of data corruption is minimum
        Avoid = Random access is not possible



--------------------------------------------------------------

Recursion

    Definition = A way of solving a problem by having a function calling itself
        Use = When we can easily break down a problem into similar sub problems - When we need a quick solution instead of efficient one - When traverse a tree - When we use memoization in recursion (Dynamic Programming Subject)
        Avoid = If time and space complexity matters - Uses more memory - Can be slow
        Recursion in 3 steps
            Step 1 - Recursive case - the flow
            Step 2 - Base case - the stopping criterion
            Step 3 - Unintentional case - the constraint


--------------------------------------------------------------

Tree / Binary Tree

    Why = Quicker and easier access to the data - Store hierarchical data, like folder structure, organization structure, XML/HTML data - Unlike linear data structure no need to traverse all the data
    Example = File system in computers
        There are many different types of data structures which performs better in various situations
            - Binary Search Tree (allows finding the closest item very quickly) , AVL , Red Black Tree , Trie
                Tree Terminology
                    root : top node without parent
                    edge : a link between parent and child
                    leaf : a node which does not have children
                    sibling : children of same parent
                    ancestor : parent , grandparent , great-grandparent of a node
                    depth of node : a length of the path from root to node
                    height of node : a length of the path from the node to the deepest node
                    depth of tree : depth of root node
                    height of tree : height of roof node

    Binary Tree
        Binary trees are the data structures in which each node has at most two children, often referred to as the left and right children
        Binary tree is a family of data structure (Binary Search Tree , Heap Tree , AVL , Red Black Trees , Syntax Tree) -> they are all binary tree
            Why -> Huffman coding problem , heap priority problem and expression parsing problems can be solved efficiently using binary trees
        Types of Binary Tree
            Full Binary Tree = 0 or 2 children not 1
            Perfect Binary Tree = Every node has 2 children
            Complete Binary Tree = Except last step all nodes are full
            Balanced Binary Tree =  Left and right side are in equal level
        Binary Tree Traversal
            Depth First Search
                -Preorder traversal -> root-left-right
                -Inorder traversal -> left-root-right
                -Postorder traversal -> left-right-root
            Breadth First Search
                -LevelOrder traversal -> level1-level2 etc.
        Binary Tree with array -> first index empty and left node 2x right node 2x+1



--------------------------------------------------------------

Binary Search Tree

    Binary Search Tree = Left node less than or equal - right node greater
    Why = It performs faster than binary tree when inserting and deleting nodes


--------------------------------------------------------------

Avl Tree

    Avl Tree is a self-balancing Binary Search Tree where the difference between heights of left and right subtrees cannot be more than one for all nodes
    Insertion
        Case 1 = Rotation is not required
        Case 2 = Rotation is required
            LL condition -> Right Rotation(Avl.java 77th line) (Root node becomes right node - left node becomes root - left-left node becomes left)
            LR condition -> Left Rotation(Avl.java 86th line) + Right Rotation(Avl.java 77th line)
            RR condition -> Left Rotation(Avl.java 86th line)
            RL condition -> Right Rotation(Avl.java 77th line) + Left Rotation(Avl.java 86th line)

--------------------------------------------------------------

Binary Heap

    Binary Heap is a Binary Tree with following properties:
        A Binary Heap is either Min Heap or Max Heap. In a Min Binary Heap, the key at root must be minimum among all keys present in Binary Heap.
        It's a complete tree. All levels are completely filled except possibly the last level and the last level has all keys as left as possible.
        Max heap exactly the opposite of min heap


--------------------------------------------------------------

Trie

    A trie is a tree-based data structure that organizes information in a hierarchy.
        Properties :
            - It is typically used to store or search strings in a space and time efficient way.
            - Any node in trie can store non-repetitive multiple characters.
            - Every node stores link of the next character of the string
            - Every node keeps track of 'end of string'
    Why
        To solve many standard problems in efficient way
            - Spelling checker
            - Auto completion


--------------------------------------------------------------

Hashing

    Hashing is a method of sorting and indexing data. The idea behind hashing is to allow large amounts of data to be indexed using keys commonly created by formulas.
    Why
        It is time efficient in case of SEARCH operations.
            Data Structure |    Time Complexity for Search
            Array          |    O(logN)
            Linked List    |    O(N)
            Tree           |    O(logN)
            Hashing        |    O(1) / O(N)

    Hashing Terminology
        Hash function : It is a function that can be used to map of arbitrary size to data of fixed size.
        Key : Input data by a user
        Hash value : A value that is returned by Hash function
        Hash table (Dictionary or HashMap) : It is a data structure which implements an associative array abstract data type, a structure that can map keys to values
        Collision : A collision occurs when two different keys to a hash function produce the same output.

    Collision Resolution Techniques
        - Direct Chaining : Implements the buckets as linked list. Colliding elements are stored in these lists. If collision occurs then add it into a linked list. Inserting references to hash table.
        - Open Addressing : Create 2x size of current Hash Table and recall hashing for current keys. Colliding elements are stored in other vacant buckets. During storage and lookup these are found through so called probing.
            - Linear Probing : It places new key into the closest following empty cell. If 2 is occupied then move to 3 check if it is occupied or not and then move on to the next empty cell.
            - Quadratic Probing : Adding arbitrary quadratic polynomial to the index until an empty cell is found. Ex / cell 2 is occupied then 2 + 1 square = 3 if 3 is occupied 2 + 2 square 6 ... 3 square etc.
            - Double Hashing : Interval between probes is computed by another hash function. Hash function 2


--------------------------------------------------------------

Sorting Algorithms

    By definition sorting refers to arranging data in a particular format : either ascending or descending.
        Sorting Algorithms
            - Bubble Sort
                Definition : We repeatedly compare each pair of adjacent(near) items and swap them if they are in the wrong order.
            - Selection Sort
                Definition : In case of selection sort we repeatedly find the minimum element and move it to the sorted part of array to make unsorted part sorted.
            - Insertion Sort
                Definition :
                    - Divide the given array into two part
                    - Take first element from unsorted array and find its correct position in sorted array
                    - Repeat until unsorted array is empty
            - Bucket Sort
                Definition :
                    - Create buckets and distribute elements of array into buckets
                    - Sort buckets individually
                    - Merge buckets after sorting
            - Merge Sort
                Definition :
                    - Merge sort is a divide and conquer algorithm
                    - Divide the input array in two halves and we keep halving recursively until they become too small that cannot be broken further
                    - Merge halves by sorting them
            - Quick Sort
                Definition :
                    - Quick sort is a divide and conquer algorithm
                    - Find pivot number and make sure smaller numbers located at the left pivot and bigger numbers are located at the right of the pivot
                    - Unlike merge sort extra space is not required
            - Heap Sort
                Definition :
                    - Step 1 : Insert data to Binary heap tree
                    - Step 2 : Extract data from Binary heap
                    - It is best suited with array, it does not work with linked list


--------------------------------------------------------------

Searching Algorithms

    Linear Search : To find the desired element by searching the entire list one by one.
    Binary Search :
        - Binary search is faster than Linear Search.
        - Half of the remaining elements can be eliminated at a time, instead of eliminating them one by one.
        - Binary Search only works for sorted arrays.

--------------------------------------------------------------

Graphs

    Graph consists of a finite set of Vertices(or nodes) and set of Edges which connect a pair of nodes.
    Graph Terminology
        - Vertices(vertex) : Vertices are the nodes of the graph.
        - Edge : The edge is the line that connects pairs of vertices.
        - Unweighted graph : A graph which does not have a weight associated with any edge.
        - Weighted graph :  A graph which has a weight associated with any edge.
        - Undirected graph : In case the edges of the graph do not have a direction associated with them.
        - Directed graph : If the edges in a graph have a direction associated with them.
        - Cyclic graph : A graph which has at least one loop.
        - Acyclic graph : A graph with no loop.
        - Tree : It is special case of directed acyclic graphs.

    If a graph is complete or almost complete we should use Adjacency Matrix
    If the number of edges are few then we should use Adjacency List


--------------------------------------------------------------

BFS-DFS (Breadth First Search ...)

    Breadth First Search :
                - Use queue.
                - BFS is an algorithm for traversing Graph data structure.
                - It starts at some arbitrary node of a graph and explores the neighbor nodes(which are at current level) first, before moving to the next level neighbors.
    Depth First Search :
                - Use stack.
                - DFS is an algorithm for traversing a graph data structure which starts selecting some arbitrary node and explores as far as possible along each edge before backtracking.



--------------------------------------------------------------

Topological Sort

    Topological Sort : Sorts given actions in such a way that if there is a dependency of one action on another, then the dependent action always comes later than its parent action.


--------------------------------------------------------------

Single Source Shortest Path Problem ( SSS_PP )

    Solve with :
        - BFS
        - Dijkstra's Algorithm
        - Bellman Ford

    BFS does not work with weighted Graph. So for weighted problems use dijkstra's algorithm or bellman.
    DFS has the tendency to go "as far as possible" from source, hence it can never find "Shortest path"

--------------------------------------------------------------

Dijkstra's Algorithm

    Dijkstra's algorithm is an algorithm for finding the shortest paths between nodes in a weighted graph, which may represent, for example, a road network.

--------------------------------------------------------------

Bellman Ford Algorithm

    Bellman Ford Algorithm is used to find single source shortest path problem. If there is a negative cycle it catches it and report its existance.

--------------------------------------------------------------

Floyd Warshall Algorithm

--------------------------------------------------------------

Minimum Spanning Tree

--------------------------------------------------------------

Kruskal and Prim 's Algorithms

--------------------------------------------------------------

Greedy Algorithms

--------------------------------------------------------------

Divide and Conquer Algorithms

--------------------------------------------------------------

Dynamic Programming

--------------------------------------------------------------

Backtracking







*/
}

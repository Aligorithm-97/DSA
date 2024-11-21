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
        Use = Lifo functionalty , The chance of data corruption is minimum
        Avoid = Random access is not possible


--------------------------------------------------------------

Queue (FIFO)

    Can use with Array (Linear Queue , Circular Queue) and LinkedList

    Methods = createQueue , Enqueue , Dequeue , Peek , isEmpty , isFull , deleteQueue
        Use = Fifo functionalty , The chance of data corruption is minimum
        Avoid = Random access is not possible



--------------------------------------------------------------

Recursion

    Definition = A way of solving a problem by having a function calling itself
        Use = When we can easily breakdown a problem into similar subproblems - When we need a quick solution instead of efficient one - When traverse a tree - When we use memoization in recursion (Dynamic Programming Subject)
        Avoid = If time and space complexity matters - Uses more memory - Can be slow
        Recursion in 3 steps
            Step 1 - Recursive case - the flow
            Step 2 - Base case - the stopping criterion
            Step 3 - Unintentional case - the constraint


--------------------------------------------------------------

Tree / Binary Tree

    Why = Quicker and easier access to the data - Store hierarchical data, like folder structure, organization structure, XML/HTML data - Unlike linear data structure no need to traverse all of the data
        There are many different types of data structures which performs better in various situations
            - Binary Search Tree (allows finding closest item very quickly) , AVL , Red Black Tree , Trie
                Tree Terminology
                    root : top node without parent
                    edge : a link between parent and child
                    leaf : a node which does not have children
                    sibling : children of same parent
                    ancestor : parent , grandparent , great grandparent of a node
                    depth of node : a length of the path from root to node
                    height of node : a length of the path from the node to the deepest node
                    depth of tree : depth of root node
                    height of tree : height of roof node
                    

--------------------------------------------------------------

Binary Search Tree

--------------------------------------------------------------

Avl Tree

--------------------------------------------------------------

Binary Heap

--------------------------------------------------------------

Trie

--------------------------------------------------------------

Hashing

--------------------------------------------------------------

Sorting Algorithms

--------------------------------------------------------------

Searching Algorithms

--------------------------------------------------------------

Graphs

--------------------------------------------------------------

BFS-DFS (Breadth First Search ...)

--------------------------------------------------------------

Topological Sort

--------------------------------------------------------------

Dijkstra's Algorithm

--------------------------------------------------------------

Bellman Ford Algorithm

--------------------------------------------------------------

Floyd Warshall Algorithm

--------------------------------------------------------------

Minimum Spanning Tree

--------------------------------------------------------------

Kruskal and Prim's Algorithms

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

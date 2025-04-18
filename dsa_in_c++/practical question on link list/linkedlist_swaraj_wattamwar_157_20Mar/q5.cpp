/*
Q5: Write an algorithm to delete nodes in a circular linked list.

Algorithm:
Step 1: If the list is empty, return.
Step 2: If there is only one node (head->next == head), delete it and set head = NULL.
Step 3: Traverse the list to find the node before the one to be deleted.
Step 4: Update the previous node’s next pointer to skip the node to be deleted.
Step 5: Free the memory of the deleted node.
*/

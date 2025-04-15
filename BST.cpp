#include <iostream>
using namespace std;

// Structure for a tree node
struct Node
{
    int data;
    Node *left;
    Node *right;
};
// Function to create a new node
Node *createNode(int value)
{
    Node *newNode = new Node();
    newNode->data = value;
    newNode->left = newNode->right = nullptr;
    return newNode;
}
// Function to insert a node into BST
Node *insertNode(Node *root, int value)
{
    if (root == nullptr) // If tree is empty, create root node
        return createNode(value);
    if (value < root->data) // Insert in left subtree
        root->left = insertNode(root->left, value);
    else // Insert in right subtree
        root->right = insertNode(root->right, value);
    return root;
}
// Function to search a node in BST
bool searchNode(Node *root, int key)
{
    if (root == nullptr)
        return false;
    if (root->data == key)
        return true;
    if (key < root->data)
        return searchNode(root->left, key);
    else
        return searchNode(root->right, key);
}
// Function to find the minimum value node in BST
Node *findMin(Node *root)
{
    while (root->left != nullptr)
        root = root->left;

    return root;
}
// Function to delete a node in BST
Node *deleteNode(Node *root, int key)
{
    if (root == nullptr)
        return root;
    if (key < root->data) // Key is in left subtree
        root->left = deleteNode(root->left, key);
    else if (key > root->data) // Key is in right subtree
        root->right = deleteNode(root->right, key);
    else
    {
        // Case 1: Node has no child (leaf node)
        if (root->left == nullptr && root->right == nullptr)
        {
            delete root;
            return nullptr;
        }
        // Case 2: Node has one child
        else if (root->left == nullptr)
        {
            Node *temp = root->right;
            delete root;
            return temp;
        }
        else if (root->right == nullptr)
        {
            Node *temp = root->left;
            delete root;
            return temp;
        }
        // Case 3: Node has two children
        else
        {
            Node *temp = findMin(root->right);                 // Find successor
            root->data = temp->data;                           // Copy successor data
            root->right = deleteNode(root->right, temp->data); // Delete successor
        }
    }
    return root;
}
// In-Order Traversal (Left → Root → Right)
void inOrder(Node *root)
{
    if (root == nullptr)
        return;
    inOrder(root->left);
    cout << root->data << " ";

    inOrder(root->right);
}
// Main function
int main()
{
    Node *root = nullptr; // Initial tree is empty
    // Insert nodes dynamically
    root = insertNode(root, 50);
    root = insertNode(root, 30);
    root = insertNode(root, 70);
    root = insertNode(root, 20);
    root = insertNode(root, 40);
    root = insertNode(root, 60);
    root = insertNode(root, 80);
    cout << "In-Order Traversal before deletion: ";
    inOrder(root);
    cout << endl;
    // Searching for a key
    int key = 40;
    if (searchNode(root, key))
        cout << key << " is found in BST.\n";
    else
        cout << key << " is not found in BST.\n";
    // Deleting a node
    root = deleteNode(root, 30);
    cout << "In-Order Traversal after deleting 30: ";
    inOrder(root);
    cout << endl;
    return 0;
}
map<Integer, String> = new HashMap<>();

map.put(..., ...);

map.get(...)

what is default size?

 - always in power of 2
 - by default of size 16 

   - when size is 16, indexes will be there from 0 to 15
   - for a get call, key will undergo hash function and hashcode will be generated between 0 and 15 inclusive
   - at that index key - value pair will be kept as linked list  

what is load factor?

- usually it is 0.75, when this much is filled then we will do resizing
- initial capacity is 16, so resize will happen after 13th entry because 16 * 0.75 = 12
- new capacity will be twice

what is collision?

what is treefy threshold?

- for a hash code, entries will go and keep appended as linked list, as this threshold is reached, linked list will be converted to balanced tree.

internal implementation - 

- get method
  
  - find hash code > iterate through all node with that hash code
- put method
  
  - find hash code > iterate through all nodes, if node wiht same key found update it's value

  - If node with same key node found, create a new node or entry and append it in linked list

Notes :

 - If same object, it's hashcode will be same always
 - If different object, their hashcode can be same 
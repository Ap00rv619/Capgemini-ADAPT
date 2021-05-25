/*
DESCRIPTION
Alan went to the grocery store. He added some grocery items to his bucket and went to the billing counter. While standing in the queue, he notices, for every item that the customer purchases the grocery clerk updates the detail of the item in his notebook. Now, because Alan is very fond of coding, he decided to create an ArrayList and perform the operations on the list that he noticed while purchasing items in the store.

Alan needs your help!

Your task here is to implement a Java code based on the following specifications. Note that your code should match the specifications in a precise manner. Consider default visibility of classes, data fields and methods unless mentioned otherwise.

Specifications:

class definitions:
  class Source:
    addItem(ArrayList<String> groceryList, String item):
        return type: void
        visibility: public
﻿
    modifyItem(ArrayList<String> groceryList, int index, String newItem)
		return type: String
		visibility: public
﻿
    removeItem(ArrayList<String> groceryList, int index):
		return type: String
		visibility: public
﻿
    searchItem(ArrayList<String> groceryList, String searchItem)
		return type: String
		visibility: public
﻿
    getSize(ArrayList<String> groceryList)
        return type: int
		visibility: public
Task:

Create a class Source and implement the below given methods
void addItem(ArrayList<String> groceryList, String item): add items to groceryList
String modifyItem(ArrayList<String> groceryList, int index, String newItem):Update the groceryList with newItem at given index and return message "Item of index " + index + " has been modified."
String removeItem(ArrayList<String> groceryList, int index): Remove the given index from the groceryList and return message "Item of index " + index + " has been removed."
String searchItem(ArrayList<String> groceryList, String searchItem): Search an item in the groceryList and return the item if found, else return message "no such item"
int getSize(ArrayList<String> groceryList): return the size of groceryList
Sample Input

ArrayList<String> groceryList = new ArrayList<String>();
       source.addItem(groceryList, "Fruit");
       source.addItem(groceryList, "Vegetable");
       source.addItem(groceryList, "Beverages");
groceryList, 1, "Fruitss"
﻿groceryList, 1
groceryList, "Beverages"
groceryList
Sample Output

Item of index 1 has been modified.
Item of index 1 has been removed.
Beverages
2
NOTE
You can make suitable function calls and use RUN CODE button to check your main() method output.
EXECUTION TIME LIMIT
10 seconds
*/

import java.util.*;

public class Source {
   public void addItem(ArrayList<String> list, String item) {
      list.add(item);
   }

   public String modifyItem(ArrayList<String> list, int index, String newItem) {
      list.set(index, newItem);
      return "Item of index " + index + " has been modified.";
   }

   public String removeItem(ArrayList<String> list, int index) {
      list.remove(index);
      return "Item of index " + index + " has been removed.";
   }

   public String searchItem(ArrayList<String> list, String searchItem) {
       if (list.contains(searchItem)){
           return searchItem;
       }else{
           return "no such item";
       }
      
   }

   public int getSize(ArrayList<String> list) {
      return list.size();
   }
}

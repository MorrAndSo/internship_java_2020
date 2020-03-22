# internship_java_2020
Git repo for study purposes

    git clone https://github.com/IstrateCostelIulian/internship_java_2020.git

Va genera un folder nou la locatia unde ati executat comanda

Din **IntelliJ** sau **Eclipse**, creati proiect nou, din susra deja existenta, 
iar ca sursa sa fie locatia folderului nou creat. 

Acest proiect il putem folosi ca proiect comun, chiar si pentru incarcarea de teme sau
sugestii de exercitii.

Daca deja ati facut "**git clone**" pe proiect, 
acum pentru a aduce ultimele modificari, va rog sa faceti 
"**git pull origin master**" , sau puteti face acelasi lucru din 
*Eclipse* sau *IntelliJ*, click dreapta pe proiect, *Git > Repository > Pull*



##Core Interfaces in Collections
              Iterable
                 |
             Collection                    Map
           /     /      \                /      \
          /     /        \              /        \
        Set    List    Queue       SortedMap    HashMap
         |                              |          |
         |                              |          |
      SortedSet                      TreeMap   LinkedHashMap

######Note that this diagram only shows core interfaces.

##Iterable Interface
The Iterable interface is the root interface for all the collection classes. The Collection interface extends
the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface.
It contains only one abstract method. i.e.,
    
    Iterator<T> iterator()


###List Interface
List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store
the ordered collection of objects. It can have duplicate values.
**List** interface is implemented by the classes *ArrayList*, *LinkedList*, *Vector*, and *Stack*.

####Vector
Vector uses a dynamic array to store the data elements. It is similar to ArrayList.
However, It is synchronized and contains many methods that are not the part of Collection framework.

####Stack
The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack.
The stack contains all of the methods of Vector class and also provides its methods like boolean push(),
 boolean peek(), boolean push(object o), which defines its properties.

####ArrayList
The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types.
The ArrayList class maintains the insertion order and is non-synchronized.
The elements stored in the ArrayList class can be randomly accessed. Consider the following example.

####LinkedList
LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements.
It can store the duplicate elements. It maintains the insertion order and is not synchronized.
In LinkedList, the manipulation is fast because no shifting is required.
 

###Set Interface
Set Interface in Java is present in java.util package. It extends the Collection interface.
It represents the unordered set of elements which doesn't allow us to store the duplicate items.
We can store at most one null value in Set. Set is implemented by *HashSet*, *LinkedHashSet*, and *TreeSet*.

####LinkedHashSet
LinkedHashSet class represents the LinkedList implementation of Set Interface.
It extends the HashSet class and implements Set interface.
Like HashSet, It also contains unique elements. It maintains the insertion order and permits null elements.

####HashSet
HashSet class implements Set Interface. It represents the collection that uses a hash table for storage.
Hashing is used to store the elements in the HashSet. It contains unique items.

###SortedSet Interface
    SortedSet is the alternate of Set interface that provides a total ordering on its elements.
    The elements of the SortedSet are arranged in the increasing (ascending) order.
    The SortedSet provides the additional methods that inhibit the natural ordering of the elements.

####TreeSet
Java TreeSet class implements the Set interface that uses a tree for storage.
Like *HashSet*, *TreeSet* also contains unique elements. However, the access and retrieval time of TreeSet is quite fast.
The elements in TreeSet stored in ascending order.


###Map Interface
A Map doesn't allow duplicate keys, but you can have duplicate values.
**HashMap** and **LinkedHashMap** allow null keys and values, but TreeMap doesn't allow any null key or value.
A Map can't be traversed, so you need to convert it into Set using **keySet()** or **entrySet()** method.

####HashMap 
The HashMap provides constant time complexity for basic operations, get and put if the hash function is properly written and
it disperses the elements properly among the buckets. Iteration over HashMap depends on the capacity of HashMap and
a number of key-value pairs. Basically, it is directly proportional to the capacity + size.
Capacity is the number of buckets in HashMap. So it is not a good idea to keep a high number of buckets in HashMap initially.

####TreeMap
The TreeMap in Java is used to implement Map interface and NavigableMap along with the Abstract Class.
The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time,
depending on which constructor is used. This proves to be an efficient way of sorting and storing the key-value pairs.

####Comparator
Both **TreeSet** and **TreeMap** store elements in a sorted order.
However, it is the comparator that defines precisely what sorted order means.

More details :
 
    https://www.javatpoint.com/Comparator-interface-in-collection-framework

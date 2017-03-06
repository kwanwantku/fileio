#Speed of FileUtil Methods

Task                                             			| Time 
------------------------------------------------------------|---------------: 
1) Copy the file one byte at a time.       	     			| 5.148316 sec
2) Copy the file using a byte array of size 1 KB     		| 0.008163 sec 
3) Copy the file using a byte array of size 2 KB     		| 0.003758 sec 
4) Copy the file using a byte array of size 64 KB     		| 0.002067 sec
5) Copy the file using BufferedReader and PrintWriter.      | 0.073726 sec

##The result
---
The final result the first one is slowest because the convert only one byte and using a lot of time.*seperate paragraph*
The fastest one is number four because It's using a lot of byte to convert per second and make the runtime very fast.*seperate paragraph* The first time think that number five fastest because read each line but number four faster than it. *seperate paragraph* That's from the convertional of BufferReader that using the byte of array less than number four.



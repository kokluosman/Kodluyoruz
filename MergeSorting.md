# MERGE SORT PROJESİ
```
[16,21,11,8,12,22]
```
1. Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
```
   [16,21,11]              [8,12,22]
  [16,21] [11]            [8,12] [22]
 [16] [21] [11]          [8] [12] [22]
 [16] [11,21]            [8,12] [24]
 [11,16,21]              [8,12,24]
[8,11,12,16,21,24]
```
2. Big O gösterimini yazınız.
```
O(nlogn) olarak gösterilir. 6 adımda gerçekleştirildiği için
O(6.log6) olarak hesaplanır.
```